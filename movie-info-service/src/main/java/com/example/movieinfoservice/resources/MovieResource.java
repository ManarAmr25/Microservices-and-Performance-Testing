package com.example.movieinfoservice.resources;

import com.example.movieinfoservice.models.Movie;
import com.example.movieinfoservice.models.MovieSummary;
import com.mongodb.client.*;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/movies")
public class MovieResource {

    @Value("${api.key}")
    private String apiKey;

    private RestTemplate restTemplate;

    private MongoClient mongoClient;
    private MongoDatabase mongoDatabase;
    private MongoCollection<Document> mongoCollection;

    public MovieResource(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
        this.mongoClient = MongoClients.create("mongodb://localhost:27017");
        this.mongoDatabase = mongoClient.getDatabase("movies");
        this.mongoCollection = this.mongoDatabase.getCollection("movie");
    }

    @RequestMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") String movieId) {
        System.out.println("received a request with movie id = " + movieId);
        // Check MongoDB Cache
        Document query = new Document();
        query.put("id", movieId);
        Document res = this.mongoCollection.find(query).first();
        // if yes: return
        // if no: fetch from api, insert to cache, return
        if(res != null){ //cache hit
            System.out.println("cache hit");
            return new Movie(res.getString("id"), res.getString("title"), res.getString("summary"));
        }

        // Get the movie info from TMDB
        System.out.println("cache miss");
        final String url = "https://api.themoviedb.org/3/movie/" + movieId + "?api_key=" + apiKey;
        MovieSummary movieSummary = restTemplate.getForObject(url, MovieSummary.class);

        Document movie = new Document();
        movie.put("id", movieId);
        movie.put("title", movieSummary.getTitle());
        movie.put("summary", movieSummary.getOverview());
        this.mongoCollection.insertOne(movie);

        return new Movie(movieId, movieSummary.getTitle(), movieSummary.getOverview());
    }
}

package com.moviecatalogservice.resources;

import com.moviecatalogservice.models.CatalogItem;
import com.moviecatalogservice.models.Rating;
import com.moviecatalogservice.services.MovieInfoService;
import com.moviecatalogservice.services.TopRatingService;
import com.moviecatalogservice.services.UserRatingService;
import io.grpc.ManagedChannel;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    private final RestTemplate restTemplate;

    private final MovieInfoService movieInfoService;

    private final UserRatingService userRatingService;

    private final TopRatingService topRatingService;

    private final ManagedChannel channel;

    public MovieCatalogResource(RestTemplate restTemplate,
                                ManagedChannel channel,
                                MovieInfoService movieInfoService,
                                UserRatingService userRatingService,
                                TopRatingService topRatingService) {

        this.restTemplate = restTemplate;
        this.movieInfoService = movieInfoService;
        this.userRatingService = userRatingService;
        this.channel = channel;
        this.topRatingService = topRatingService;
    }

    /**
     * Makes a call to MovieInfoService to get movieId, name and description,
     * Makes a call to RatingsService to get ratings
     * Accumulates both data to create a MovieCatalog
     * @param userId
     * @return CatalogItem that contains name, description and rating
     */
    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable String userId) {
        List<Rating> ratings = userRatingService.getUserRating(userId).getRatings();
        return ratings.stream().map(movieInfoService::getCatalogItem).collect(Collectors.toList());
    }

    @RequestMapping("/topRating/{userId}")
    public List<CatalogItem> getTopRatingCatalog(@PathVariable String userId) {
        List<Rating> ratings = topRatingService.getTopRating(userId);
        return ratings.stream().map(movieInfoService::getCatalogItem).collect(Collectors.toList());
    }
}

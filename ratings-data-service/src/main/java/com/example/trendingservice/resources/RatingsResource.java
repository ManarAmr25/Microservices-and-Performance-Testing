package com.example.trendingservice.resources;

import com.example.trendingservice.models.Rating;
import com.example.trendingservice.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingsResource {

    @RequestMapping("/{userId}")
    public UserRating getRatingsOfUser(@PathVariable String userId) {
        DbAccess conn = new DbAccess();
        List<Rating> ratings = conn.getUserRatings(userId);

        return new UserRating(ratings);
    }
}

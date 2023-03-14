package com.example.trendingservice.resources;

import com.example.trendingservice.grpc.TopRatingGrpc;
import com.example.trendingservice.grpc.TopRatingReply;
import com.example.trendingservice.grpc.TopRatingRequest;
import com.example.trendingservice.models.Rating;
import com.example.trendingservice.models.UserRating;
import io.grpc.Channel;
import io.grpc.StatusRuntimeException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/topRatings")
public class RatingsResource {

    private final TopRatingGrpc.TopRatingBlockingStub blockingStub;

    /** Construct client for accessing HelloWorld server using the existing channel. */
    public RatingsResource(Channel channel) {
        // 'channel' here is a Channel, not a ManagedChannel, so it is not this code's responsibility to
        // shut it down.

        // Passing Channels to code makes code easier to test and makes it easier to reuse Channels.
        blockingStub = TopRatingGrpc.newBlockingStub(channel);
    }

    /** Say hello to server. */
    public UserRating getTopRating(String userId) {
        TopRatingRequest request = TopRatingRequest.newBuilder().setUserId(userId).build();
        TopRatingReply response;
        List<Rating> ratingOutput = new ArrayList<>();
        try {
            response = blockingStub.getTopRating(request);
            List<com.example.trendingservice.grpc.Rating> output = response.getRatingsList();
            for (com.example.trendingservice.grpc.Rating o : output){
                System.out.println(o.getMoveId()+" ----- "+o.getRate());
                ratingOutput.add(new Rating(o.getMoveId(),o.getRate()));
            }
        } catch (StatusRuntimeException e) {
            return null;
        }
        return new UserRating(ratingOutput);
    }
//    @RequestMapping("/{userId}")
//    public UserRating getRatingsOfUser(@PathVariable String userId) {
//        DbAccess conn = new DbAccess();
//        List<Rating> ratings = conn.getUserRattings(userId);
//
//        return new UserRating(ratings);
//    }
}

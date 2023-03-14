/*
 * Copyright 2015 The gRPC Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.moviecatalogservice.services;

import com.moviecatalogservice.grpc.Rating;
import com.moviecatalogservice.grpc.TopRatingGrpc;
import com.moviecatalogservice.grpc.TopRatingReply;
import com.moviecatalogservice.grpc.TopRatingRequest;
import io.grpc.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


@Service
public class TopRatingService {

  private final TopRatingGrpc.TopRatingBlockingStub blockingStub;

  /** Construct client for accessing HelloWorld server using the existing channel. */
  public TopRatingService(Channel channel) {
    // 'channel' here is a Channel, not a ManagedChannel, so it is not this code's responsibility to
    // shut it down.

    // Passing Channels to code makes code easier to test and makes it easier to reuse Channels.
    blockingStub = TopRatingGrpc.newBlockingStub(channel);
  }

  /** Say hello to server. */
  public List<com.moviecatalogservice.models.Rating> getTopRating(String userId) {
    TopRatingRequest request = TopRatingRequest.newBuilder().setUserId(userId).build();
    TopRatingReply response;
    List<com.moviecatalogservice.models.Rating> output = new ArrayList<>();
    try {
      response = blockingStub.getTopRating(request);
      List<Rating> responseOutput = response.getRatingsList();

      for (Rating o: responseOutput){
        output.add(new com.moviecatalogservice.models.Rating(o.getMoveId(),o.getRate()));
      }
    } catch (StatusRuntimeException e) {
      return output;
    }
    return output;
  }

  /**
   * Greet server. If provided, the first element of {@code args} is the name to use in the
   * greeting. The second argument is the target server.
   */
//  public static void main(String[] args) throws Exception {
//    String user = "1";
//    // Access a service running on the local machine on port 50051
//    String target = "localhost:50051";
//    // Allow passing in the user and target strings as command line arguments
//    if (args.length > 0) {
//      if ("--help".equals(args[0])) {
//        System.err.println("Usage: [name [target]]");
//        System.err.println("");
//        System.err.println("  name    The name you wish to be greeted by. Defaults to " + user);
//        System.err.println("  target  The server to connect to. Defaults to " + target);
//        System.exit(1);
//      }
//      user = args[0];
//    }
//    if (args.length > 1) {
//      target = args[1];
//    }
//
//    // Create a communication channel to the server, known as a Channel. Channels are thread-safe
//    // and reusable. It is common to create channels at the beginning of your application and reuse
//    // them until the application shuts down.
//    //
//    // For the example we use plaintext insecure credentials to avoid needing TLS certificates. To
//    // use TLS, use TlsChannelCredentials instead.
//    ManagedChannel channel = Grpc.newChannelBuilder(target, InsecureChannelCredentials.create())
//        .build();
//    try {
//      TopRatingService client = new TopRatingService(channel);
//      client.getTopRating(user);
//    } finally {
//      // ManagedChannels use resources like threads and TCP connections. To prevent leaking these
//      // resources the channel should be shut down when it will no longer be used. If it may be used
//      // again leave it running.
//      channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
//    }
//  }
}

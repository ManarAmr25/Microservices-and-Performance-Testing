import com.example.trendingservice.grpc.TopRatingServer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.io.IOException;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EnableEurekaClient
@EnableCircuitBreaker

public class TrendingMoviesServiceApplication {

    public static void main(String[] args) throws IOException, InterruptedException {
        final TopRatingServer server = new TopRatingServer();
        server.start();
        server.blockUntilShutdown();
    }
}

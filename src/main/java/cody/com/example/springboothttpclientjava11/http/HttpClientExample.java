package cody.com.example.springboothttpclientjava11.http;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import static java.time.temporal.ChronoUnit.SECONDS;

public class HttpClientExample {
    public HttpClientExample(){
    }
j
    public void sendHttpRequest(){
        try{
            HttpRequest request = HttpRequest.newBuilder(new URI("http://localhost:8081/hello"))
                    .version(HttpClient.Version.HTTP_2)
                    .timeout(Duration.of(10L,SECONDS))
                    .header("Content-Type","application/json")
                    .header("head-key","header-value")
                    .GET()
                    .build();

            HttpClient client = HttpClient.newBuilder()
                    .build();

            HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.statusCode());
            System.out.println(response.body());

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

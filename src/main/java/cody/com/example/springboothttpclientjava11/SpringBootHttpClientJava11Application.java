package cody.com.example.springboothttpclientjava11;

import cody.com.example.springboothttpclientjava11.http.HttpClientExample;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootHttpClientJava11Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHttpClientJava11Application.class, args);

		HttpClientExample httpClientExample = new HttpClientExample();
		httpClientExample.sendHttpRequest();
	}

}

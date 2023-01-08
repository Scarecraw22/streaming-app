package io.github.scarecraw22.sa.streaming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SaStreamingApp {

    public static void main(String[] args) {
        SpringApplication.run(SaStreamingApp.class, args);
    }
}

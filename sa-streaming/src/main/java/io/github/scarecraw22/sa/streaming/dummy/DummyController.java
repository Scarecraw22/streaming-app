package io.github.scarecraw22.sa.streaming.dummy;

import com.netflix.discovery.EurekaClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class DummyController {

    private final SaUserClient saUserClient;

    @Value("${spring.application.name}")
    private String appName;

    @RequestMapping("/greeting")
    @GetMapping
    public String greeting() {
        String greeting = saUserClient.greeting();
        log.info("Greeting from sa-user-service: {}", greeting);

        return "Hello from app: " + appName;
    }
}

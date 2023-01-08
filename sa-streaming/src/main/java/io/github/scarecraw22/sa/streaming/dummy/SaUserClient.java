package io.github.scarecraw22.sa.streaming.dummy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("sa-user")
public interface SaUserClient {

    @GetMapping("/users/greeting")
    String greeting();
}

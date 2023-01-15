package io.github.scarecraw22.sa.user.getUsers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
class UsersController {

    @GetMapping
    String getUsers() {
        return "Hello from users";
    }
}

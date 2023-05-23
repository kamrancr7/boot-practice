package org.example;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostRequest {

    @PostMapping("/user")
    public UserResponse createUser(@RequestBody UserRequest userRequest) {
        // Process the userRequest and create a new user
        User newUser = new User(userRequest.getName(), userRequest.getEmail());

        // Return the response as JSON
        UserResponse userResponse = new UserResponse(newUser.getId(), newUser.getName(), newUser.getEmail());
        return userResponse;
    }
}

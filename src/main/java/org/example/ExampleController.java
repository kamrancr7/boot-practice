package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @GetMapping("/hello")
    public ExampleResponse getHello() {
        ExampleResponse response = new ExampleResponse();
        response.setMessage("Hello, World!");
        return response;
    }
}

class ExampleResponse {
    private String message;

    // Getter and Setter for the message field

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

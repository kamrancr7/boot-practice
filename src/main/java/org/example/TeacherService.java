package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherService {

    @GetMapping("/teacher")
    public TeacherResponse getHello() {
        TeacherResponse response = new TeacherResponse();
        response.setId("4");
        response.setName("Teacher 3");
        response.setAge("30");
        response.setSubject("English");
        return response;
    }
}

class TeacherResponse {
    private String id;
    private String name;
    private String age;
    private String subject;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}

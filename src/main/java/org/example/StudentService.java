package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentService {

    @GetMapping("/student")
    public StudentResponse getHello() {
        StudentResponse response = new StudentResponse();
        response.setId("1");
        response.setName("Kamran");
        response.setAge("30");
        response.setContactNumber("03111035294");
        response.setEmailAddress("kamran.ali7293@gmail.com");
        response.setAddress("ABC street");
        return response;
    }
}

class StudentResponse {
    private String id;
    private String name;
    private String age;
    private String contactNumber;
    private String emailAddress;
    private String address;

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

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

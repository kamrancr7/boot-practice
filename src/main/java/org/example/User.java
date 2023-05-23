package org.example;

class User {
    private String id;
    private String name;
    private String email;

    public User(String name, String email) {
        this.id = "1"; // This is just an example, you would generate a unique ID for a new user
        this.name = name;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
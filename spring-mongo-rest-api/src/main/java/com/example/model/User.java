package com.example.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;


@Document
public class User {

    @Id
    private String id;
    private String name;
    private String email;
    private HashMap details;

    public User(String id, String name, String email, HashMap details) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.details = details;
    }

    public User() {
    }


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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public HashMap getDetails() {
        return details;
    }

    public void setDetails(HashMap details) {
        this.details = details;
    }


}

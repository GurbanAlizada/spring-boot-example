package com.example.springresttemplate.api;

import com.example.springresttemplate.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {

    private final RestTemplate restTemplate;

    public RestController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/rest/template/users")
    public ResponseEntity<List<User>> users(@RequestBody User user){
        ResponseEntity<List> result = restTemplate.getForEntity("http://localhost:8080/api/users", List.class);
        List<User> responseBody = result.getBody();
        return ResponseEntity.ok(responseBody);
    }

    @PostMapping("/api/rest/template/save")
    public ResponseEntity<User> save(@RequestBody User user){
        ResponseEntity<User> result = restTemplate.postForEntity("http://localhost:8080/api/save", user, User.class);
        User responseBody = result.getBody();
        return ResponseEntity.ok(responseBody);
    }




}

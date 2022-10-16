package com.example.api;


import com.example.model.User;
import com.example.repo.UserRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserApi {

    private final UserRepo userRepo;

    public UserApi(UserRepo userRepo) {
        this.userRepo = userRepo;
    }


    @PostMapping("/save")
    public ResponseEntity<User> save(User user){
        var fromDb  = userRepo.save(user);
        return ResponseEntity.ok(fromDb);
    }


    @GetMapping("/users")
    public ResponseEntity<List<User>> users(){
        return ResponseEntity.ok(userRepo.findAll());
    }




}

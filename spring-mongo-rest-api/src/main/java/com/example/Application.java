package com.example;


import com.example.model.User;
import com.example.repo.UserRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.HashMap;

@SpringBootApplication
@EnableMongoRepositories
public class Application implements CommandLineRunner {

    private final UserRepo userRepo;

    public Application(UserRepo userRepo) {
        this.userRepo = userRepo;
    }


    public static void main(String[] args) {


        SpringApplication.run(Application.class , args);

    }

    @Override
    public void run(String... args) throws Exception {
        HashMap<String ,String> hashMap = new HashMap<>();
        hashMap.put("phone" , "34232442");
        User user = new User("Fenerbahce" , "Qurban" , "asdf" , hashMap);
        userRepo.save(user);
    }
}

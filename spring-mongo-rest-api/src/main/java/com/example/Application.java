package com.example;


import com.example.model.User;
import com.example.repo.UserRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

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
        User user = new User("1" , "Qurban" , "asdf" , null);
        userRepo.save(user);
    }
}

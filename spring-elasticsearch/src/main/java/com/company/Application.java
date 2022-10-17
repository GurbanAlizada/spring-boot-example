package com.company;


import com.company.model.Person;
import com.company.repo.PersonRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

import java.util.Date;


@SpringBootApplication
@EnableElasticsearchRepositories
@RequiredArgsConstructor
public class Application implements CommandLineRunner {

    private final PersonRepo personRepo;

    public static void main(String[] args) {

        SpringApplication.run(Application.class , args);

    }

    @Override
    public void run(String... args) throws Exception {
        Person person = new Person("6" , "Qurban" , "Alizada" , new Date(System.currentTimeMillis()));
        personRepo.save(person);
        Person person2 = new Person("7" , "Gunes" , "Alizada" , new Date(System.currentTimeMillis()));

        Person person3 = new Person("8" , "Murad" , "Alizada" , new Date(System.currentTimeMillis()));

        personRepo.save(person2);
        personRepo.save(person3);
    }
}

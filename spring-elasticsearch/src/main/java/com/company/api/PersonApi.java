package com.company.api;


import com.company.model.Person;
import com.company.repo.PersonRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/person")
public class PersonApi {

    private final PersonRepo personRepo;

    public PersonApi(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }




    @GetMapping("/{search}")
    public ResponseEntity<List<Person>> getUsers(@PathVariable String search){
        return ResponseEntity.ok(personRepo.getByCustomQuery(search));
    }



}

package com.example.springrediscache.api;

import com.example.springrediscache.service.ExampleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ExampleRestController {


    private static int count = 0 ;
    private final ExampleService exampleService;

    public ExampleRestController(ExampleService exampleService) {

        this.exampleService = exampleService;
    }


    @GetMapping("/get")
    public String get() throws Exception{
        if (count == 5){
            exampleService.killCache();
            count = 0;
        }
        count++;
        return exampleService.foo();
    }



}

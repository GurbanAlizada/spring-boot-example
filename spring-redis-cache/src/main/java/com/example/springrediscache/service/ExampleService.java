package com.example.springrediscache.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class ExampleService {


    @Cacheable(cacheNames = "fooMethodCache")
    public String foo() throws Exception{
        Thread.sleep(5000);
        return "foo";
    }


    @CacheEvict(cacheNames = "fooMethodCache" )
    public void killCache(){
        System.out.println("Killed cache");
    }


}

package com.example.api;


import com.example.model.Product;
import com.example.repo.ProductRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ProductApi {

    private final ProductRepo productRepo;


    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAll(){
        return ResponseEntity.ok(productRepo.findAll());

    }



}

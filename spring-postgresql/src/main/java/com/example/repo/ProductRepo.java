package com.example.repo;

import com.example.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo  extends JpaRepository<Product , Integer> {


}

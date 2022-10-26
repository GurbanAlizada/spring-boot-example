package com.example.repo;

import com.example.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo  extends JpaRepository<Category, Integer> {
}

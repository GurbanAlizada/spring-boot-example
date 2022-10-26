package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Product implements Serializable {

    @Id
    @SequenceGenerator(name = "productt", initialValue = 200,allocationSize = 1)
    @GeneratedValue(generator = "productt", strategy = GenerationType.SEQUENCE)    private int id;

    private String  productName ;

    private String details;

    private double price;


    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;


    public Product(int id, String productName, String details, double price) {
        this.id = id;
        this.productName = productName;
        this.details = details;
        this.price = price;
    }
}

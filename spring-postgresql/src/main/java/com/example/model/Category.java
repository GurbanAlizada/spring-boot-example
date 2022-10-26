package com.example.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Category implements Serializable {


    @Id
    @SequenceGenerator(name = "categoryy", initialValue = 300, allocationSize = 1)
    @GeneratedValue(generator = "categoryy", strategy = GenerationType.SEQUENCE)
    private int id;


    private String categoryName;


    @OneToMany(mappedBy = "category")
    @JsonIgnore
    private List<Product> products ;

    public Category( String categoryName) {
        this.categoryName = categoryName;
    }
}

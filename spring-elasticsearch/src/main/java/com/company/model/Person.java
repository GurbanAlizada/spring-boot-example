package com.company.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "person" , type = "person")
public class Person {

    @Id
    private String id;

    @Field(name = "name" , type = FieldType.Text)
    private String name;

    @Field(name = "surname" , type = FieldType.Text)
    private String surname;

    @Field(name = "dateOfBirth" , type = FieldType.Date)
    private Date dateOfBirth;




}

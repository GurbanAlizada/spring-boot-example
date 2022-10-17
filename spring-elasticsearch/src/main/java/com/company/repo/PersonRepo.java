package com.company.repo;

import com.company.model.Person;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface PersonRepo extends ElasticsearchRepository<Person , String> {

    @Query("{\"bool\": {\"must\": [{\"match\": {\"name\": \"?0\"}}]}}")
    List<Person> getByCustomQuery(String search);


    List<Person>  findByNameLikeOrSurnameLike(String ad, String soyad);



}

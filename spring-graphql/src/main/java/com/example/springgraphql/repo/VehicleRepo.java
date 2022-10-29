package com.example.springgraphql.repo;

import com.example.springgraphql.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VehicleRepo extends JpaRepository<Vehicle , Long > {

    List<Vehicle> getByTypeLike(String type);


}

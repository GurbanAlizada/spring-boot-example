package com.example.springgraphql.api;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.springgraphql.dto.VehicleDto;
import com.example.springgraphql.model.Vehicle;
import com.example.springgraphql.repo.VehicleRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class VehicleQueryResolver implements GraphQLQueryResolver {

    private final VehicleRepo vehicleRepo;

    public List<Vehicle> getVehicles(String type){
        List<Vehicle> fromDb  =  vehicleRepo.getByTypeLike(type);
        return  fromDb;
    }


    public Vehicle getById(Long id){
        Optional<Vehicle> vehicle = vehicleRepo.findById(id);
        return vehicle.get();
    }




}

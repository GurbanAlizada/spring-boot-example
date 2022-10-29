package com.example.springgraphql.api;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.springgraphql.dto.VehicleDto;
import com.example.springgraphql.model.Vehicle;
import com.example.springgraphql.repo.VehicleRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.sql.Date;


@Component
@RequiredArgsConstructor
public class VehicleMutationResolver implements GraphQLMutationResolver {

    private final VehicleRepo vehicleRepo;

   public Vehicle createVehicle(VehicleDto vehicle){

        Vehicle result = Vehicle.builder()
                .brandName(vehicle.getBrandName())
                .launchDate(new Date(System.currentTimeMillis()))
                .type(vehicle.getType())
                .modelCode(vehicle.getModelCode())
                .build();

        return vehicleRepo.save(result);
    }




}

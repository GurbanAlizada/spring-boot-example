package com.example.springbootevents.service;

import com.example.springbootevents.dtos.HotelBookRequest;
import com.example.springbootevents.event.ReservationCreatedEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {

    private final ApplicationEventPublisher applicationEventPublisher;

    public ReservationService(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }



    @Async
    public void publishReservationEvent(HotelBookRequest hotelBookRequest){
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        applicationEventPublisher.publishEvent(new ReservationCreatedEvent(hotelBookRequest));
    }


}
package com.example.springbootevents.event.listener;


import com.example.springbootevents.event.ReservationCreatedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ReservationEventListener {

    @EventListener
    public void reservationEventHandler(ReservationCreatedEvent reservationCreatedEvent) throws InterruptedException{
        Thread.sleep(5000L);
        System.out.println("EventListener-> " + reservationCreatedEvent.getSource().toString());
    }


}
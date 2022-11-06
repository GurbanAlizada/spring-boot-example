package com.example.springbootevents.api;


import com.example.springbootevents.dtos.HotelBookRequest;
import com.example.springbootevents.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookingApi {

    private final ReservationService reservationService;

    public BookingApi(ReservationService reservationService) {
        this.reservationService = reservationService;
    }


    @PostMapping
    public void bookHotel(@RequestBody HotelBookRequest hotelBookRequest){
        reservationService.publishReservationEvent(hotelBookRequest);
        System.out.println(" Kullanici Istegi isleme alindi." + hotelBookRequest);
    }



}
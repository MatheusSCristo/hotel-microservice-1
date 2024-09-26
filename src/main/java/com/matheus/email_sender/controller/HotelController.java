package com.matheus.email_sender.controller;

import com.matheus.email_sender.dto.hotel.HotelCreateDto;
import com.matheus.email_sender.model.Hotel;
import com.matheus.email_sender.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    private HotelService hotelService;


    @GetMapping
    public ResponseEntity<Hotel> findHotelById(@RequestParam String id){
        return ResponseEntity.ok().body(hotelService.findHotelById(id));
    }

    @PostMapping
    public ResponseEntity<Hotel> createHotel(@RequestBody @Validated HotelCreateDto hotelCreateDto){
        return ResponseEntity.ok().body(hotelService.createHotel(hotelCreateDto));
    }
}

package com.matheus.email_sender.controller;

import com.matheus.email_sender.dto.reservation.ReservationCreateDto;
import com.matheus.email_sender.dto.reservation.ReservationResponseDto;
import com.matheus.email_sender.model.Hotel;
import com.matheus.email_sender.model.Reservation;
import com.matheus.email_sender.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reservation")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @GetMapping
    public ResponseEntity<Reservation> findReservationById(@RequestParam String id){
        return ResponseEntity.ok().body(reservationService.findReservationById(id));
    }

    @PostMapping
    public ResponseEntity<ReservationResponseDto> createReservation(@RequestBody ReservationCreateDto reservationCreateDto){
        return ResponseEntity.ok().body(new ReservationResponseDto(reservationService.createReservation(reservationCreateDto)));
    }

}



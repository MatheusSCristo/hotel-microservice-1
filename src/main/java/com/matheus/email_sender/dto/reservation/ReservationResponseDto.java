package com.matheus.email_sender.dto.reservation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.matheus.email_sender.dto.client.ClientResponseDto;
import com.matheus.email_sender.dto.hotel.HotelResponseDto;
import com.matheus.email_sender.model.Hotel;
import com.matheus.email_sender.model.Reservation;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ReservationResponseDto {
    private String id;
    private HotelResponseDto hotel;
    private ClientResponseDto client;
    private LocalDateTime date;

    public ReservationResponseDto(Reservation reservation){
        this.id=reservation.getId();
        this.hotel=new HotelResponseDto(reservation.getHotel());
        this.client=new ClientResponseDto(reservation.getClient());
        this.date=reservation.getDate();
    }
}

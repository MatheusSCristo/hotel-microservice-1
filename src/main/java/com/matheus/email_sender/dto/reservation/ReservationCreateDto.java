package com.matheus.email_sender.dto.reservation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.matheus.email_sender.model.Client;
import com.matheus.email_sender.model.Hotel;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ReservationCreateDto {
    @JsonProperty("hotel_id")
    private String hotelId;
    private LocalDateTime date;
    @JsonProperty("client_id")
    private String clientId;

}

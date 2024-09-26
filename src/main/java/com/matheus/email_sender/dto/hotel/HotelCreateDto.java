package com.matheus.email_sender.dto.hotel;

import lombok.Data;

@Data
public class HotelCreateDto {
    private String name;
    private String cep;
    private String city;
}

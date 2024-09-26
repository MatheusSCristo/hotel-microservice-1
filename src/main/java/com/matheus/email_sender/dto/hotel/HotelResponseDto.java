package com.matheus.email_sender.dto.hotel;

import com.matheus.email_sender.model.Hotel;
import lombok.Data;

@Data
public class HotelResponseDto {
    private String id;
    private String name;
    private String cep;
    private String city;

    public HotelResponseDto(Hotel hotel) {
        this.id=hotel.getId();
        this.name=hotel.getName();
        this.cep=hotel.getCep();
        this.city=hotel.getCity();
    }
}

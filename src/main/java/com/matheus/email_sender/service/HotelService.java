package com.matheus.email_sender.service;

import com.matheus.email_sender.dto.hotel.HotelCreateDto;
import com.matheus.email_sender.infra.exceptions.HotelNotFoundException;
import com.matheus.email_sender.model.Hotel;
import com.matheus.email_sender.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    public Hotel createHotel(HotelCreateDto hotelCreateDto) {
        Hotel hotel = new Hotel(hotelCreateDto);
        return hotelRepository.save(hotel);
    }

    public Hotel findHotelById(String hotelId) {
        return hotelRepository.findById(hotelId).orElseThrow(() -> new HotelNotFoundException(hotelId));
    }


}

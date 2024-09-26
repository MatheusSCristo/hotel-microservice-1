package com.matheus.email_sender.service;

import com.matheus.email_sender.dto.reservation.ReservationCreateDto;
import com.matheus.email_sender.infra.exceptions.ReservationNotFoundException;
import com.matheus.email_sender.model.Client;
import com.matheus.email_sender.model.Hotel;
import com.matheus.email_sender.model.Reservation;
import com.matheus.email_sender.repository.ClientRepository;
import com.matheus.email_sender.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;
    @Autowired
    private ClientService clientService;
    @Autowired
    private HotelService hotelService;

    public Reservation createReservation(ReservationCreateDto reservationCreateDto) {
        Hotel hotel = hotelService.findHotelById(reservationCreateDto.getHotelId());
        Client client = clientService.findClientById(reservationCreateDto.getClientId());
        Reservation reservation = new Reservation(reservationCreateDto.getDate(), hotel, client);
        return reservationRepository.save(reservation);
    }

    public Reservation findReservationById(String reservationId){
        return reservationRepository.findById(reservationId).orElseThrow(()->new ReservationNotFoundException(reservationId));
    }

}

package com.matheus.email_sender.infra.exceptions;

public class ReservationNotFoundException extends RuntimeException{

    public ReservationNotFoundException(String id){
        super("Reservation with id: " + id + " was not found");
    }
}

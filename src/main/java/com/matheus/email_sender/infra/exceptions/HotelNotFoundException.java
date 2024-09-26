package com.matheus.email_sender.infra.exceptions;

public class HotelNotFoundException extends RuntimeException{
    public HotelNotFoundException(String id){
        super("Hotel with id: "+id+" was not found");
    }
}

package com.matheus.email_sender.infra.exceptions;

public class ClientNotFoundException extends RuntimeException {
    public ClientNotFoundException(String id) {
        super("Client with id: " + id + " was not found!");
    }
}

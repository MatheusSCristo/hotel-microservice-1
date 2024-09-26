package com.matheus.email_sender.controller;

import com.matheus.email_sender.dto.client.ClientCreateDto;
import com.matheus.email_sender.model.Client;
import com.matheus.email_sender.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping
    public ResponseEntity<Client> findClientById(@RequestParam String id) {
        return ResponseEntity.ok().body(clientService.findClientById(id));
    }

    @PostMapping
    public ResponseEntity<Client> createClient(@RequestBody @Validated ClientCreateDto clientCreateDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(clientService.createClient(clientCreateDto));
    }

}

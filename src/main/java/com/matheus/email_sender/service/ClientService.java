package com.matheus.email_sender.service;

import com.matheus.email_sender.dto.client.ClientCreateDto;
import com.matheus.email_sender.infra.exceptions.ClientNotFoundException;
import com.matheus.email_sender.model.Client;
import com.matheus.email_sender.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public Client createClient(ClientCreateDto clientCreateDto) {
        Client client = new Client(clientCreateDto);
        return clientRepository.save(client);
    }

    public Client findClientById(String clientId) {
        return clientRepository.findById(clientId).orElseThrow(() -> new ClientNotFoundException(clientId));
    }


}

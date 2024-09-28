package com.matheus.email_sender.service;

import com.matheus.email_sender.model.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageService {


    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessageOnReservation(Reservation reservation) {
        kafkaTemplate.send("teste", reservation.getId());
    }


}

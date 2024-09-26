package com.matheus.email_sender.model;

import com.matheus.email_sender.dto.reservation.ReservationCreateDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "reservation")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @ManyToOne
    private Hotel hotel;
    private LocalDateTime date;
    private Client client;

    public Reservation(LocalDateTime date,Hotel hotel,Client client){
        this.hotel=hotel;
        this.client=client;
        this.date=date;

    }

}

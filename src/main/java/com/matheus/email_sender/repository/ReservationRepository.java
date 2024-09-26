package com.matheus.email_sender.repository;

import com.matheus.email_sender.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation,String> {
}

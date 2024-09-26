package com.matheus.email_sender.repository;

import com.matheus.email_sender.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel,String> {
}

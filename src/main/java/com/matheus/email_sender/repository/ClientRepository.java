package com.matheus.email_sender.repository;

import com.matheus.email_sender.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,String> {
}

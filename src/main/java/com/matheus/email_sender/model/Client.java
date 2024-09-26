package com.matheus.email_sender.model;

import com.matheus.email_sender.dto.client.ClientCreateDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "client")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private String email;
    private Integer age;

    public Client(ClientCreateDto clientCreateDto){
        this.name=clientCreateDto.getName();
        this.email=clientCreateDto.getEmail();
        this.age=clientCreateDto.getAge();
    }

}

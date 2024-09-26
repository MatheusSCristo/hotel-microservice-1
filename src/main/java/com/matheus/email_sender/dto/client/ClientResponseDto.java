package com.matheus.email_sender.dto.client;

import com.matheus.email_sender.model.Client;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ClientResponseDto {
    private String id;
    private String name;
    private String email;
    private Integer age;

    public ClientResponseDto(Client client) {
        this.id=client.getId();
        this.name=client.getName();
        this.email=client.getEmail();
        this.age=client.getAge();
    }
}

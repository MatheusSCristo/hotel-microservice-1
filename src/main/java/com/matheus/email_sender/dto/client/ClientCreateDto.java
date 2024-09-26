package com.matheus.email_sender.dto.client;

import lombok.Data;

@Data
public class ClientCreateDto {
    private String name;
    private String email;
    private Integer age;
}

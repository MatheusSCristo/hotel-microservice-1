package com.matheus.email_sender.dto.client;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ClientCreateDto {
    @NotBlank
    private String name;
    @NotBlank
    private String email;
    @NotNull
    @Min(18)
    private Integer age;
}

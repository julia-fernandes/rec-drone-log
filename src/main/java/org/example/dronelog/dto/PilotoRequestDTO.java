package org.example.dronelog.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record PilotoRequestDTO(

        @NotBlank(message = "*Campo obrigatório")
        String nome,

        @NotNull(message = "*Campo obrigatório")
        Integer registroAnac,

        String email,

        @NotNull(message = "*Campo obrigatório")
        Boolean ativo
) {}

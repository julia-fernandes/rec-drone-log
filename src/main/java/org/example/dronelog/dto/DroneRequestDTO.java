package org.example.dronelog.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DroneRequestDTO(

        @NotBlank(message = "*Campo obrigatório")
        String identificador,

        @NotBlank(message = "*Campo obrigatório")
        String modelo,

        @NotNull(message = "*Campo obrigatório")
        Integer autonomiaMinutos,

        @NotBlank(message = "*Campo obrigatório")
        Boolean disponivel
) {
}

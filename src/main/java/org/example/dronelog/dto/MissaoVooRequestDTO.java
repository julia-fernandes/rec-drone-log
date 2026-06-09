package org.example.dronelog.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import org.example.dronelog.model.StatusMissao;

import java.time.LocalDate;

public record MissaoVooRequestDTO(

        @NotBlank(message = "*Campo obrigatório")
        String titulo,

        @NotBlank(message = "*Campo obrigatório")
        String localOperacao,

        @NotNull(message = "*Campo obrigatório")
        LocalDate dataPrevista,

        @NotNull(message = "*Campo obrigatório")
        @Positive
        Double areaMapeadaKm2,

        @NotNull(message = "*Campo obrigatório")
        StatusMissao status
) {
}

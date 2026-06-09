package org.example.dronelog.dto;

public record PilotoResponseDTO(

        Long idPiloto,
        String nome,
        Integer registroAnac,
        String email,
        Boolean ativo
) {}

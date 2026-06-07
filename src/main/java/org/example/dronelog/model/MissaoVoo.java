package org.example.dronelog.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class MissaoVoo {

    //TODO: garantir integridade de PK para os registros da entidade.
    private Long idMissao;

    private String titulo;

    private String localOperacao;

    private LocalDate dataPrevista;

    private Double areaMapeadaKm2;

    @Enumerated(EnumType.STRING)
    private StatusMissao status;

    // TODO: relacionar corretamente com o responsável pela operação.
    @JoinColumn(name = "")
    private Piloto piloto;

    // TODO: relacionar corretamente com o equipamento/drone utilizado.

    public MissaoVoo() {
    }

    // TODO: completar os métodos de acesso necessários para uso nas camadas da API.
}

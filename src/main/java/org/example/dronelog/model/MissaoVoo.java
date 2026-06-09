package org.example.dronelog.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "TBMISSAO")
public class MissaoVoo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMissao;

    private String titulo;

    private String localOperacao;

    private LocalDate dataPrevista;

    private Double areaMapeadaKm2;

    @Enumerated(EnumType.STRING)
    private StatusMissao status;


    @JoinColumn(name = "idPiloto")
    private Piloto piloto;


    @ManyToOne
    @JoinColumn(name = "idDrone")
    private Drone drone;

}

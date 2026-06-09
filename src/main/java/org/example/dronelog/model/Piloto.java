package org.example.dronelog.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "TBPILOTO")
public class Piloto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPiloto;

    private String nome;

    private Integer registroAnac;

    private String email;

    private Boolean ativo;

    @OneToMany(mappedBy = "piloto")
    private List<MissaoVoo> missoes = new ArrayList<>();

}

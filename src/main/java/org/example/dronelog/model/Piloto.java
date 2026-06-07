package org.example.dronelog.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

//TODO: transformar em entidade e colocar métodos de acesso.
public class Piloto {

    private Long idPiloto;

    //TODO: colocar atributos: nome, registroAnac, email, ativo(boolean)

    // TODO: revisar a ligação com os registros que dependem deste piloto.
    @OneToMany(mappedBy = "piloto")
    private List<MissaoVoo> missoes = new ArrayList<>();

    public Piloto() {
    }
}

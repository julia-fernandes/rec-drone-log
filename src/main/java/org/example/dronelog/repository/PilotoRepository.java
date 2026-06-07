package org.example.dronelog.repository;

import org.example.dronelog.model.Piloto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PilotoRepository extends JpaRepository<Piloto, Long> {

    // TODO: criar uma consulta simples para apoiar a listagem.
}

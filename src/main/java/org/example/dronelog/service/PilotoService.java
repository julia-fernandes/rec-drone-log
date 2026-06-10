//package org.example.dronelog.service;
//
//import org.example.dronelog.dto.PilotoRequestDTO;
//import org.example.dronelog.dto.PilotoResponseDTO;
//import org.example.dronelog.model.Piloto;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class PilotoService {
//
//    //TODO: colocar construtor para chamar métodos.
//
//    public List<PilotoResponseDTO> listar(String nome) {
//        // TODO: usar o parâmetro recebido quando fizer sentido.
//        return pilotoRepository.findAll().stream().map(this::toResponse).toList();
//    }
//
//    public PilotoResponseDTO buscarPorId(Long id) {
//        Piloto piloto = buscarPiloto(id);
//        return toResponse(piloto);
//    }
//
//    public PilotoResponseDTO cadastrar(PilotoRequestDTO dto) {
//        Piloto piloto = new Piloto();
//
//        // TODO: transportar os dados recebidos para a entidade.
//
//        return toResponse(pilotoRepository.save(piloto));
//    }
//
//    public PilotoResponseDTO atualizar(Long id, PilotoRequestDTO dto) {
//        Piloto piloto = buscarPiloto(id);
//
//        // TODO: atualizar os campos corretos sem criar outro registro.
//
//        return toResponse(pilotoRepository.save(piloto));
//    }
//
//    public void deletar(Long id) {
//        Piloto piloto = buscarPiloto(id);
//
//        // TODO: decidir como tratar pilotos com missões vinculadas.
//        pilotoRepository.delete(piloto);
//    }
//
//    public Piloto buscarPiloto(Long id) {
//        //TODO: fazer o return.
//        return null;
//    }
//
//    private PilotoResponseDTO toResponse(Piloto piloto) {
//        // TODO: montar o DTO de saída com os dados necessários.
//        return new PilotoResponseDTO(
//                piloto.getIdPiloto(),
//                null,
//                null,
//                null,
//                null
//        );
//    }
//}

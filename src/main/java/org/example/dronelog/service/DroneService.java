package org.example.dronelog.service;

import org.example.dronelog.dto.DroneRequestDTO;
import org.example.dronelog.dto.DroneResponseDTO;
import org.example.dronelog.exception.RecursoNaoEncontradoException;
import org.example.dronelog.model.Drone;
import org.example.dronelog.repository.DroneRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DroneService {

    private final DroneRepository droneRepository;

    public DroneService(DroneRepository droneRepository) {
        this.droneRepository = droneRepository;
    }

    //conversão para ResponseDTO OK
    private DroneResponseDTO toResponse(Drone drone) {

        return new DroneResponseDTO(
                drone.getIdDrone(),
                drone.getIdentificador(),
                drone.getModelo(),
                drone.getAutonomiaMinutos(),
                drone.getDisponivel()
        );
    }

    public Drone buscarEntidadeDrone(Long id) {
        return droneRepository.findById(id)
                .orElseThrow(() -> new RecursoNaoEncontradoException("Drone não encontrado."));
    }


    public List<DroneResponseDTO> listarDroneDisponivel(Boolean disponivel) {
        List<Drone> drones;

        if (disponivel == null) {
            drones = droneRepository.findAll();
        } else {
            drones = droneRepository.findByDisponivel(disponivel);
        }

        return drones.stream().map(this::toResponse).toList();
    }

    public DroneResponseDTO buscarPorId(Long id) {
        return toResponse(buscarEntidadeDrone(id));
    }

    public DroneResponseDTO cadastrar(DroneRequestDTO dto) {

        Drone drone = new Drone();
        drone.setIdentificador(dto.identificador());
        drone.setModelo(dto.modelo());
        drone.setAutonomiaMinutos(dto.autonomiaMinutos());
        drone.setDisponivel(dto.disponivel() != null ? dto.disponivel() : true);

        return toResponse(droneRepository.save(drone));
    }

    public DroneResponseDTO atualizar(Long id, DroneRequestDTO dto) {
        Drone drone = buscarEntidadeDrone(id);

        drone.setIdentificador(dto.identificador());
        drone.setModelo(dto.modelo());
        drone.setAutonomiaMinutos(dto.autonomiaMinutos());
        drone.setDisponivel(dto.disponivel());


        return toResponse(droneRepository.save(drone));
    }

    public void deletar(Long id) {
        Drone drone = buscarEntidadeDrone(id);

        if(drone.getMissoes().isEmpty()){
            droneRepository.delete(drone);

        }
        droneRepository.findById(id).orElseThrow(() -> new RecursoNaoEncontradoException("*Drone possui histórico de missões"));
    }
}

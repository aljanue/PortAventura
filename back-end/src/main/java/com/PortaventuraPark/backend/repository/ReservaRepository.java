package com.PortaventuraPark.backend.repository;

import com.PortaventuraPark.backend.model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {
    List<Reserva> findByPersonaAndEstado(int idPersona, int i);

    List<Reserva> findByAtraccion(int idAtraccion);

}

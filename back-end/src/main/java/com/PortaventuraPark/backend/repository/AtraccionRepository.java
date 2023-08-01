package com.PortaventuraPark.backend.repository;

import com.PortaventuraPark.backend.model.Atraccion;
import com.PortaventuraPark.backend.model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AtraccionRepository extends JpaRepository<Atraccion, Long> {
    List<Atraccion> findByZona(int zona);

}

package com.PortaventuraPark.backend.repository;

import com.PortaventuraPark.backend.model.Persona;
import com.PortaventuraPark.backend.model.Zona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ZonaRepository extends JpaRepository<Zona, Long> {
}

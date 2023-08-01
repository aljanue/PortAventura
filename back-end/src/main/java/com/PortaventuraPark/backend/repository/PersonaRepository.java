package com.PortaventuraPark.backend.repository;

import com.PortaventuraPark.backend.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}

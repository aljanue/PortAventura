package com.PortaventuraPark.backend.service;

import com.PortaventuraPark.backend.model.Persona;
import com.PortaventuraPark.backend.repository.PersonaRepository;

public interface PersonaService {
    public int verificarPersona(int id, String dni);
}

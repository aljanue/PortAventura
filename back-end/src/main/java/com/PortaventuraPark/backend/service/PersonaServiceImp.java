package com.PortaventuraPark.backend.service;

import com.PortaventuraPark.backend.model.Persona;
import com.PortaventuraPark.backend.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Optional;

@Service
public class PersonaServiceImp implements PersonaService {
    @Autowired
    private PersonaRepository pRepo;

    public int verificarPersona(int id, String dni) {
        Optional<Persona> personaOptional = pRepo.findById((long) id);

        if (personaOptional.isPresent()) {
            Persona persona = personaOptional.get();
            LocalDate fechaActual = LocalDate.now();

            if (persona.getDia().isEqual(fechaActual) && persona.getDni().equals(dni)) {
                // Persona encontrada y la fecha y DNI coinciden
                return id;
            } else {
                // Fecha o DNI no coinciden
                return -1;
            }
        } else {
            // No se encontró ninguna persona con el ID proporcionado
            return -1;
        }
    }
}

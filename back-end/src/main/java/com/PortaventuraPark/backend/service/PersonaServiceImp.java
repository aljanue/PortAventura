package com.PortaventuraPark.backend.service;

import com.PortaventuraPark.backend.repository.PersonaRepository;

public class PersonaServiceImp implements PersonaService {
    private PersonaRepository pRepo;
    public Boolean verificarPersona(Long id){
        return pRepo.existsById(id);
    }
}

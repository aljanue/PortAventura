package com.PortaventuraPark.backend.service;

import com.PortaventuraPark.backend.model.Zona;
import com.PortaventuraPark.backend.repository.ZonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ZonaServiceImp implements ZonaService{
    @Autowired
    ZonaRepository zRepo;
    @Override
    public ArrayList<Zona> obtenerZonas() {
        return (ArrayList<Zona>) zRepo.findAll();
    }

    @Override
    public Zona obtenerZonaPorId(int idAtraccion) {
        Optional<Zona> zonaOptional=zRepo.findById((long) idAtraccion);
        return zonaOptional.orElse(null);
    }
}

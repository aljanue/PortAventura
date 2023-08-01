package com.PortaventuraPark.backend.service;

import com.PortaventuraPark.backend.model.Atraccion;
import com.PortaventuraPark.backend.repository.AtraccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class AtraccionServiceImp implements AtraccionService {
    @Autowired
    private AtraccionRepository aRepo;
    @Autowired
    private ReservaServiceImp rService;

    @Override
    public Optional<Atraccion> obtenerAtraccionPorId(int id) {
        return aRepo.findById((long)id);
    }

    @Override
    public ArrayList<Atraccion> obtenerAtracciones() {
        return (ArrayList<Atraccion>) aRepo.findAll();
    }

    @Override
    public ArrayList<Atraccion> obtenerAtraccionesPorZona(int zona) {
        return (ArrayList<Atraccion>) aRepo.findByZona(zona);
    }

    @Override
    public int obtenerTiempoEspera(int id) {
        int t = -1;
        Optional<Atraccion> atraccionOptional=aRepo.findById((long) id);
        if(atraccionOptional.isPresent()){
            t=rService.cuentaReservaAtraccioni(id)/atraccionOptional.get().getCapacidad()*atraccionOptional.get().getDuracion();
        }
        return t;
    }
}

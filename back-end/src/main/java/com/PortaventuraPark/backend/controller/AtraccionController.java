package com.PortaventuraPark.backend.controller;

import com.PortaventuraPark.backend.model.Atraccion;
import com.PortaventuraPark.backend.service.AtraccionService;
import com.PortaventuraPark.backend.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/att")
public class AtraccionController {
    @Autowired
    private AtraccionService atraccionService;

    @GetMapping("/atraccion")
    public Optional<Atraccion> obtenerAtraccionPorId(int id){
        return atraccionService.obtenerAtraccionPorId(id);
    }
    @GetMapping("/atracciones")
    public ArrayList<Atraccion> obtenerAtracciones(){
        return atraccionService.obtenerAtracciones();
    }
    @GetMapping("/atraccion-zona")
    public ArrayList<Atraccion> obtenerAtraccionesPorZona(int zona){
        return atraccionService.obtenerAtraccionesPorZona(zona);
    }

}

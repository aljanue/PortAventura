package com.PortaventuraPark.backend.controller;

import com.PortaventuraPark.backend.model.Atraccion;
import com.PortaventuraPark.backend.service.AtraccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/att")
@CrossOrigin(origins={"http://localhost:4200", "http://localhost:8080"})
public class AtraccionController {
    @Autowired
    private AtraccionService atraccionService;

    @GetMapping("/ {id}")
    public Optional<Atraccion> obtenerAtraccionPorId(@PathVariable int id) {
        return atraccionService.obtenerAtraccionPorId(id);
    }
    @GetMapping("/all")
    public ArrayList<Atraccion> obtenerAtracciones(){
        return atraccionService.obtenerAtracciones();
    }
    @GetMapping("/zn={id}")
    public ArrayList<Atraccion> obtenerAtraccionesPorZona(@PathVariable int id) {
        return atraccionService.obtenerAtraccionesPorZona(id);
    }

}

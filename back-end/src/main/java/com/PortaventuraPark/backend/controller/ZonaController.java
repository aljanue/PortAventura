package com.PortaventuraPark.backend.controller;

import com.PortaventuraPark.backend.model.Zona;
import com.PortaventuraPark.backend.service.ZonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/zns")
@CrossOrigin(origins={"http://localhost:4200", "http://localhost:8080"})
public class ZonaController {
    @Autowired
    private ZonaService zonaService;

    @GetMapping("/zones")
    public ArrayList<Zona> obtenerZonas(){
        return zonaService.obtenerZonas();
    }

    @GetMapping("/zone")
    public Zona obtenerZona(@RequestParam("id_zona") int idZona){
        return zonaService.obtenerZonaPorId(idZona);
    }


}

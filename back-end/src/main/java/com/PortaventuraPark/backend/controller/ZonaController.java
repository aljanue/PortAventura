package com.PortaventuraPark.backend.controller;

import com.PortaventuraPark.backend.model.Zona;
import com.PortaventuraPark.backend.service.ZonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/zns")
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

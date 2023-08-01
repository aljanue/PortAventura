package com.PortaventuraPark.backend.service;

import com.PortaventuraPark.backend.model.Zona;

import java.util.ArrayList;

public interface ZonaService {
    public ArrayList<Zona> obtenerZonas();

    Zona obtenerZonaPorId(int idZona);
}

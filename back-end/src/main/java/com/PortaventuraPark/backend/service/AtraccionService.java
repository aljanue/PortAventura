package com.PortaventuraPark.backend.service;

import com.PortaventuraPark.backend.model.Atraccion;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Optional;

public interface AtraccionService {
    public Optional<Atraccion> obtenerAtraccionPorId(int id);
    public ArrayList<Atraccion> obtenerAtracciones();
    public ArrayList<Atraccion> obtenerAtraccionesPorZona(int zona);

    public int obtenerTiempoEspera(int id);
}

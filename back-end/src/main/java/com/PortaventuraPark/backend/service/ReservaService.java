package com.PortaventuraPark.backend.service;

import java.time.LocalTime;

public interface ReservaService {
    public boolean cambiarEstadoReserva(int id, int estado);
    public boolean addReserva(int id_atraccion, int id_persona, LocalTime hora);

    public int cuentaReservaAtraccioni(int id);
}

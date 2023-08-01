package com.PortaventuraPark.backend.service;

import com.PortaventuraPark.backend.model.Reserva;
import com.PortaventuraPark.backend.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ReservaServiceImp implements ReservaService {
    @Autowired
    private ReservaRepository rRepo;


    @Override
    public boolean cambiarEstadoReserva(int id, int estado) {
        // Buscar la reserva en la base de datos por su ID
        Optional<Reserva> reservaOptional = this.rRepo.findById((long) id);

        // Verificar si se encontró la reserva en la base de datos
        if (reservaOptional.isPresent()) {
            // Si se encontró la reserva, obtenerla del Optional
            Reserva reserva = reservaOptional.get();

            // Cambiar el estado de la reserva al valor proporcionado
            reserva.setEstado(estado);

            // Guardar la reserva actualizada en la base de datos
            rRepo.save(reserva);

            // Devolver true para indicar que se cambió el estado exitosamente
            return true;
        }

        // Devolver false para indicar que no se encontró la reserva con el ID proporcionado
        return false;
    }

    @Override
    public boolean addReserva(int id_atraccion, int id_persona, LocalTime hora) {
            try {
                // Comprobamos si ya existe una reserva con la persona indicada y el estado 2 en la tabla
                List<Reserva> reservas = rRepo.findByPersonaAndEstado(id_persona, 2);
                System.out.println("comprobacion:  " + reservas.size());
                if (!reservas.isEmpty()) {
                    // Ya existe una reserva con la persona indicada y el estado 2, devolvemos -1
                    return false;
                } else {
                    // Si no existe la reserva, procedemos a agregar una nueva reserva a la tabla
                    Reserva reserva = new Reserva();
                    reserva.setAtraccion(id_atraccion);
                    reserva.setPersona(id_persona);
                    reserva.setHora(hora);
                    reserva.setEstado(2);

                    // Guardamos la nueva reserva en la base de datos utilizando el repositorio adecuado
                    Reserva nuevaReserva = rRepo.save(reserva);

                    // Devolvemos el ID de la reserva creada
                    return true;
                }
            }catch(Exception e){
                return false;
            }

    }

    @Override
    public int cuentaReservaAtraccioni(int id) {
        ArrayList<Reserva> lista= (ArrayList<Reserva>) rRepo.findByAtraccion(id);
        return lista.size();
    }


}

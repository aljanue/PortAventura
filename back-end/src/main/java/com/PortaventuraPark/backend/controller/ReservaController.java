package com.PortaventuraPark.backend.controller;

import com.PortaventuraPark.backend.service.AtraccionService;
import com.PortaventuraPark.backend.service.ReservaService;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
@RequestMapping("/bkn")
public class ReservaController {
    @Autowired
    private ReservaService reservaService;

    @Autowired
    private AtraccionService atraccionService;

    @GetMapping("/booking")
    public boolean addReserva(@RequestParam("id_atraccion") int idAtraccion, HttpServletRequest request) {
        // Obtener el ID de la persona desde la cookie
        Cookie[] cookies = request.getCookies();
        int idPersona = -1; // Valor por defecto si la cookie no está presente
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("id_persona")) {
                    idPersona = Integer.parseInt(cookie.getValue());
                    break;
                }
            }
        }

        // Obtener la hora actual
        LocalTime horaActual = LocalTime.now();

        // Calcular la hora de la reserva utilizando la lógica que mencionaste
        int tiempoEspera = atraccionService.obtenerTiempoEspera(idAtraccion)+5;
        LocalTime horaReserva = horaActual.plusMinutes(tiempoEspera); // Las reservas que hay en dicha atracción / la capacidad de la atracción * el tiempo medio + la hora actual

        // Llamar al servicio para agregar la reserva con la horaReserva correcta
        return reservaService.addReserva(idAtraccion, idPersona, horaReserva);
    }

    @GetMapping("/cancel")
    public boolean cancelarReserva(@RequestParam("id_reserva") int idReserva, HttpServletRequest request) {
        // Obtener el ID de la persona desde la cookie
        Cookie[] cookies = request.getCookies();
        int idPersona = -1; // Valor por defecto si la cookie no está presente
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("id_persona")) {
                    idPersona = Integer.parseInt(cookie.getValue());
                    break;
                }
            }
        }
        // Llamar al servicio para agregar la reserva con la horaReserva correcta
        return reservaService.cambiarEstadoReserva(idReserva, 3);
    }
}

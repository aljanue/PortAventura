package com.PortaventuraPark.backend.controller;

import com.PortaventuraPark.backend.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins={"http://localhost:4200", "http://localhost:8080"})
public class PersonaController {
    @Autowired
    private PersonaService personaService;

    @PostMapping("/login")
    public int verificarPersona(@RequestBody int id, @RequestBody String dni, HttpServletResponse response) {
        // Verificar la persona
        int resultado = this.personaService.verificarPersona(id, dni);

        if (resultado > 0) {
            // Si la persona es válida, creamos la cookie y la agregamos a la respuesta
            Cookie idPersonaCookie = new Cookie("id_persona", String.valueOf(id));
            idPersonaCookie.setMaxAge(24 * 60 * 60); // Tiempo de vida de la cookie en segundos (opcional, puedes ajustar el tiempo según tus necesidades)
            idPersonaCookie.setPath("/"); // Ruta de acceso de la cookie (opcional, "/" significa que estará disponible en todo el sitio)
            response.addCookie(idPersonaCookie);
        }

        return resultado;
    }
}

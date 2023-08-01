package com.PortaventuraPark.backend;

import com.PortaventuraPark.backend.model.Atraccion;
import com.PortaventuraPark.backend.model.Zona;
import com.PortaventuraPark.backend.repository.PersonaRepository;
import com.PortaventuraPark.backend.service.AtraccionService;
import com.PortaventuraPark.backend.service.PersonaService;
import com.PortaventuraPark.backend.service.ReservaService;
import com.PortaventuraPark.backend.service.ZonaService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
class BackEndApplicationTests {
	@Autowired
	private PersonaService personaService;
	@Autowired
	private ReservaService reservaService;
	@Autowired
	private AtraccionService atraccionService;
	@Autowired
	private ZonaService zonaService;


	@Test
	void contextLoads() {
	}
	@Test
	void testVerificaUsuario(){
			boolean band=true;
			int id = 110357;
			String dni = "35604524H";

			// Ejecutamos el método verificarPersona del servicio
			int resultado = personaService.verificarPersona(id, dni);

			if(resultado<0){
				band=false;
			}

			// Verificamos que el resultado sea falso, ya que la persona no existe
			assertTrue(band);

	}

	@Test
	void testObtenerAtraccionPorId(){
		Optional<Atraccion> res=atraccionService.obtenerAtraccionPorId(1);
		assertNotNull(res);
	}
	@Test
	void testObtenerAtracciones(){
		ArrayList<Atraccion> res=atraccionService.obtenerAtracciones();
        assertFalse(res.isEmpty());
	}
	@Test
	void testObtenerAtraccionesPorZona(){
		ArrayList<Atraccion> res=atraccionService.obtenerAtraccionesPorZona(1);
		assertFalse(res.isEmpty());
	}

	@Test
	void testObtenerTiempoEspera(){
		boolean band=true;
		int id=1;

		// Ejecutamos el método verificarPersona del servicio
		int resultado = atraccionService.obtenerTiempoEspera(id);

		if(resultado<0){
			band=false;
		}

		// Verificamos que el resultado sea falso, ya que la persona no existe
		assertTrue(band);
	}

	@Test
	void testAddReserva(){
		boolean res=reservaService.addReserva(1, 110357, LocalTime.now());
		assertTrue(res);
	}

	@Test
	void testCambiarEstadoReserva(){
		boolean band = reservaService.cambiarEstadoReserva(3, 1);
		assertTrue(band);
	}

	@Test
	void testObtenerZonas(){
		ArrayList<Zona> res = zonaService.obtenerZonas();
        assertFalse(res.isEmpty());
	}

	@Test
	void testObtenerZona(){
		Zona res=zonaService.obtenerZonaPorId(1);
		assertNotNull(res);
	}

}

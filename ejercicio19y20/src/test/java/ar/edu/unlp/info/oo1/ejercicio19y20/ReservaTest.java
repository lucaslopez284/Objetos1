package ar.edu.unlp.info.oo1.ejercicio19y20;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReservaTest {
	Propiedad propiedad1,propiedad2;
	DateLapse periodo1,periodo2, periodo3;	
	Reserva reserva1, reserva2;
	Usuario propietario1, inquilino1;

	@BeforeEach
	void setUp() throws Exception {
		propiedad1 = new Propiedad ("1 y 50", "departamento", 10);
		propiedad2 = new Propiedad ("Quirno 70", "departamentoBis", 20);
		periodo1 = new DateLapse(LocalDate.of(2025, 10, 14), LocalDate.of(2025, 10, 16));
		periodo2 = new DateLapse(LocalDate.of(2025, 11, 1), LocalDate.of(2025, 11, 30));
		periodo3 = new DateLapse(LocalDate.of(2025, 10, 1), LocalDate.of(2025, 10, 31));
		propietario1 = new Usuario ("Lucas", 46739642, "Calle 284");
		inquilino1 = new Usuario ("Bauti", 50739642, "Calle 289");
		
	}

	@Test
	void testPrecioTotal() {
		propietario1.agregarPropiedad(propiedad1);
		reserva1 = propiedad1.crearReserva(periodo1, inquilino1);
		assertEquals(20, reserva1.precioTotal());
	}

	@Test
	void testDentroDeLapso() {
		propietario1.agregarPropiedad(propiedad1);
		reserva1 = propiedad1.crearReserva(periodo3, inquilino1);
		assertTrue(reserva1.dentroDeLapso(periodo1));
		reserva2 = propiedad2.crearReserva(periodo2, inquilino1);
		assertFalse(reserva2.dentroDeLapso(periodo1));
	}

}

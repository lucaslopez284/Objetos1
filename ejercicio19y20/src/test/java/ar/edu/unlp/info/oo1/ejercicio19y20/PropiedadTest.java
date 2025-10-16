package ar.edu.unlp.info.oo1.ejercicio19y20;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropiedadTest {
	
	Propiedad propiedad1,propiedad2;
	DateLapse periodo1,periodo2, periodo3;	
	Reserva reserva1, reserva2;
	Usuario inquilino1;
	
	

	@BeforeEach
	void setUp() throws Exception {
		propiedad1 = new Propiedad ("1 y 50", "departamento", 10);
		propiedad2 = new Propiedad ("Quirno 70", "departamentoBis", 20);
		periodo1 = new DateLapse(LocalDate.of(2025, 10, 14), LocalDate.of(2025, 10, 16));
		periodo2 = new DateLapse(LocalDate.of(2025, 11, 1), LocalDate.of(2025, 11, 11));
		inquilino1 = new Usuario ("Lucas", 46739642, "Calle 284");
		
	}

	@Test
	void testCrearReserva() {
		propiedad1.crearReserva(periodo1, inquilino1);
		assertFalse(propiedad1.getReservas().isEmpty());
		assertEquals(1, propiedad1.getReservas().size());
	}

	@Test
	void testCancelarReserva() {
		reserva1 = propiedad1.crearReserva(periodo2, inquilino1);
		assertFalse(propiedad1.getReservas().isEmpty());
		assertEquals(1, propiedad1.getReservas().size());
		propiedad1.cancelarReserva(reserva1);
		assertTrue(propiedad1.getReservas().isEmpty());
		assertEquals(0, propiedad1.getReservas().size());
	}

	@Test
	void testCalcularIngresos() {
		propiedad1.crearReserva(periodo1, inquilino1);
		assertEquals(20, propiedad1.calcularIngresos(periodo1));
	}

}

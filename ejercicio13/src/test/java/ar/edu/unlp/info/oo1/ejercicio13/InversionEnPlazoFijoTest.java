package ar.edu.unlp.info.oo1.ejercicio13;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.*;
class InversionEnPlazoFijoTest {
	InversionEnPlazoFijo Inversion1, Inversion2;
	
	LocalDate fecha = LocalDate.of(2025, 9, 30);
	@BeforeEach
	void setUp() throws Exception {
		Inversion1 = new InversionEnPlazoFijo(10, 5, fecha);
		Inversion2 = new InversionEnPlazoFijo(20, 3);
	}

	@Test
	void testInversionEnPlazoFijoDoubleDoubleLocalDate() {
		assertEquals(10, Inversion1.getValorInicial());
		assertEquals(5, Inversion1.getInteresDiario());
		assertEquals(fecha, Inversion1.getFecha());
	}

	@Test
	void testInversionEnPlazoFijoDoubleDouble() {
		assertEquals(20, Inversion2.getValorInicial());
		assertEquals(3, Inversion2.getInteresDiario());
		assertEquals(LocalDate.now(), Inversion2.getFecha());
	}

	@Test
	void testGetValorInicial() {
		assertEquals(10, Inversion1.getValorInicial());
		assertEquals(20, Inversion2.getValorInicial());
		assertNotEquals(20, Inversion1.getValorInicial());
		assertNotEquals(10, Inversion2.getValorInicial());
	}

	@Test
	void testGetInteresDiario() {
		assertEquals(5, Inversion1.getInteresDiario());
		assertEquals(3, Inversion2.getInteresDiario());
		assertNotEquals(3, Inversion1.getInteresDiario());
		assertNotEquals(5, Inversion2.getInteresDiario());
	}

	@Test
	void testGetFecha() {
		assertEquals(fecha,Inversion1.getFecha());
		assertEquals(LocalDate.now(), Inversion2.getFecha());
	}

	@Test
	void testGetValorActual() {
		assertEquals(20, Inversion1.getValorActual());
	}

}

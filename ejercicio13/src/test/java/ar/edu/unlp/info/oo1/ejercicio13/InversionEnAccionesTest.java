package ar.edu.unlp.info.oo1.ejercicio13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InversionEnAccionesTest {
	Accion a = new Accion ("Java", 10 );
	InversionEnAcciones inversion1;

	@BeforeEach
	void setUp() throws Exception {
		inversion1 = new InversionEnAcciones ("Intel", a, 2);
	}

	@Test
	void testInversionEnAcciones() {
		assertEquals("Intel", inversion1.getNombre());
		assertEquals(a,inversion1.getAccionPropia());
		assertEquals(2,inversion1.getCantidad());
	}

	@Test
	void testGetNombre() {
		assertNotEquals("Java", inversion1.getNombre());
		assertEquals("Intel", inversion1.getNombre());
	}

	@Test
	void testGetAccionPropia() {
		assertEquals(a,inversion1.getAccionPropia());
	}

	@Test
	void testGetCantidad() {
		assertEquals(2,inversion1.getCantidad());
		assertNotEquals(6,inversion1.getCantidad());
	}

	@Test
	void testGetValorActual() {
		assertEquals(20,inversion1.getValorActual());
	}

}

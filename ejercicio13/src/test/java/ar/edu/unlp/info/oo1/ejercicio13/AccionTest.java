package ar.edu.unlp.info.oo1.ejercicio13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AccionTest {
	
	Accion a;

	@BeforeEach
	void setUp() throws Exception {
		a = new Accion ("Java", 10 );
	}

	@Test
	void testAccion() {
		assertEquals("Java", a.getNombre());
		assertEquals(10, a.getValorUnitario());
	}

	@Test
	void testGetNombre() {
		assertEquals("Java", a.getNombre());
	}

	@Test
	void testGetValorUnitario() {
		assertNotEquals(8, a.getValorUnitario());
		assertEquals(10, a.getValorUnitario());
	}

}

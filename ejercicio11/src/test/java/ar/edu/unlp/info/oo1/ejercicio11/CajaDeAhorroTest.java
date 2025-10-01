package ar.edu.unlp.info.oo1.ejercicio11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaDeAhorroTest {
	private CajaDeAhorro cuenta1, cuenta2;

	@BeforeEach
	void setUp() throws Exception {
		cuenta1 = new CajaDeAhorro();
		cuenta2 = new CajaDeAhorro();
	}

	@Test
	void testDepositar() {
		cuenta1.depositar(100);
		assertEquals(98, cuenta1.getSaldo());
	}

	@Test
	void testPuedeExtraer() {
		cuenta1.depositar(100);
		assertEquals(false, cuenta1.puedeExtraer(150));
		assertEquals(true, cuenta1.puedeExtraer(50));
	}


	@Test
	void testGetSaldo() {;
		assertEquals(0, cuenta2.getSaldo());
	}

	@Test
	void testExtraer() {
		
	}

	@Test
	void testTransferirACuenta() {
		fail("Not yet implemented");
	}

}

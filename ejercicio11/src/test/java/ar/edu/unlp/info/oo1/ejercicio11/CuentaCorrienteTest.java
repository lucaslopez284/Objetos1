package ar.edu.unlp.info.oo1.ejercicio11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaCorrienteTest {
	private CuentaCorriente cuenta1, cuenta2;

	@BeforeEach
	void setUp() throws Exception {
		cuenta1 = new CuentaCorriente();
		cuenta2 = new CuentaCorriente(500);
				
	}

	@Test
	void testPuedeExtraer() {
		assertEquals(false, cuenta1.puedeExtraer(200));
		assertEquals(true, cuenta2.puedeExtraer(200));
	}

	void testGetDescubierto() {
		assertEquals(500, cuenta2.getDescubierto());
		
	}

	@Test
	void testSetDescubierto() {
		cuenta1.setDescubierto(100);
		assertEquals(100, cuenta1.getDescubierto());
	}

	@Test
	void testGetSaldo() {
		cuenta1.depositar(200);
		assertEquals(200, cuenta1.getSaldo());
		cuenta2.depositar(200);
		assertEquals(200, cuenta2.getSaldo());
	}

	@Test
	void testDepositar() {
		cuenta1.depositar(200);
		assertEquals(200, cuenta1.getSaldo());
	}

	@Test
	void testExtraer() {
		cuenta2.depositar(200);
		cuenta2.extraer(100);
		assertEquals(100, cuenta2.getSaldo());
		
	}

	@Test
	void testTransferirACuenta() {
		cuenta1.depositar(200);
		cuenta2.depositar(200);
		cuenta1.transferirACuenta(200, cuenta2);
		assertEquals(0, cuenta1.getDescubierto());
		assertEquals(400, cuenta2.getSaldo());
	}

}

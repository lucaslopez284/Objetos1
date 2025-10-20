package ar.edu.unlp.info.oo1.ejercicio21;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EnvioLocalTest {
	EnvioLocal envio1, envio2;

	@BeforeEach
	void setUp() throws Exception {
		envio1 = new EnvioLocal (LocalDate.of(2025, 10, 16), "Liniers", "Flores", 10, true);
		envio2 = new EnvioLocal (LocalDate.of(2025, 10, 16), "Liniers", "Flores", 10, false);
	}

	@Test
	void testObtenerCosto() {
		assertEquals (1000, envio1.obtenerCosto());
		assertEquals (500, envio2.obtenerCosto());
	}

}

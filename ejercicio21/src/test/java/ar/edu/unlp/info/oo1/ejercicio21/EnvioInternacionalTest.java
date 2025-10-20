package ar.edu.unlp.info.oo1.ejercicio21;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EnvioInternacionalTest {
	EnvioInternacional envio1, envio2, envio3, envio4;

	@BeforeEach
	void setUp() throws Exception {
		envio1 = new EnvioInternacional (LocalDate.of(2025, 10, 16), "Liniers", "Bogota", 10, true);
		envio2 = new EnvioInternacional (LocalDate.of(2025, 10, 16), "Liniers", "Bogota", 10, false);
		envio3 = new EnvioInternacional (LocalDate.of(2025, 10, 16), "Liniers", "Bogota", 2000, true);
		envio4 = new EnvioInternacional (LocalDate.of(2025, 10, 16), "Liniers", "Bogota", 2000, false);
	}

	@Test
	void testObtenerCosto() {
		assertEquals (5900, envio1.obtenerCosto()); 
		assertEquals (5100, envio2.obtenerCosto());
		assertEquals (29800, envio3.obtenerCosto()); 
		assertEquals (29000, envio4.obtenerCosto());
	
	}

}

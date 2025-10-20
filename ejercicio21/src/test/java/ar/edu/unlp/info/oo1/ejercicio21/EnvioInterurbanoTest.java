package ar.edu.unlp.info.oo1.ejercicio21;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EnvioInterurbanoTest {
	
	EnvioInterurbano envio1, envio2, envio3;

	@BeforeEach
	void setUp() throws Exception {
		envio1 = new EnvioInterurbano (LocalDate.of(2025, 10, 16), "CABA", "La Plata", 10, 50);
		envio2 = new EnvioInterurbano (LocalDate.of(2025, 10, 16), "CABA", "Sante Fe", 10, 300);
		envio3 = new EnvioInterurbano (LocalDate.of(2025, 10, 16), "CABA", "Puerto Madryn", 10, 2000);
	}

	@Test
	void testObtenerCosto() {
		assertEquals (200, envio1.obtenerCosto()); 
		assertEquals (250, envio2.obtenerCosto());
		assertEquals (300, envio3.obtenerCosto());
	}

}

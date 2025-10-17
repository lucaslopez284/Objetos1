package ar.edu.unlp.info.oo1.ejercicio21;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaFisicaTest {
	PersonaFisica cliente1;
	EnvioInterurbano envio1;
	EnvioLocal envio2;
	EnvioInternacional envio3;

	@BeforeEach
	void setUp() throws Exception {
		cliente1 = new PersonaFisica("Santa Fe y 9 de Julio", "Juan", 46739642);
		envio1 = new EnvioInterurbano (LocalDate.of(2025, 10, 16), "CABA", "Sante Fe", 10, 300);
		envio2 = new EnvioLocal (LocalDate.of(2025, 10, 16), "Liniers", "Flores", 10, false);
		envio3 = new EnvioInternacional (LocalDate.of(2025, 10, 16), "Liniers", "Bogota", 1100, true);
	}

	@Test
	void test() {
		cliente1.agregarEnvio(envio1);
		assertEquals(225, cliente1.obtenerMontoAPagar(LocalDate.of(2025, 1, 1), LocalDate.of(2025, 12, 31)));
		cliente1.agregarEnvio(envio2);
		assertEquals(675, cliente1.obtenerMontoAPagar(LocalDate.of(2025, 1, 1), LocalDate.of(2025, 12, 31)));
		cliente1.agregarEnvio(envio3);
		assertEquals(17775, cliente1.obtenerMontoAPagar(LocalDate.of(2025, 1, 1), LocalDate.of(2025, 12, 31)));
		
	}

}

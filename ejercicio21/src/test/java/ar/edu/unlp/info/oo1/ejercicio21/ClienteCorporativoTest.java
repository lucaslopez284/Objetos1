package ar.edu.unlp.info.oo1.ejercicio21;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteCorporativoTest {
	ClienteCorporativo cliente1;
	EnvioInterurbano envio1;
	EnvioLocal envio2;
	EnvioInternacional envio3;

	@BeforeEach
	void setUp() throws Exception {
		
		cliente1 = new ClienteCorporativo("Quirno70", "Bonafide", "20-46739642-1");
		envio1 = new EnvioInterurbano (LocalDate.of(2025, 10, 16), "CABA", "Sante Fe", 10, 300);
		envio2 = new EnvioLocal (LocalDate.of(2025, 10, 16), "Liniers", "Flores", 10, true);
		envio3 = new EnvioInternacional (LocalDate.of(2025, 10, 16), "Liniers", "Bogota", 10, false);
		
	}

	@Test
	void testObtenerMontoAPagar() {
		cliente1.agregarEnvio(envio1);
		assertEquals(250, cliente1.obtenerMontoAPagar(LocalDate.of(2025, 1, 1), LocalDate.of(2025, 12, 31)));
		cliente1.agregarEnvio(envio2);
		assertEquals(1250, cliente1.obtenerMontoAPagar(LocalDate.of(2025, 1, 1), LocalDate.of(2025, 12, 31)));
		cliente1.agregarEnvio(envio3);
		assertEquals(6350, cliente1.obtenerMontoAPagar(LocalDate.of(2025, 1, 1), LocalDate.of(2025, 12, 31)));
		
		
	}

}

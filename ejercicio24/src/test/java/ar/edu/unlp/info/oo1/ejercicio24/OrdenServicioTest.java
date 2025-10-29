package ar.edu.unlp.info.oo1.ejercicio24;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OrdenServicioTest {
	Producto producto1, producto2;
	Tecnico tecnico1, tecnico2, tecnico3;
	List<Producto> listaP, listaP2;
	List<Tecnico> listaT, listaT2;;
	OrdenServicio orden1, orden2, orden3;

	@BeforeEach
	void setUp() throws Exception {
		producto1 = new Producto("Calefon Solar", "Reciclables", 50000, false);
		tecnico1 = new Tecnico("Lucía Iraola", "Instalaciones solares", 4500);
        listaP = new ArrayList<Producto>();
		listaP.add(producto1);
		listaT = new ArrayList<Tecnico>();
		listaT.add(tecnico1);
		orden1 = new OrdenServicio(LocalDate.now(),"Larrea 5800, Mar del Plata", listaP ,"Instalación de calefón solar", 5, listaT);
		
		producto2 = new Producto("Calefon Solar", "Reciclables", 1, false);
		listaP2 = new ArrayList<Producto>();
		listaP2.add(producto2);
		tecnico2 = new Tecnico("Lucas Lopez", "Instalaciones solares", 1);
		listaT2 = new ArrayList<Tecnico>();
		listaT2.add(tecnico2);
		
		orden2 = new OrdenServicio(LocalDate.now(),"Berazategui", listaP2 ,"Instalación de calefón solar", 5, listaT2);
		
		orden3 = new OrdenServicio(LocalDate.now(),"Berazategui", listaP2 ,"Instalación de calefón solar", 11, listaT2);
		
	}

	@Test
	void testCalcularCosto() {
		assertEquals(72500, orden1.calcularCosto());
		assertEquals(6, orden2.calcularCosto());
		assertEquals(10.8, orden3.calcularCosto());
	}

}

package ar.edu.unlp.info.oo1.ejercicio24;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OrdenCompraTest {
	Producto producto1, producto2, producto3;
	OrdenCompra orden1, orden2, orden3;
	List<Producto> listaP, listaP2, listaP3;
	

	@BeforeEach
	void setUp() throws Exception {
		producto1 = new Producto("Panel Solar", "Reciclables", 35000, false);
		producto2 = new Producto("Panel Solar", "Reciclables", 8000, true);
		listaP = new ArrayList<Producto>();
		listaP.add(producto1);
		listaP.add(producto2);
		orden1 = new OrdenCompra(LocalDate.now(),"Larrea 5800, Mar del Plata", listaP, 5000);
		producto3 = new Producto("Panel Solar", "Reciclables", 10, false);
		listaP2 = new ArrayList<Producto>();
		listaP2.add(producto3);
		listaP2.add(producto3);
		listaP2.add(producto3);
		listaP2.add(producto3);
		orden2 = new OrdenCompra(LocalDate.now(),"Berazategui", listaP2, 5000);
		listaP3 = new ArrayList<Producto>();
		listaP3.add(producto3);
		listaP3.add(producto3);
		listaP3.add(producto3);
		listaP3.add(producto3);
		listaP3.add(producto3);
		orden3 = new OrdenCompra(LocalDate.now(),"Berazategui", listaP3, 5000);
	}

	@Test
	void testCalcularCosto() {
		assertEquals(43000, orden1.calcularCosto());
		assertEquals(40, orden2.calcularCosto());
		assertEquals(45, orden3.calcularCosto());
	}

}

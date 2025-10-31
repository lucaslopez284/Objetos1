package ar.edu.unlp.info.oo1.ejercicio25;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;
import java.util.LinkedHashMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MapTest {
    Map <Jugador, Integer> coleccion;
    Jugador messi, batistuta, aguero;

	@BeforeEach
	void setUp() throws Exception {
	    coleccion = new LinkedHashMap<Jugador, Integer>();
	    messi = new Jugador("Lionel", "Messi");
	    batistuta = new Jugador("Gabriel", "Batistuta");
	    aguero = new Jugador("Sergio", "Aguero");
	    
	}

		
	

	@Test
	void test() {
		// PUNTO A
		coleccion.put(messi, 111);
	    coleccion.put(batistuta, 56);
	    coleccion.put(aguero, 42);
	    assertEquals(209, coleccion.entrySet().stream().mapToInt(c -> c.getValue()).sum());
	    // PUNTO B
	    coleccion.remove(aguero);
	    assertEquals(167, coleccion.entrySet().stream().mapToInt(c -> c.getValue()).sum());
	    // PUNTO C
	    coleccion.put(messi, 112);
	    assertEquals(168, coleccion.entrySet().stream().mapToInt(c -> c.getValue()).sum());
	    // PUNTO D
	    coleccion.put(batistuta, 60);
	    assertEquals(172, coleccion.entrySet().stream().mapToInt(c -> c.getValue()).sum());
	}

}

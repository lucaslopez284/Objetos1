package ar.edu.unlp.info.oo1.ejercicio24;
import java.time.LocalDate;
import java.util.*;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		Producto p1 = new Producto("Panel Solar", "Reciclables", 35000, false);
		Producto p2 = new Producto("Panel Solar", "Reciclables", 8000, true);
		List<Producto> listaP = new ArrayList<Producto>();
		listaP.add(p1);
		listaP.add(p2);
		OrdenCompra unaOrdenCompra = new OrdenCompra(LocalDate.now(),"Larrea 5800, Mar del Plata", listaP, 5000);
		Producto p3 = new Producto("Calefon Solar", "Reciclables", 50000, false);
		Tecnico unTecnico = new Tecnico("Lucía Iraola", "Instalaciones solares", 4500);
		List<Producto> listaP2 = new ArrayList<Producto>();
		listaP2.add(p3);
		List<Tecnico> listaT = new ArrayList<Tecnico>();
		listaT.add(unTecnico);
		OrdenServicio unaOrdenServicio = new OrdenServicio(LocalDate.now(),"Larrea 5800, Mar del Plata", listaP2 ,"Instalación de calefón solar", 5, listaT);
		List<Orden> listaOrdenes = new ArrayList<Orden>();
		listaOrdenes.add(unaOrdenCompra);
		listaOrdenes.add(unaOrdenServicio);
		Usuario unUsuario = new Usuario("Juan Martinez", "Larrea 5800, Mar del Plata", listaOrdenes);
	}

}

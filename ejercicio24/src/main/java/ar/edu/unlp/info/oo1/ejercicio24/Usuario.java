package ar.edu.unlp.info.oo1.ejercicio24;

import java.util.ArrayList;
import java.util.List;

public class Usuario extends Persona {
	
	
	
	
	private String domicilio;
	private List<Orden> ordenes;
	
	
	
	public Usuario(String nombreCompleto, String domicilio, List<Orden> ordenes) {
		super(nombreCompleto);
		this.domicilio = domicilio;
		this.ordenes = ordenes;
	}

	public void agregarOrden(Orden unaOrden) {
		this.ordenes.add(unaOrden);
	}
	
	public List<Orden> getOrdenes() {
		return new ArrayList<Orden>(this.ordenes);
	}
	
	
	

}

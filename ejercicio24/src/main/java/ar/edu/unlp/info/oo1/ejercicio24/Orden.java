package ar.edu.unlp.info.oo1.ejercicio24;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Orden {
	
	private LocalDate fecha;
	private String domicilio;
	private List<Producto> productos;
	
	


	public Orden(LocalDate fecha, String domicilio, List<Producto> productos) {
		super();
		this.fecha = fecha;
		this.domicilio = domicilio;
		this.productos = productos;
	}



	protected List<Producto> getProductos() {
		return new ArrayList<Producto>(this.productos);
	}



	public abstract double calcularCosto();
	
	

	
}

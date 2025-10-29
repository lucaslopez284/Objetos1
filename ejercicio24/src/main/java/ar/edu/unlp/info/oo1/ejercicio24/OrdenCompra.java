package ar.edu.unlp.info.oo1.ejercicio24;

import java.time.LocalDate;
import java.util.List;

public class OrdenCompra extends Orden {
	
	private double precioEnvio;
	
	

	public OrdenCompra(LocalDate fecha, String domicilio, List<Producto> productos, double precioEnvio) {
		super(fecha, domicilio, productos);
		this.precioEnvio = precioEnvio;
	}



	@Override
	public double calcularCosto() {
		double resultado =  this.getProductos().stream()
		                                       .mapToDouble(p -> p.getCosto())
		                                       .sum();
		if (this.getProductos().size() >= 5) {
			resultado = resultado * 0.9;
		}
		
		return resultado;
		         
	}
	
	

}

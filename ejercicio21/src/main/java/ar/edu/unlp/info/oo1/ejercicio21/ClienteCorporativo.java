package ar.edu.unlp.info.oo1.ejercicio21;

import java.time.LocalDate;

public class ClienteCorporativo extends Cliente{
	
	private String cuit;

	public ClienteCorporativo(String direccion, String nombre, String cuit) {
		super(direccion, nombre);
		this.cuit = cuit;
	}

	public double obtenerMontoAPagar(LocalDate inicio, LocalDate fin) {
		return this.getEnvios().stream()
				.filter(e -> e.dentroDePeriodo(inicio, fin))
				.mapToDouble(e -> e.obtenerCosto())
				.sum();
		
	}
	
	
	

}

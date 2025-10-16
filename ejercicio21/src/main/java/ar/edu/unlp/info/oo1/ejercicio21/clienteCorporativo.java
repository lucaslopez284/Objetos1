package ar.edu.unlp.info.oo1.ejercicio21;

import java.time.LocalDate;

public class clienteCorporativo extends Cliente{
	
	private String cuit;

	public clienteCorporativo(String direccion, String nombre, String cuit) {
		super(direccion, nombre);
		this.cuit = cuit;
	}

	public double obtenerMontoAPagar(LocalDate inicio, LocalDate fin) {
		return this.getEnvios().stream()
				.filter(e -> !e.getFechaDespacho().isAfter(fin) && !e.getFechaDespacho().isBefore(inicio))
				.mapToDouble(e -> e.obtenerCosto())
				.sum();
		
	}
	
	
	

}

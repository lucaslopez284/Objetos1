package ar.edu.unlp.info.oo1.ejercicio21;

import java.time.LocalDate;

public class PersonaFisica extends Cliente {
	
	
	private int dni;
	
	public PersonaFisica(String direccion, String nombre, int dni) {
		super(direccion, nombre);
		this.dni = dni;
	}

	@Override
	public double obtenerMontoAPagar(LocalDate inicio, LocalDate fin) {
		double resultado = this.getEnvios().stream()
				            .filter(e -> !e.getFechaDespacho().isAfter(fin) && !e.getFechaDespacho().isBefore(inicio))
				            .mapToDouble(e -> e.obtenerCosto())
				            .sum();
		return resultado * 0.90;
	}

	
	
	
	

}

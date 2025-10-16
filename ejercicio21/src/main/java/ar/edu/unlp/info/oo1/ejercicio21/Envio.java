package ar.edu.unlp.info.oo1.ejercicio21;

import java.time.LocalDate;

public abstract class Envio {
	
	private LocalDate fechaDespacho;
	private String origen;
	private String destino;
	double peso;
	
	public Envio(LocalDate fechaDespacho, String origen, String destino, double peso) {
		this.fechaDespacho = fechaDespacho;
		this.origen = origen;
		this.destino = destino;
		this.peso = peso;
	}
	
	
	
	public LocalDate getFechaDespacho() {
		return fechaDespacho;
	}

	public abstract double obtenerCosto();

}

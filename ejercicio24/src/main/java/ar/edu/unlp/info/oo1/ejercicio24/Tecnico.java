package ar.edu.unlp.info.oo1.ejercicio24;

public class Tecnico extends Persona {
	
	private String especialidad;
	private double valorHora;
	
	
	public Tecnico(String nombreCompleto, String especialidad, double valorHora) {
		super(nombreCompleto);
		this.especialidad = especialidad;
		this.valorHora = valorHora;
	}


	public double getValorHora() {
		return valorHora;
	}
	
	

}

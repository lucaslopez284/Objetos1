package ar.edu.unlp.info.oo1.ejercicio13;

public class Accion {
	
	private String nombre;
	private double valorUnitario;
	
	
	public Accion(String nombre, double valorUnitario) {
		this.setNombre(nombre);
		this.setValorUnitario(valorUnitario);
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	private void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	public String getNombre() {
		return nombre;
	}
	public double getValorUnitario() {
		return valorUnitario;
	}
	
	
   
}

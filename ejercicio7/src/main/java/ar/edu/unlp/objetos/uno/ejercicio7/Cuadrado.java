package ar.edu.unlp.objetos.uno.ejercicio7;

public class Cuadrado implements Figura{
	
	private double lado;
	
	

	public Cuadrado() {
		super();
	}

	public Cuadrado(double lado) {
		super();
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double getArea() {
		return this.getLado() * this.getLado();
	}
	
	public double getPerimetro() {
		return this.getLado() + this.getLado() + this.getLado() + this.getLado();
	}
	
	

}

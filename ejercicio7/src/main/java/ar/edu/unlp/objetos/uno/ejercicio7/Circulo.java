package ar.edu.unlp.objetos.uno.ejercicio7;

public class Circulo implements Figura {
	
	private double radio;
	
	

	public Circulo() {
		super();
	}

	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double getDiametro() {
		return this.getRadio() * 2;
	}
	
	public void setDiametro(double valor) {
		// como el diametro es igual a radio * 2, me parecio logico hacer esto
		// CONSULTAR
		double aux = (double) valor / 2;
		this.setRadio(aux); 
	}
	
	public double getPerimetro() {
		return Math.PI * this.getDiametro();
	}
	
	public double getArea() {
		return Math.PI * (this.getRadio() * this.getRadio());
	}
	

}

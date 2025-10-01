package ar.edu.unlp.info.oo1.ejercicio14;

public class Cilindro extends Pieza {
	
	private double radio;
	private double h;
	

	public Cilindro(String material, String color, double radio, double h) {
		super(material, color);
		this.setRadio(radio);
		this.setH(h);
	}
	
	

	public double getRadio() {
		return radio;
	}

	public double getH() {
		return h;
	}

	private void setRadio(double radio) {
		this.radio = radio;
	}

	private void setH(double h) {
		this.h = h;
	}



	public double getVolumen() {
		return Math.PI * Math.pow(radio, 2) * h;
	}

	public double getSuperficie() {
		return 2 * Math.PI * this.getRadio() * this.getH() 
				+ 2 * Math.PI * Math.pow(radio, 2);
	}

}

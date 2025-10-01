package ar.edu.unlp.info.oo1.ejercicio14;

public class Esfera extends Pieza {
	
	private double radio;
	

	public Esfera(String material, String color, double radio) {
		super(material, color);
		this.setRadio(radio);
	}
	
	public double getRadio() {
		return radio;
	}

	private void setRadio(double radio) {
		this.radio = radio;
	}

	public double getVolumen() {
		return ((double) 4 / 3) * Math.PI * Math.pow(radio, 3);
	}

	public double getSuperficie() {
		return 4 * Math.PI * Math.pow(radio, 2);
	}

}

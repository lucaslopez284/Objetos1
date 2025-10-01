package ar.edu.unlp.info.oo1.ejercicio14;

public class PrismaRectangular extends Pieza{
	private double ladoMenor;
	private double ladoMayor;
	private double altura;
	
	
	
	
	public PrismaRectangular(String material, String color, double ladoMenor, double ladoMayor, double altura) {
		super(material, color);
		this.ladoMenor = ladoMenor;
		this.ladoMayor = ladoMayor;
		this.altura = altura;
	}
	
	public double getLadoMenor() {
		return ladoMenor;
	}
	public double getLadoMayor() {
		return ladoMayor;
	}
	public double getAltura() {
		return altura;
	}
	private void setLadoMenor(double ladoMenor) {
		this.ladoMenor = ladoMenor;
	}
	private void setLadoMayor(double ladoMayor) {
		this.ladoMayor = ladoMayor;
	}
	private void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getVolumen() {
		return this.getLadoMenor() * this.getLadoMayor() * this.getAltura();
	}

	public double getSuperficie() {
		return 2 * (this.getLadoMayor() * this.getLadoMenor() + this.getLadoMayor() * this.getAltura() + this.getLadoMenor() * this.getAltura());
	}

	
	
	
	
	

}

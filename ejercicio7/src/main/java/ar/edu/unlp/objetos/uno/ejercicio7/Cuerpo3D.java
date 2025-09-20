package ar.edu.unlp.objetos.uno.ejercicio7;

public class Cuerpo3D {
	
	private double altura;
	private Figura caraBasal;
	
	
	
	public Cuerpo3D() {
		super();
	}
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	private Figura getCaraBasal() {
		return caraBasal;
	}
	public void setCaraBasal(Figura caraBasal) {
		this.caraBasal = caraBasal;
	}
	
	public double getVolumen() {
		return this.getCaraBasal().getArea() * this.getAltura();
	}
	
	public double getSuperficieExterior() {
		return 2 * this.getCaraBasal().getArea() + this.getCaraBasal().getPerimetro() * this.getAltura();
	}
	

}

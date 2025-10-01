package ar.edu.unlp.info.oo1.ejercicio14;

public abstract class Pieza {
	private String material;
	private String color;
	
	public Pieza(String material, String color) {
		this.setMaterial(material);
		this.setColor(color);
	}

	public String getMaterial() {
		return material;
	}

	public String getColor() {
		return color;
	}

	private void setMaterial(String material) {
		this.material = material;
	}

	private void setColor(String color) {
		this.color = color;
	}
	
	public abstract double getVolumen();
	
	public abstract double getSuperficie();
	
	
	
	
  
}

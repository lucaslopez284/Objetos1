package ar.edu.unlp.objetos.uno.ejercicio3;

public class Item {
	
	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	
	public Item(String detalle, int cantidad, double costoUnitario) {
		super();
		this.detalle = detalle;
		this.cantidad = cantidad;
		this.costoUnitario = costoUnitario;
	}
	public String getDetalle() {
		return detalle;
	}
	private void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public int getCantidad() {
		return cantidad;
	}
	private void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getCostoUnitario() {
		return costoUnitario;
	}
	private void setCostoUnitario(double costoUnitario) {
		this.costoUnitario = costoUnitario;
	}
	
	double costo() {
		return this.getCostoUnitario() * this.getCantidad();
	}
	
	

}

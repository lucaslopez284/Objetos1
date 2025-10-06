package ar.edu.unlp.info.oo1.ejercicio13;

public class InversionEnAcciones implements Inversion{
	
	private String nombre;
	private Accion accionPropia;
	private int cantidad;
	 
	public InversionEnAcciones(String nombre, Accion accionPropia, int cantidad) {
		this.setNombre(nombre);
		this.setAccionPropia(accionPropia);
		this.setCantidad(cantidad);
	}
	public String getNombre() {
		return nombre;
	}
	public Accion getAccionPropia() {
		return accionPropia;
	}
	public int getCantidad() {
		return cantidad;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	private void setAccionPropia(Accion accionPropia) {
		this.accionPropia = accionPropia;
	}
	private void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}



	public double getValorActual() {
		if (this.getAccionPropia()!= null) {
			return this.getCantidad() * this.getAccionPropia().getValorUnitario();
		}
		else return 0;
	}

}

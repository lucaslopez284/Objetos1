package ar.edu.unlp.info.oo1.ejercicio11;

public class CuentaCorriente extends Cuenta{
	
	private double descubierto;
	
	

	
	public CuentaCorriente() {
		super();
		this.setDescubierto(0);
	}
	
	public CuentaCorriente(double limite) {
		super();
		this.setDescubierto(limite);
	}
	
	public double getDescubierto() {
		return descubierto;
	}

	public void setDescubierto(double descubierto) {
		this.descubierto = descubierto;
	}

	public boolean puedeExtraer(double monto) {
		return  (monto <= (this.getSaldo() + this.getDescubierto()));
	}

}

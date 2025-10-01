package ar.edu.unlp.info.oo1.ejercicio11;

public class CajaDeAhorro extends Cuenta{
	
	private double interes;
	
	
	
    public CajaDeAhorro() {
		super();
		this.setInteres(2);
	}
    
    

	private void setInteres(double interes) {
		this.interes = interes;
	}


	private double getInteres() {
		return interes;
	}

	private double obtenerInteres() {
    	return (double) this.getInteres() / 100;
    }
    
	public void depositar (double monto) {
		super.depositar(monto - (monto * this.obtenerInteres()));
	}
	
	protected void extraerSinControlar(double monto) {
		super.extraerSinControlar(monto + (monto * this.obtenerInteres()));
	}
	public boolean puedeExtraer(double monto) { // DUDAS
		return (this.getSaldo()>= (monto + (monto *this.obtenerInteres())));
	} 
	      

	
}

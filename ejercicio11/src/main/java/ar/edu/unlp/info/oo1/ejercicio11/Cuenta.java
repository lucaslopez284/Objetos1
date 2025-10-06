package ar.edu.unlp.info.oo1.ejercicio11;

public abstract class Cuenta {
	
	private double saldo;

	public Cuenta() {
		super();
		this.saldo = 0;
	}

	public double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double monto) {
		if (monto > 0) {
			this.setSaldo(this.getSaldo() + monto);
		}
	}
	
	protected void extraerSinControlar(double monto) {
		if (monto > 0) {
			this.setSaldo(this.getSaldo() - monto);
		}
	}
	
	protected abstract boolean puedeExtraer(double monto);
	
	public boolean extraer(double monto) {
		if (this.puedeExtraer(monto)) {
			this.extraerSinControlar(monto);
			return true;
		}
		return false;
	}
	
	public boolean transferirACuenta(double monto, Cuenta cuentaDestino) {
		if (this.puedeExtraer(monto)) {
			this.extraerSinControlar(monto);
			cuentaDestino.depositar(monto);
			return true;
		}
		return false;
	}
	
	
	
	

}

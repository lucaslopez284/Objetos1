package ar.edu.unlp.info.oo1.ejercicio19y20;

public class Moderada implements Politica{
	
	
	
	public Moderada() {
		super();
	}

	public double reembolsar(Reserva unaReserva) {
		if (unaReserva.distanciaModerada()) {
			return unaReserva.precioTotal();
		}
		return unaReserva.precioTotal() * 0.5;
	}

}

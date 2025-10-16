package ar.edu.unlp.info.oo1.ejercicio19y20;

public class Flexible implements Politica {
	public Flexible() {
		super();
	}

	
	public double reembolsar(Reserva unaReserva) {
		return unaReserva.precioTotal();
	}

}

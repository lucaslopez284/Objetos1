package ar.edu.unlp.info.oo1.ejercicio19y20;
import java.time.*;

import java.time.Period;

public class Reserva {
	
	private DateLapse periodo;
	private Propiedad lugar;
	private Usuario inquilino;
	
	
	
	public Reserva(DateLapse periodo, Propiedad lugar, Usuario inquilino) {
		this.periodo = periodo;
		this.lugar = lugar;
		this.inquilino = inquilino;
	}
	
	
	public double precioTotal() {
		return lugar.getPrecioPorNoche() * periodo.sizeInDays();
	}
	
	public boolean dentroDeLapso(DateLapse fechas) {
		return periodo.overlaps(fechas);
	}
	
	public boolean estaEnCurso() {
		return periodo.includesDate(LocalDate.now());
	}
	
	public boolean distanciaModerada() {
	    DateLapse auxiliar = new DateLapse (LocalDate.now(), periodo.getFrom());
	    return auxiliar.sizeInDays()>= 2;
	    		
	}
	
	
	
	
	
	
	
	
	
	
	

}

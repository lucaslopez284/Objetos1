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
	
	
	
	public DateLapse getPeriodo() {
		return periodo;
	}

	public double precioTotal() {
		return lugar.getPrecioPorNoche() * periodo.sizeInDays();
	}
	
	public boolean dentroDeLapso(DateLapse fechas) {
		if (periodo.overlaps(fechas)) {
			return true;
		}
		else return false;
	}
	
	public boolean noEstaEnCurso(LocalDate fecha) {
		return !periodo.includesDate(fecha);
	}
	
	
	
	
	
	
	
	
	
	

}

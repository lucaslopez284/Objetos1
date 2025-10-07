package ar.edu.unlp.info.oo1.ejercicio16y17;

import java.time.*;

public class DateLapse implements Date{
	private LocalDate from;
	private LocalDate to;
	
	
	
	public DateLapse(LocalDate from, LocalDate to) {
		if (from.isAfter(to)) {
	        // intercambio si el orden es incorrecto
	        this.from = to;
	        this.to = from;
	    } 
		else {
	        this.from = from;
	        this.to = to;
	    }
	}

	public LocalDate getFrom() { 
		return from;
	}

	public LocalDate getTo() {
		return to;
	}

	public int sizeInDays() { 
		if (this.getFrom() != null && this.getTo() != null) {
			Period periodo = Period.between(this.getFrom(), this.getTo());
			return periodo.getDays();
		}
		return 0;
	}
	

	public boolean includesDate(LocalDate other) {
		if (this.getFrom() != null && this.getTo() != null) {
			return (!this.getFrom().isAfter(other) && !this.getTo().isBefore(other));
			// this.getFrom().isBefore(other) && this.getTo().isAfter(other) no incluye los extremos en el rango
		}
		return false;
	}
	


}

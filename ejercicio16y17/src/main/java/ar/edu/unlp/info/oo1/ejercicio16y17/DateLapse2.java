package ar.edu.unlp.info.oo1.ejercicio16y17;
import java.time.*;

public class DateLapse2 implements Date{
	
	private LocalDate from;
	private int sizeInDays;
	
	
	public DateLapse2(LocalDate from, int sizeInDays) {
		this.from = from;
		this.sizeInDays = sizeInDays;
	}


	public LocalDate getFrom() {
		return from;
	}
	
	public LocalDate getTo() {
		if (this.getFrom() != null) {
			return this.getFrom().plusDays(this.sizeInDays()); 
		}
		else return null;
	}


	public int sizeInDays() {
		return sizeInDays;
	}
	
	public boolean includesDate(LocalDate other) {
		if (this.getFrom()!= null) {
			if (!this.getFrom().isAfter(other) && !this.getFrom().plusDays(this.sizeInDays()).isBefore(other)) {
				return true;
			}
			return false;
		}
		return false;
	}
	
	
	
	
	
	
	
	

}

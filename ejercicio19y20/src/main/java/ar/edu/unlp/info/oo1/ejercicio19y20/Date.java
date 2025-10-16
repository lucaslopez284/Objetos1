package ar.edu.unlp.info.oo1.ejercicio19y20;

import java.time.LocalDate;

public interface Date {
	
	public LocalDate getFrom();
	//“Retorna la fecha de inicio del rango”

	public LocalDate getTo();
	//“Retorna la fecha de fin del rango”

	public int sizeInDays();
	//“retorna la cantidad de días entre la fecha 'from' y la fecha 'to'”

	public boolean includesDate(LocalDate other);
	//“recibe un objeto LocalDate y retorna true si la fecha está entre el from y el to del receptor y false en caso contrario”.



}


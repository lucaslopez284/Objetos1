package ar.edu.unlp.info.oo1.ejercicio19y20;

import java.time.*;
import java.util.*;

public class Propiedad {
	
	private String direccion;
	private String nombre;
	private double precioPorNoche;
	private List<Reserva> reservas;
	public Propiedad(String direccion, String nombre, double precioPorNoche) {
		this.direccion = direccion;
		this.nombre = nombre;
		this.precioPorNoche = precioPorNoche;
		this.reservas = new ArrayList<Reserva>();
	}
	
	public double getPrecioPorNoche() {
		return precioPorNoche;
	}
	
	public void crearReserva(DateLapse periodo, Usuario inquilino ) {
	    boolean noHayFechaQueCoincida = reservas.stream().allMatch(d -> !d.dentroDeLapso(periodo));
	    if (noHayFechaQueCoincida) {
	    	this.reservas.add(new Reserva(periodo,this, inquilino));
	    }
	}
	
	public void cancelarReserva(Reserva unaReserva) {
		if (reservas.contains(unaReserva)) {
			if (unaReserva.noEstaEnCurso(LocalDate.now())) {
				reservas.remove(unaReserva);
			}
		}
	}
	
	public double calcularIngresos(DateLapse periodo) {
	  return reservas.stream().filter(d -> d.dentroDeLapso(periodo)).mapToDouble(Reserva:: precioTotal).sum();
	}
	
	
	
	
	
	

}

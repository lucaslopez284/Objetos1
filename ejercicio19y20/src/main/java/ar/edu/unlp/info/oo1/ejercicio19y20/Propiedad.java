package ar.edu.unlp.info.oo1.ejercicio19y20;

import java.time.*;
import java.util.*;

public class Propiedad {
	
	private String direccion;
	private String nombre;
	private double precioPorNoche;
	private List<Reserva> reservas;
	private Politica laPolitica;
	
	public Propiedad(String direccion, String nombre, double precioPorNoche, Politica unaPolitica) {
		this.direccion = direccion;
		this.nombre = nombre;
		this.precioPorNoche = precioPorNoche;
		this.reservas = new ArrayList<Reserva>();
		this.laPolitica = unaPolitica;
	}
	
	public double getPrecioPorNoche() {
		return precioPorNoche;
	}
	
	private void agregarReserva(Reserva nuevaReserva) {
		this.reservas.add(nuevaReserva);
	}
	
	public Reserva crearReserva(DateLapse periodo, Usuario inquilino) {
		Reserva reservaNueva = null;
	    boolean noHayFechaQueCoincida = reservas.stream().allMatch(d -> !d.dentroDeLapso(periodo));
	    if (noHayFechaQueCoincida) {
	    	reservaNueva= new Reserva(periodo, this, inquilino);
	    	this.agregarReserva(reservaNueva);
	    }
	    return reservaNueva;
	}
	
	public double cancelarReserva(Reserva unaReserva) {
		if (reservas.contains(unaReserva)) {
			if (!unaReserva.estaEnCurso()) {
				reservas.remove(unaReserva);
				return this.laPolitica.reembolsar(unaReserva);
			}
		}
		return 0;
	}
	
	public double calcularIngresos(DateLapse periodo) {
	  return reservas.stream().filter(d -> d.dentroDeLapso(periodo)).mapToDouble(Reserva:: precioTotal).sum();
	}

	public List<Reserva> getReservas() {
		return new ArrayList<Reserva>(this.reservas);
	}


	

	
	
	
	
	
	
	
	

}

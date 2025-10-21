package ar.edu.unlp.info.oo1.ejercicio21;

import java.time.*;

import java.time.*;
import java.util.*;


public abstract class Cliente {
	
	private String direccion;
	private String nombre;
	private List<Envio> envios; // DEBERIA SER PRIVADA O PROTEGIDA??
	                            // DE SER PROTEGIDA, COMO LO GRAFICO EN UML?
	

	public Cliente(String direccion, String nombre) {
		this.direccion = direccion;
		this.nombre = nombre;
		this.envios = new ArrayList<Envio>();
	}
	
	public void agregarEnvio (Envio envioNuevo) {
		envios.add(envioNuevo);
	}
	
	public List<Envio> getEnvios() { // ESTE GET ES PARA OBTENER LA LISTA DE ENVIOS DESDE LA SUB-CLASE Y ASI PODER CALCULAR EL MONTO
		return new ArrayList<Envio>(this.envios);
	}
	
	public abstract double obtenerMontoAPagar(LocalDate inicio, LocalDate fin);
	
	
	
	

}

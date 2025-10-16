package ar.edu.unlp.info.oo1.ejercicio21;

import java.time.*;
import java.util.*;


public abstract class Cliente {
	
	private String direccion;
	private String nombre;
	private List<Envio> envios;
	

	public Cliente(String direccion, String nombre) {
		this.direccion = direccion;
		this.nombre = nombre;
		this.envios = new ArrayList<Envio>();
	}
	
	public void agregarEnvio (Envio envioNuevo) {
		envios.add(envioNuevo);
	}	
	
	
	
	

}

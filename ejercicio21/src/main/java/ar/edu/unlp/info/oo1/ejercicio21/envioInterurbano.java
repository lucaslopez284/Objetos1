package ar.edu.unlp.info.oo1.ejercicio21;

import java.time.LocalDate;

public class envioInterurbano extends Envio {
	
	private double distancia;

	public envioInterurbano(LocalDate fechaDespacho, String origen, String destino, double peso, double distancia) {
		super(fechaDespacho, origen, destino, peso);
		this.distancia = distancia;
	}
	
	

	
	
	

}

package ar.edu.unlp.info.oo1.ejercicio21;

import java.time.LocalDate;

public class EnvioInterurbano extends Envio {
	
	private double distancia;

	public EnvioInterurbano(LocalDate fechaDespacho, String origen, String destino, double peso, double distancia) {
		super(fechaDespacho, origen, destino, peso);
		this.distancia = distancia;
	}

	@Override
	public double obtenerCosto() {
	    if (distancia < 100) {
	    	return 20 * peso;
	    }
	    else {
	    	if (distancia <= 500) {
	    		return 25 * peso;
	    	}
	    	else return 30 * peso;
	    }
	}
	
	
	
	

	
	
	

}

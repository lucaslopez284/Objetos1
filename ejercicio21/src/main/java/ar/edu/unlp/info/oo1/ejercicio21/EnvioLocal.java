package ar.edu.unlp.info.oo1.ejercicio21;

import java.time.LocalDate;

public class EnvioLocal extends EnvioConEntregaRapida {
	
    
	

	

	public EnvioLocal(LocalDate fechaDespacho, String origen, String destino, double peso, boolean entregaRapida) {
		super(fechaDespacho, origen, destino, peso, entregaRapida);
	}


	public double obtenerCosto() {
		if (this.getEntregaRapida()) {
			return 1000;
		}
		else return 500;
		
	}
	
	
	
	

}

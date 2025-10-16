package ar.edu.unlp.info.oo1.ejercicio21;

import java.time.LocalDate;

public class envioInternacional extends EnvioConEntregaRapida {

	

	public envioInternacional(LocalDate fechaDespacho, String origen, String destino, double peso,
			boolean entregaRapida) {
		super(fechaDespacho, origen, destino, peso, entregaRapida);
	}

	@Override
	public double obtenerCosto() {
		int monto = 5000;
		if (peso > 1000) {
			monto += 12 * peso;
		}
		else monto += 10 * peso;
		
		if (getEntregaRapida()) {
			monto += 800;
		}
		return monto;
	}
	
	
	
	

}

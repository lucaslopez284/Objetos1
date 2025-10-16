package ar.edu.unlp.info.oo1.ejercicio21;

import java.time.LocalDate;

public abstract class EnvioConEntregaRapida extends Envio {
	private boolean entregaRapida;

	public EnvioConEntregaRapida(LocalDate fechaDespacho, String origen, String destino, double peso,
			boolean entregaRapida) {
		super(fechaDespacho, origen, destino, peso);
		this.entregaRapida = entregaRapida;
	}

	public boolean getEntregaRapida() {
		return this.entregaRapida;
	}
	
	

	
	
	

}

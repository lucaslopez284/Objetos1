package ar.edu.unlp.info.oo1.ejercicio13;
import java.util.*;

public class Inversor {
	
	private List<Inversion> carteraDeInversiones;
	
	public Inversor() {
		this.setCarteraDeInversiones(new ArrayList<Inversion>());
	}

	public Inversor(List<Inversion> carteraDeInversiones) {
        if (carteraDeInversiones != null && !carteraDeInversiones.isEmpty()) {
        	this.setCarteraDeInversiones(carteraDeInversiones);
        }
        else this.setCarteraDeInversiones(new ArrayList<Inversion>());
	}

	public List<Inversion> getCarteraDeInversiones() {
		return carteraDeInversiones;
	}

	private void setCarteraDeInversiones(List<Inversion> carteraDeInversiones) {
		this.carteraDeInversiones = carteraDeInversiones;
	}
	
	public void invertir (Inversion unaInversion) {
		if (unaInversion != null) {
			this.getCarteraDeInversiones().add(unaInversion);
		}
	}
	
	public double getValorInversion(Inversion unaInversion) {
		if (this.getCarteraDeInversiones().contains(unaInversion)) {
			return unaInversion.getValorActual();
		}
		else return 0;
	}
	
	public void dejarDeInvertir(Inversion unaInversion) {
        this.getCarteraDeInversiones().remove(unaInversion);
	}
	
    public double valorTotal() {
		return this.getCarteraDeInversiones().stream().mapToDouble(Inversion:: getValorActual).sum();
	}
	
	
	
	

}

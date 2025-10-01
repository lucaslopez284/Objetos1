package ar.edu.unlp.info.oo1.ejercicio14;
import java.util.*;

public class ReporteDeConstruccion {
	List<Pieza> piezas;
	
	
	
	
	public ReporteDeConstruccion() {
		piezas = new ArrayList<Pieza>();
	}
	
	public void agregarPieza (Pieza p) {
		if (p != null) {
			piezas.add(p);
		}
	}




	public double volumenDeMaterial(String material) {
		return piezas.stream()
				.filter(p -> p.getMaterial().equals(material))
				.mapToDouble(Pieza:: getVolumen)
				.sum();
	}

	public double superficieDeColor(String color) {
		double resultado = piezas.stream()
				          .filter(p -> p.getColor().equals(color))
				          .mapToDouble(Pieza:: getSuperficie)
				          .sum();
		return resultado;
	}

}

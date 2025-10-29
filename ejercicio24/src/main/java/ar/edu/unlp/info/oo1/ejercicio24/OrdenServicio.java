package ar.edu.unlp.info.oo1.ejercicio24;

import java.time.LocalDate;
import java.util.List;

public class OrdenServicio extends Orden {
	private String descripcion;
	private int horas;
	private List<Tecnico> tecnicos;
	
	
	public OrdenServicio(LocalDate fecha, String domicilio, List<Producto> productos,
			String descripcion, int horas, List<Tecnico> tecnicos) {
		super(fecha, domicilio, productos);
		this.descripcion = descripcion;
		this.horas = horas;
		this.tecnicos = tecnicos;
	}


	@Override
	public double calcularCosto() {
		double costoProductos= this.getProductos().stream()
                                                  .mapToDouble(p -> p.getCosto())
                                                  .sum();
		double costoTecnicos = this.tecnicos.stream()
				.mapToDouble(t -> t.getValorHora())
				.sum();
		costoTecnicos = costoTecnicos * this.horas;
		double resultado = costoProductos + costoTecnicos;
		if (this.horas > 10) {
			resultado = resultado * 0.9;
		}
		return resultado;
	}

}

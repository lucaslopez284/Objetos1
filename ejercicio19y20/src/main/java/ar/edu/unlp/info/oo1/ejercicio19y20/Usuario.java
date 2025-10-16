package ar.edu.unlp.info.oo1.ejercicio19y20;
import java.util.*;

public class Usuario {
	
	private String nombre;
	private Integer dni;
	private String direccion;
	private List<Propiedad> propiedades;
	
	public Usuario(String nombre, Integer dni, String direccion) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.direccion = direccion;
		this.propiedades = new ArrayList<Propiedad>();
	}
	
	public void  agregarPropiedad (Propiedad nuevaPropiedad) {
		this.propiedades.add(nuevaPropiedad);
	}
	
	public double calcularIngresos(DateLapse periodo) {
		double sumaTotal = propiedades.stream().mapToDouble(p -> p.calcularIngresos(periodo)).sum();
		return sumaTotal * 0.75;
	}
	
	

}

package ar.edu.unlp.objetos.uno.ejercicio3;
import java.time.LocalDate;
import java.util.*;

public class Presupuesto {
	
	private LocalDate fecha;
	private String cliente;
	private ArrayList<Item> items;
	
	
	public Presupuesto(LocalDate fecha, String cliente) {
		super();
		
		this.fecha = fecha;
		this.cliente = cliente;
		this.items = new ArrayList<Item>();
	}
	
	
	public Presupuesto(String cliente) {
		super();
		this.setFecha(LocalDate.now());
		this.cliente = cliente;
		this.items = new ArrayList<Item>();
	}


	public LocalDate getFecha() {
		return fecha;
	}
	private void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getCliente() {
		return cliente;
	}
	private void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	
	public ArrayList<Item> getItems() {
		return items;
	}


	private void setItems(ArrayList<Item> items) {
		this.items = items;
	}


	void agregarItem (Item i) {
		if (i != null) {
			this.getItems().add(i);
		}
	}
	
	double calcularTotal () {
		double aux = 0;
		for (Item i: this.getItems()) {
			aux+= i.costo();
		}
		return aux;
	}
	
	

}

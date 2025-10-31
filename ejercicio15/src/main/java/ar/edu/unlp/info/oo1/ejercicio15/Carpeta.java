package ar.edu.unlp.info.oo1.ejercicio15;
import java.util.*;

public class Carpeta {
	private String nombre;
	private List<Email> emails;
	
	public Carpeta(String nombre) {
		this.nombre = nombre;
		this.emails = new ArrayList<Email>();
	}

	public String getNombre() {
		return nombre;
	}

	public List<Email> getEmails() {
		return emails;
	}
	
	public void agregarEmail(Email unEmail) {
		this.getEmails().add(unEmail);
	}
	
	public void eliminarMail(Email unEmail) {
		if (this.getEmails().contains(unEmail)) {
			this.getEmails().remove(unEmail);
		}
	}
	
	public void mover (Email unEmail, Carpeta destino) {
		if (this.getEmails().contains(unEmail)) {
			this.eliminarMail(unEmail);
			destino.agregarEmail(unEmail);
		}
	}
	
	public Email buscar (String texto) {
		return this.getEmails().stream()
		                 .filter(e-> e.cumple(texto))
		                 .findFirst()
		                 .orElse(null);
	}
	
	
	
	public int tamaño() {
		return this.getEmails().stream().mapToInt(Email::tamaño).sum();
	}
	
	public int cantidadEmails() {
		return this.getEmails().size();
	}
	
	public BagImpl cantidadMailsPorCategoria() {
		BagImpl<String> resultado = new BagImpl<String>();
		this.getEmails().stream()
		                .map(e-> e.registrar())
		                .forEach(resultado:: add);
		
		return resultado;
	}

}

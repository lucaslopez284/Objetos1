package ar.edu.unlp.info.oo1.ejercicio15;
import java.util.*;

public class Email {
	
	private String titulo;
	private String cuerpo;
	private List<Archivo> archivos;
	
	
	public Email(String titulo, String cuerpo) {
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.archivos = new ArrayList<Archivo>();
	}
	public String getTitulo() {
		return titulo;
	}
	public String getCuerpo() {
		return cuerpo;
	}
	public List<Archivo> adjuntos() {
		return archivos;
	}
	
	public void agregarArchivo (Archivo unArchivo) {
		this.adjuntos().add(unArchivo);
	}
	
	public void eliminarArchivo (Archivo unArchivo) {
		if (this.adjuntos().contains(unArchivo)) {
			this.adjuntos().remove(unArchivo);
		}
	}
	
	public int tamaño() {
		return this.getTitulo().length()
				+ this.getCuerpo().length()
				+ this.adjuntos().stream().mapToInt(Archivo:: tamaño).sum();
	}
	
	public boolean cumple(String texto) {
		return this.titulo.contains(texto) || this.cuerpo.contains(texto);
	}
	
	

}

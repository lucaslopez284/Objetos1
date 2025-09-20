package ar.edu.unlp.objetos.uno.ejercicio8;
import java.time.*;

public class Mamifero {
  private String nombre;
  private String especie;
  private String identificador;
  private LocalDate fechaNacimiento;
  private Mamifero padre;
  private Mamifero madre;

  public Mamifero(String nombre) {
	super();
	this.nombre = nombre;
  }
  
  public Mamifero() {
	super();
  }

  public String getNombre() {
	return nombre;
  }
  
  public LocalDate getFechaNacimiento() {
	return fechaNacimiento;
  }

  public void setFechaNacimiento(LocalDate fechaNacimiento) {
	this.fechaNacimiento = fechaNacimiento;
  }

  public String getEspecie() {
	return especie;
  }

  public void setEspecie(String especie) {
	this.especie = especie;
  }

  public String getIdentificador() {
	return identificador;
  }

  public void setIdentificador(String identificador) {
	this.identificador = identificador;
  }

  public Mamifero getPadre() {
	return padre;
  }

  public Mamifero getMadre() {
	return madre;
  }


  public void setPadre(Mamifero padre) {
	this.padre = padre;
  }

  public void setMadre(Mamifero madre) {
	this.madre = madre;
  }
  
  public Mamifero getAbueloMaterno() {
	  if (this.getMadre() != null) {
		  return this.getMadre().getPadre();
	  }
	  else return null;
  }
  
  public Mamifero getAbuelaMaterna() {
	  if (this.getMadre() != null) {
		  return this.getMadre().getMadre();
	  }
	  else return null;
  }
  
  public Mamifero getAbueloPaterno() {
	  if (this.getPadre() != null) {
		  return this.getPadre().getPadre();
	  }
	  else return null;
  }
  
  public Mamifero getAbuelaPaterna() {
	  if (this.getPadre() != null) {
		  return this.getPadre().getMadre();
	  }
	  else return null;
  }
  
  
  
  public boolean tieneComoAncestroA(Mamifero unMamifero) {
	  boolean aux = (this.getPadre() == unMamifero) || (this.getMadre() == unMamifero);
	  if (!aux && this.getPadre()!= null) {
		  aux = this.getPadre().tieneComoAncestroA(unMamifero);
	  }
	  if (!aux && this.getMadre() != null) {
		  aux = this.getMadre().tieneComoAncestroA(unMamifero);
	  }
	  
	  return aux;
			  
  }
  
  
    

  
  
  
  
  
  

}

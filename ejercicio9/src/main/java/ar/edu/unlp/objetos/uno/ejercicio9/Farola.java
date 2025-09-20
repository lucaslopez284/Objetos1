package ar.edu.unlp.objetos.uno.ejercicio9;
import java.util.*;

public class Farola {
	private boolean encendida;
	private List<Farola> vecinos;
	
   public Farola () {
		this.encendida = false;
		this.vecinos = new ArrayList<Farola>();
   }
   
   public void pairWithNeighbor(Farola otraFarola ) {
	   if (!this.vecinos.contains(otraFarola)) {
		   this.vecinos.add(otraFarola);
		   otraFarola.vecinos.add(this);
	   }
   }

   public List<Farola> getNeighbors (){
	   return new ArrayList<Farola>(this.vecinos);
   }



   public void turnOn() {
	   if (!this.isOn()) {
		   encendida = true;
		   for (Farola f: this.vecinos) {
			   f.turnOn();;
		   }
	   }
   }


   public void turnOff() {
	   if (this.isOn()) {
		   encendida = false;
		   for (Farola f: this.vecinos) {
			   f.turnOff();
		   }
	   }
   }




   public boolean isOn() {
	   boolean aux = false;
	   if (this.encendida) {
		   aux = true;
	   }
	   return aux;
   }
   
   public boolean isOff() {
	   boolean aux = false;
	   if (!this.encendida) {
		   aux = true;
	   }
	   return aux;
   }

   } 

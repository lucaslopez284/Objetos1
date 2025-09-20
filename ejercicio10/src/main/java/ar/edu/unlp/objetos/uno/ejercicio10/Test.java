package ar.edu.unlp.objetos.uno.ejercicio10;

public class Test {

	public static void main(String[] args) {
		Gerente alan = new Gerente("Alan Turing");
		double aportesDeAlan = alan.aportes();
		Gerente alan2 = new Gerente("Alan Turing");
		double sueldoBasicoDeAlan = alan2.sueldoBasico();
		
		System.out.println("Aportes: " + aportesDeAlan); 
		System.out.println("Sueldo basico: " + sueldoBasicoDeAlan); 
	}

}

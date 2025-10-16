package ar.edu.unlp.info.oo1.ejercicio21;

public class clienteCorporativo extends Cliente{
	
	private String cuit;

	public clienteCorporativo(String direccion, String nombre, String cuit) {
		super(direccion, nombre);
		this.cuit = cuit;
	}
	
	
	

}

package ar.edu.unlp.info.oo1.ejercicio15;
import java.util.*;

public class ClienteDeCorreo {
	
	private List<Carpeta> carpetas;
	private Carpeta inbox;

	public ClienteDeCorreo() {
		this.carpetas = new ArrayList<Carpeta>();
		this.inbox = new Carpeta("inbox");
		this.carpetas.add(inbox);
	}
	
	
	
	public Carpeta getInbox() {
		return inbox;
	}


	public List<Carpeta> getCarpetas() {
		return carpetas;
	}
	
	public void agregarCarpeta(Carpeta unaCarpeta) {
		this.getCarpetas().add(unaCarpeta);
	}
	
	public void eliminarCarpeta (Carpeta unaCarpeta) {
		if (unaCarpeta != this.getInbox()) {
			if (this.getCarpetas().contains(unaCarpeta)) {
				this.getCarpetas().remove(unaCarpeta);
			}
		}
	}

    public void recibir (Email unEmail) {
    	this.getInbox().agregarEmail(unEmail);
    }
    
    
    public Email buscar(String texto) {
    	return this.getCarpetas().stream()
                .map(c -> c.buscar(texto))  
                .filter(e -> e != null)      
                .findFirst()
                .orElse(null);   			          
    }
    
    public int espacioOcupado() {
		return this.getCarpetas().stream().mapToInt(Carpeta::tamaño).sum();
	}
	
	

}

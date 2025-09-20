package ar.edu.unlp.oo1.ejercicio1;

/**
 * Completar esta clase de acuerdo a lo especificado
 */
public class WallPost {
	
	private String texto;
	private int likes;
	private boolean destacado;
	
	

	public WallPost() {
		this.texto = "Undefined post";
		this.likes = 0;
		this.destacado = false;
	}

	/**
	 * Retorna el texto descriptivo de la publicación
	 * 
	 * @return
	 */
	String getText() {
		return this.texto;
	};

	/**
	 * Setea el texto descriptivo de la publicación
	 * @param text
	 */
	void setText(String text) {
		this.texto = text;
	};

	/**
	 * Retorna la cantidad de “me gusta”
	 * 
	 * @return
	 */
	int getLikes() {
		return this.likes;
	};

	/**
	 * Incrementa la cantidad de likes en uno
	 */
	void like() {
		this.likes = this.getLikes() + 1;
		
	};

	/**
	 * Decrementa la cantidad de likes en uno. Si ya es 0, no hace nada
	 */
	void dislike() {
		if (this.getLikes() > 0) {
			this.likes = this.getLikes() - 1;
		}
	};

	/**
	 * Retorna true si el post está marcado como destacado, false en caso contrario
	 * 
	 * @return
	 */
	boolean isFeatured() {
		boolean aux = this.destacado;
		return aux;
	};

	/**
	 * Cambia el post del estado destacado a no destacado y viceversa
	 */
	void toggleFeatured() {
		if (this.isFeatured()) {
			this.destacado = false;
		}
		else {
			this.destacado = true;
		}
	};

	/*
	 * Este mensaje se utiliza para que una instancia de Wallpost se muestre de forma adecuada
	 */
	@Override
	public String toString() {
		return "WallPost {" +
			"text: " + getText() +
			", likes: '" + getLikes() + "'" +
			", featured: '" + isFeatured() + "'" +
			"}";
	}

}
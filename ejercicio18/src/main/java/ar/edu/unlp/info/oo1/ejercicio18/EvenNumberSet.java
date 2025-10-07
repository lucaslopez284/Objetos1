package ar.edu.unlp.info.oo1.ejercicio18;
import java.util.Set;
import java.util.HashSet;

public class EvenNumberSet extends HashSet<Integer>{
	private Set<Integer> numerosPares;
	
	
	
	public boolean add(Integer numero) {
		if ((int) numero % 2 == 0) {
			return super.add(numero);
		}
		return false;
	}
	
	public static void main(String[] args) {
		Set<Integer> numbers = new EvenNumberSet(); 
		// inicialmente el Set está vacío => []
		numbers.add(1); // No es par, entonces no se agrega => []
		numbers.add(2); // Es par, se agrega al set => [2]
		numbers.add(4); // Es par, se agrega al set => [2, 4]
		numbers.add(2); // Es par, pero ya está en el set, no se agrega => [2, 4]
		System.out.println(numbers);



	}
	
	
	

}

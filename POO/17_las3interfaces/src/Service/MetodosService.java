package Service;

import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;


import interfaz.Metodos;


public class MetodosService implements Metodos{

	@Override
	public void Metodos(Collection<Integer> numeros, Consumer <Integer> operacion, Predicate<Integer> condicion) {
		for(Integer n:numeros) {
			if(condicion.test(n)) {
				operacion.accept(n);
			}
		}
		
	}
	public int SumaConExtra(List<Integer> numeros, Supplier<Integer> sup) {
		int suma=0;
	return 1;	
	}

}

package interfaz;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Consumer;
public interface Metodos {

	public void Metodos(Collection<Integer> numeros, Consumer<Integer> operacion , Predicate <Integer> condicion);
	
	
}

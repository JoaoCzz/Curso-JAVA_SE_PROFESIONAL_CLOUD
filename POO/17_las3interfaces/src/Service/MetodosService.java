package Service;

import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
	
	public void m1(Set<Integer> numeros, Function <String,Integer> fn) {
		
	}
	public void m2(Supplier<String> sp,Consumer <Integer> Operacion) {
		
	}
	public void m3(BinaryOperator<Double> db,BiFunction<Integer,String,Integer> bf) {
		
	}
	public void m4(BiConsumer <String,Double> bc, BiPredicate<String,Long> bp) {	
	}
	public void m5(IntSupplier id,List<String> lst) {
	}
	public void m6(Map<String,Integer> mp,BiConsumer<String,Long>bc) {	
	}
	public void m7(Function<String,List<Integer>> f) {
		
	}

}

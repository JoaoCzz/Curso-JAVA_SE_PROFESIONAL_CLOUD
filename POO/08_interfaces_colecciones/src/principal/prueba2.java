package principal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class prueba2 {

	public static void main(String[] args) {
		List<Integer> coleccion1= new ArrayList<Integer>();
		coleccion1.add(2);
		coleccion1.add(3);
		ArrayList<Integer> coleccion2= new ArrayList();
		coleccion2.add(1);
		coleccion2.add(2);
		coleccionPro(coleccion1,coleccion2);
		System.out.println(iguales(coleccion1,coleccion2));

		
	}
	public static Set<Integer>coleccionPro(Collection <Integer> coleccion1, Collection <Integer> coleccion2){
		Set<Integer> nuevaColeccion= new HashSet<>();
		nuevaColeccion.addAll(coleccion1);
		nuevaColeccion.addAll(coleccion2);
		return nuevaColeccion;
	}
	
	public static Set<Integer>iguales(Collection <Integer> coleccion1, Collection <Integer> coleccion2){
		Set<Integer> nuevaColeccion= new HashSet<>();
		for(Integer e:coleccion1) {
			if(coleccion2.contains(e)) {
				nuevaColeccion.add(e);
			}
		}
		return nuevaColeccion;
	}
	
	
}

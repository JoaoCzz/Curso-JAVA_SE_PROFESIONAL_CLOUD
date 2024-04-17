package Service;

import java.util.ArrayList;
import java.util.List;

import Interfaz.condicion;

public class OperacionesService extends ArrayList<Integer>{
	
	
	public static int sumadepares(List<Integer> numeros) {
		int resultado=0;
		for(Integer i: numeros) {
			if(i%2==0) {
				resultado+=i;
			}
		}
		return resultado;
	}
	
	public static int sumadepositivos(List<Integer> numeros) {
		int resultado=0;
		for(Integer i: numeros) {
			if(i>0) {
				resultado+=i;
			}
		}
		return resultado;
	}
	
	
	public void eliminarcondicion(List<Integer> Numero, condicion Condicion) {
		for(Integer i:Numero){
		if(Condicion.test(i)) {
			 super.remove(i);
		}
		}
	}

}

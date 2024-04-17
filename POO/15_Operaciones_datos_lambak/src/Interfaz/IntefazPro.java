package Interfaz;

import java.util.List;

public interface IntefazPro {
	
	static int sumaporcondicion(List<Integer> Numero,condicion Condicion) {
		int suma=0;
		for(Integer i:Numero) {
			if(Condicion.test(i)) {
				suma+=i;	
			}
			
		}
		return suma;
	}
	
	

}

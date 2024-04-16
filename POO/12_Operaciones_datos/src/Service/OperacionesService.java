package Service;

import java.util.List;

public class OperacionesService {
	
	
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

}

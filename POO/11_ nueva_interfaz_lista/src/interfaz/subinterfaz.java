package interfaz;

import java.util.ArrayList;
import java.util.List;

public interface subinterfaz extends List<Integer>{
	
public static List <Integer> ofPares(int n){
	List<Integer> pares= new ArrayList<>();
	for(int i=2;i<=n;i+=2) {
		pares.add(i);
	}
	return pares;
}

public static List<Integer> ofPositivo(int... data){
	List<Integer> positivos= new ArrayList<>();
	for(int i:data){
		if(i>=0) {
			positivos.add(i);
		}
	}
	return positivos;
}

}

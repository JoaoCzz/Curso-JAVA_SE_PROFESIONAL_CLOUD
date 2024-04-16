package principal;

import java.util.List;

import Interfaz.IntefazPro;
import Interfaz.condicion;

class Positivos implements condicion{

	@Override
	public boolean test(Integer n) {
		return n>0;
	}
	
}

class Negativos implements condicion{

	@Override
	public boolean test(Integer n) {
		return n<0;
	}
	
}

class Pares implements condicion{

	@Override
	public boolean test(Integer n) {
		
		return n%2==0;
	}

class Impares implements condicion{

	@Override
	public boolean test(Integer n) {
		
		return n%2==1;
	}
	
}
}

public class main {
	public static void main(String[] args) {
		List <Integer> numeros= List.of(3,-2,8,5,1,17,22,-9,6,12);
		System.out.println(IntefazPro.sumaporcondicion(numeros, new Positivos()));
		System.out.println(IntefazPro.sumaporcondicion(numeros, new Pares()));
		
	}
		
	
	
	

}

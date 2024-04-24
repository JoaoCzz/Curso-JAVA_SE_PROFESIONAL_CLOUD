package pruebas;

import java.util.List;

public class test12Peek {
	public static void main(String[] args) {
		List<Integer> nums= List.of(11,4,5,8,2,7,5,8);
		//muestra cada numero de la lista, sin contar duplicados
	System.out.println("Total de numeros "+nums.stream().distinct().peek(n-> System.out.println(n)).count());
		nums.stream().peek(n-> System.out.println(n)).count();
		
		
		
	}

	

}

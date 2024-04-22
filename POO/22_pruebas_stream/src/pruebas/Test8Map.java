package pruebas;

import java.util.List;

public class Test8Map {
	public static void main(String[] args) {
		List<Integer> nums= List.of(25,2,8,-3,2,4,11,-1,-20,8);
		//suma todos los numeros negativos
		nums.stream()
        .filter(n -> n < 0)
        .mapToInt(n -> n)
        .sum();
		//media de los positivos sin duplicados
		nums.stream().filter(n -> n>0)
		.distinct()
		.mapToInt(n -> n)
		.average();
		
	}

}

package pruebas;

import java.util.List;

public class test3Limit {
public static void main(String[] args) {
	List<Integer> nums= List.of(25,2,8,-3,2,4,11,-1,-20,8);
	//imprime los 5 primeros numero y sin incluir repetidos
	nums.stream().distinct().limit(5).forEach(System.out::println);
	
	}
}


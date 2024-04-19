package pruebas;

import java.util.List;

public class Test4 {
	public static void main(String[] args) {
		List<Integer> nums= List.of(25,2,8,-3,2,4,11,-1,-20,8);
		//Hay algun negativo?
		System.out.println(nums.stream().anyMatch(n -> n<0));
		//SOn todos pares?
		System.out.println(nums.stream().anyMatch(n-> n%2==0));
	}
}

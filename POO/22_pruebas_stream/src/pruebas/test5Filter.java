package pruebas;

import java.util.List;

public class test5Filter {
	public static void main(String[] args) {
		List<Integer> nums= List.of(25,2,8,-3,2,4,11,-1,-20,8);
		System.out.println(nums.stream().filter(n -> n>0).distinct().count());
		
	}
}

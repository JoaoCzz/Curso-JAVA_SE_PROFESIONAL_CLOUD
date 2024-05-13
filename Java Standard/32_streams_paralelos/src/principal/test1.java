package principal;

import java.util.List;

public class test1 {
	public static void main(String[] args) {
		List<Integer> nums= List.of(5,11,4,22,3,11,5,9,4,6);
		System.out.println(nums.stream().parallel().distinct().count());
		//muestra los positivos no duplicados
		nums.stream().distinct().filter(c -> c>0).forEach(System.out::println);
	}

}

package pruebas;

import java.util.List;

public class test13Peak {
public static void main(String[] args) {
	List<Integer> nums= List.of(5,7,2,-3,8,14,9);
	System.out.println("¿Negativos?: "+ nums.stream().peek(n -> System.out.println(n)).anyMatch(n->n<0));
}
}

package principal;

import java.util.List;

public class test2 {
public static void main(String[] args) {
	List<Integer> nums= List.of(5,11,4,22,3,11,5,9,4,6);
	nums.parallelStream().peek(System.out::println).anyMatch(n -> n>10);
}
}

package principal;

import java.util.HashSet;

public class PruebaConjunto {
	public static void main(String[] args) {
		HashSet <Double> nums= new HashSet<>();
		nums.add(30.0);
		nums.add(80.0);
		nums.add(21.3);
		for(Double s:nums) {
			s=s+1;
		}
		for(Double s:nums) {
			System.out.println(s);
		}
	}

}

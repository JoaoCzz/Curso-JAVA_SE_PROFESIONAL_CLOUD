import java.util.ArrayList;
import java.util.List;

public class TestForEach {
	public static void main(String[] args) {
		List<Integer> nums= new ArrayList<> (List.of(3,18,9,-3,2,-8));
//		for(Integer n:nums) {
//			System.out.println(n);
//		}
		//Programacion funcional
		nums.forEach(n->System.out.println(n));
		nums.removeIf(n->n<0);
		nums.forEach(n->System.out.println(n));
		
		}

}

import java.util.ArrayList;
import java.util.List;

public class TestReplaceAll {
public static void main(String[] args) {
	List<Integer> nums= new ArrayList<> (List.of(3,18,9,-3,2,-8));
	nums.replaceAll(n -> (int)((double)n/2));
	nums.forEach(n -> System.out.println((double)n));
}
}

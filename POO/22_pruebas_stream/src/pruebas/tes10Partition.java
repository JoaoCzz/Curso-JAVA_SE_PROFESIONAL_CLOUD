package pruebas;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class tes10Partition {
public static void main(String[] args) {
	List<Integer> nums= List.of(25,2,8,-3,2,4,11,-1,-20,8);
	Map<Boolean,List<Integer>> tabla= nums.stream().collect(Collectors.partitioningBy(c-> c>0));
}
}

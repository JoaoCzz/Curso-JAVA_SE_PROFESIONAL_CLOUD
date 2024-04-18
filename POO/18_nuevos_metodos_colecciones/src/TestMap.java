import java.util.HashMap;

public class TestMap {
public static void main(String[] args) {
	HashMap<String,Integer> ciudades = new HashMap<>();
	ciudades.put("Madrid", 320000);
	ciudades.put("Londres", 500000);
	ciudades.put("Paris",450000);
	ciudades.put("Madrid", 320000);
	
	ciudades.forEach((k,v)->System.out.println(k+ " "+v));
	
}
}

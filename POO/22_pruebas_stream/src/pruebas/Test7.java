package pruebas;

import java.util.List;

public class Test7 {
	public static void main(String[] args) {
		List<String> cads= List.of("cadena","otra","fin","sale","casa","paraiso");
		//muestra las longitudes de todas las cadenas, sin repetir longitudes
		cads.stream()
		.map(n->n.length())
		.distinct()
		.forEach(System.out::println);
	}

}

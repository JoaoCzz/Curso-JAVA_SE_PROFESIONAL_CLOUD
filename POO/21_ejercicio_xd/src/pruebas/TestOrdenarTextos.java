package pruebas;

import java.util.ArrayList;
import java.util.List;

public class TestOrdenarTextos {
	public static void main(String[] args) {
		List<String> textos= new ArrayList<>(List.of("hello","by","args"));
		textos.sort((a,b)->a.compareTo(b));
		textos.forEach(s -> System.out.println(s));
	}

}

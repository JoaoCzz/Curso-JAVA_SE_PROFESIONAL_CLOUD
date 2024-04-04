package Service;

import java.util.HashSet;

import Model.Direccion;

public class BuscadorService {
	HashSet <Direccion> direcciones= new HashSet<>();
	
	public BuscadorService() {
		direcciones.add(new Direccion("http://www.amazon.es/", "libros", "web de libros y más cosas"));
		direcciones.add(new Direccion ("http://www.fnac.es/", "libros", "libreria completa"));
		direcciones.add(new Direccion ("http://www.travel.es/", "viajes", "viajes por el mundo"));
		direcciones.add(new Direccion("http://www.travel.es/", "viajes", "viajes por el mundo"));
		direcciones.add(new Direccion("http://www.game.es/", "juegos", "el mundo del juego"));
		direcciones.add(new Direccion("http://www.fly.com/", "viajes", "vuelos a todos los destinos"));
	    direcciones.add(new Direccion("http://www.casadellibro.es/", "libros", "libros de todos los temas")); 
	  
		
	}
	
	public HashSet <Direccion> buscadorTematicas(String tematica) {
		HashSet <Direccion> auxiliar= new HashSet<>();
		for(Direccion direcciones: direcciones) {
			if(tematica.equals(direcciones.getTematica())) {
				auxiliar.add(direcciones);
			}
		}
		return auxiliar;
	}

}

package Service;

import java.util.HashSet;
import modelo.Ciudad;

public class CiudadService {
   HashSet <Ciudad> ciudades = new HashSet<>();
   public boolean crearCiudad (Ciudad ciudad) {
	   if(!ciudad.getPais().contains(ciudad.getNombre())) {
		   ciudades.add(ciudad);
		return true;   
	   }
	   return false;	
	}
   
   public HashSet<Ciudad> ciudadmayorPoblacion(){
	   HashSet<Ciudad> ciudadesConMayorPoblacion = new HashSet<>();
	   int mayor=0;
	   for(Ciudad ciudades:ciudades) {
		   if(ciudades.getHabitantes()>mayor) {
			   mayor= ciudades.getHabitantes();
		   }  
	        }
	   for (Ciudad ciudades : ciudades) {
           if (ciudades.getHabitantes() == mayor) {
               ciudadesConMayorPoblacion.add(ciudades);
           }
         
	   }
	   return ciudadesConMayorPoblacion;
   }
   public HashSet <Ciudad> buscadorPais(String pais) {
		HashSet <Ciudad> auxiliar= new HashSet<>();
		for(Ciudad ciudades: ciudades) {
			if(pais.equals(ciudades.getPais())) {
				auxiliar.add(ciudades);
			}
		}
		return auxiliar;

}
}

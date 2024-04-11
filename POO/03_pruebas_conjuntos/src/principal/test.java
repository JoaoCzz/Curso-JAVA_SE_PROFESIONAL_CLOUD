package principal;

import java.util.HashSet;
import java.util.Objects;

class Ciudad{
	private String nombre;
	private int poblacion;
	public Ciudad(String nombre, int poblacion) {
		super();
		this.nombre = nombre;
		this.poblacion = poblacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}
	@Override
	public int hashCode() {
		return Objects.hash(nombre, poblacion);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ciudad other = (Ciudad) obj;
		return Objects.equals(nombre, other.nombre) && poblacion == other.poblacion;
	}
	@Override
	public String toString() {
		//return "Ciudad [nombre=" + nombre + ", poblacion=" + poblacion + "]";
		return "{\"nombre\":"+nombre+",\"poblacion\":"+poblacion+"}"; 
	}
	
/*	@Override
	public boolean equals(Object obj) {
		Ciudad aux= (Ciudad)obj;
		if(this.getNombre().equals(aux.getNombre())&&this.getPoblacion()==aux.poblacion) {
			return true;
		}
		return false;
	}
	@Override
	public int hashCode(){
		return nombre.length()+poblacion;
		
	}
	*/
	
	
	
	
	
	
}

public class test {
	public static void main(String[] args) {
		HashSet<Ciudad>ciudades=new HashSet<Ciudad>();	
		ciudades.add(new Ciudad("Madrid",5000000));
		ciudades.add(new Ciudad("Barcelona",3500000));
		ciudades.add(new Ciudad("Madrid",5000000));
		System.out.println(ciudades.size());
		for(Ciudad c:ciudades) {
			//System.out.println(c.getNombre()+" - "+c.getPoblacion());
			System.out.println(c);
		}
	}
	

}

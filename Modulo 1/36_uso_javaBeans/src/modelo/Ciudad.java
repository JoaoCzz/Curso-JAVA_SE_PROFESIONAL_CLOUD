package modelo;

public class Ciudad {
	private String nombre;
	private int poblacion;
	private double temperatura;
	
	
	public Ciudad(String nombre,int poblacion,double Temperatura) {
		this.nombre=nombre;
		this.poblacion= poblacion;
		this.temperatura= temperatura;
	}
	
	public Ciudad() {
		
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	public String getNombre() {
		return nombre;
	}
	public int getPoblacion() {
		return poblacion;
	}
	public double getTemperatura() {
		return temperatura;
	}
	

}

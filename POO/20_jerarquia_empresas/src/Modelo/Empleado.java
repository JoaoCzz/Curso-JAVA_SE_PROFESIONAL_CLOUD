package Modelo;

import java.time.LocalDate;

public abstract  class Empleado {
	String nombre;
	int edad;
	LocalDate fechaIngreso;
	double salario;
	
	
	
	public Empleado() {
		super();
	}

	public Empleado(String nombre, int edad, LocalDate fechaIngreso, double salario) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.fechaIngreso = fechaIngreso;
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public static double getBono() {
		return bono;
	}

	public static void setBono(double bono) {
		Empleado.bono = bono;
	}

	public abstract void incentivar();
		
	private static double bono=100.0;

}

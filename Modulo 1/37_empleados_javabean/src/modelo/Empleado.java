package modelo;

public class Empleado {
private String nombre;
private String correo;
private int edad;
private int codigo;

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getCorreo() {
	return correo;
}
public void setCorreo(String correo) {
	this.correo = correo;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
public Empleado(String nombre, String correo, int edad, int codigo) {
	this.nombre = nombre;
	this.correo = correo;
	this.edad = edad;
	this.codigo = codigo;
}
public Empleado() {
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Empleado [nombre=" + nombre + ", correo=" + correo + ", edad=" + edad + ", codigo=" + codigo + "]";
}





}

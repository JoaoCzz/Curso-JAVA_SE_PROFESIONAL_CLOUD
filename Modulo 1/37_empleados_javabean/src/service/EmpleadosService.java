package service;

import java.util.Collection;
import java.util.HashMap;

import modelo.Empleado;

public class EmpleadosService {
	
	HashMap <Integer,Empleado> empleados= new HashMap <Integer,Empleado>();
	public boolean agregarEmpleado(Empleado datos){
		if(!empleados.containsKey(datos.getCodigo())) {
			empleados.put( datos.getCodigo(),datos);
			return true;
		}
		return false;
		
	}
	
	public Empleado buscarEmpleado (int codigo) {	
	return empleados.get(codigo);
			
	}
	
	public Empleado eliminarEmpleado (int codigo) {
		return empleados.remove(codigo);
	}
	
	public Empleado [] todosEmpleados() {
Collection<Empleado> todos= empleados.values();
  return todos.toArray(new Empleado [0]);
	}
	
	
	
	
	

}

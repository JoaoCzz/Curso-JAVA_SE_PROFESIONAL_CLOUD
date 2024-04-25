package Servicio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;
import java.io.FileReader;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import Modelo.Empleado;

public class EmpleadoService {
	
	String dir="C:\\Users\\manana\\Downloads\\empleados.json";		
	private Stream <Empleado> getEmpleados(){
		try {
			Gson gson= new Gson();
			return Arrays.stream(gson.fromJson(new FileReader(dir), Empleado[].class));
		}catch (JsonSyntaxException | JsonIOException | FileNotFoundException e){
			e.printStackTrace();
			return Stream.empty();
		}
	}

	public List <Empleado>empleadoPorDepa(String departamento){
		return  getEmpleados().filter(p -> p.getDepartamento().equals(departamento)).toList();
		
	}
	public Empleado empleadoMayorSalario() {
		return getEmpleados().max(Comparator.comparingDouble(p -> p.getSalario())).orElse(null);
	}
	public List<String> listadeDepartamentos(){
		return getEmpleados().map(p -> p.getDepartamento()).distinct().toList();
	}
	
}

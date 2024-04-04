package presentacion;

import java.util.Arrays;
import java.util.Scanner;

import modelo.Empleado;
import service.EmpleadosService;

public class main {
	static EmpleadosService service= new EmpleadosService();
	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		int opcion;
		teclado.nextLine();
		do{
			Menu();
			opcion= teclado.nextInt();
			switch(opcion) {
			case 1:
				darDeAlta();
				break;
			case 2:
				BuscarEmpleado();
				break;
			case 3:
				EliminarEmpleado();
				break;
			case 4:
				TodoslosEmpleados();
				break;
			case 5:
				System.out.println("Adios!");
				break;
			default:
				System.out.println("Opción no válida!");
		}
	
		}while(opcion!=5);
		
		}
	
	static void darDeAlta(){
		Empleado datos = new Empleado();
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el codigo:");
		datos.setCodigo(Integer.parseInt(sc.nextLine()));		
		System.out.println("Introduce el nombre:");
		datos.setNombre(sc.nextLine());
		System.out.println("Introduce tu edad:");
		datos.setEdad(Integer.parseInt(sc.nextLine()));
		System.out.println("Introduce el correo:");
		datos.setCorreo(sc.nextLine());
		
		if(service.agregarEmpleado(datos)){
			System.out.println("Añadido");
		}else {
			System.out.println("No ha sido añadido");
		}
	}
		
	static void BuscarEmpleado(){
		int codigo;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el codigo:");
		codigo=Integer.parseInt(sc.nextLine());
		Empleado datos= service.buscarEmpleado(codigo);
		if(datos.getNombre()==null) {
			System.out.println("No existe");
	}else {
			System.out.println("El empleado es: "+ datos);
	}	
	}
	
	static void EliminarEmpleado(){
		int codigo;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el codigo:");
		codigo=Integer.parseInt(sc.nextLine());
		Empleado datos= service.eliminarEmpleado(codigo);
		if(datos.getNombre()==null) {
			System.out.println("No existe");
	}else {
			System.out.println("El empleado eliminado: "+ datos);
	}	
	}
	
	static void TodoslosEmpleados() {
		Empleado [] empleados= service.todosEmpleados();
		for(Empleado e: empleados) {
			System.out.println("Nombre: "+e.getNombre()+"\r\n" +
								"Edad: "+e.getEdad()+ "\r\n"+
								"Correo: " +e.getCorreo()+"\r\n");
		}
	}
	
	static void Menu(){
		System.out.println("Hola Elige una opcion \r\n" 
				+ "1.- Nuevo Empleado\r\n"
				+ "2.- Buscar empleado\r\n"
				+ "3.- Eliminar empleado\r\n"
				+ "4.- Mostrar nombres de todos los empleados\r\n"
				+ "5.- Salir");	
	}
	
	}



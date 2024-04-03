package presentacion;

import java.util.Arrays;
import java.util.Scanner;

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
		int codigo;
		String nombre;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el codigo:");
		codigo=Integer.parseInt(sc.nextLine());		
		System.out.println("Introduce el nombre:");
		nombre= sc.nextLine();
		if(service.agregarEmpleado(codigo, nombre)){
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
		String nombre= service.buscarEmpleado(codigo);
		if(nombre==null) {
			System.out.println("No existe");
	}else {
			System.out.println("El empleado es: "+ nombre);
	}	
	}
	
	static void EliminarEmpleado(){
		int codigo;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el codigo:");
		codigo=Integer.parseInt(sc.nextLine());
		String nombre= service.eliminarEmpleado(codigo);
		if(nombre==null) {
			System.out.println("No existe");
	}else {
			System.out.println("El empleado eliminado: "+ nombre);
	}	
	}
	
	static void TodoslosEmpleados() {
		String [] empleados= service.todosEmpleados();
		System.out.println("Empleados: "+ Arrays.toString(empleados));
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



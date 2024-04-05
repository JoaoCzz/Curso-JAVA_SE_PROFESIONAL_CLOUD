package view;

import java.util.Scanner;

import Service.CiudadService;

public class view {
	static CiudadService service= new CiudadService();
	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		int opcion;
		teclado.nextLine();
		do{
			Menu();
			opcion= teclado.nextInt();
			switch(opcion) {
			case 1:
				añadirCiudad();
				break;
			case 2:
				BuscarEmpleado();
				break;
			case 3:
				EliminarEmpleado();
				break;
			case 4:
				System.out.println("Adios!");
				break;
			default:
				System.out.println("Opción no válida!");
		}
	
		}while(opcion!=4);
		
		}
	static void añadirCiudad() {
		Ciudad city= new Ciudad();
	
	}

}

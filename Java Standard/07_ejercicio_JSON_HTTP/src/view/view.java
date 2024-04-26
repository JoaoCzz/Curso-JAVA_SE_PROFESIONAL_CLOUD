package view;

import java.util.Scanner;

import Service.PaisesService;

public class view {
	static PaisesService service= new PaisesService();
public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);
	int opcion;
	teclado.nextLine();
	do{
	try {
			Menu();
			opcion= Integer.parseInt(teclado.nextLine());
			switch(opcion) {
			case 1:
				ListadeContinentes();
				break;
			case 2:
				PaisPorContinente();
				break;
			case 3:
				PaisMasPoblado();
				break;
			case 4:
				PaisesAporContinente();
				break;
			case 5:
				PaisPorCapital();
				break;
			default:
				System.out.println("Adios!");
		}
	
	}catch(Exception ex) {
		System.out.println("Introduce un numero kbron");
		teclado.nextLine();
		opcion = 0;
}
	}while(opcion!=6);	

	}
static void Menu(){
	System.out.println("Hola Elige una opcion \r\n" 
			+ "1.- Lista de continentes: \r\n"
			+ "2.- Lista de paises por continente: \r\n"
			+ "3.- Pais mas poblado: \r\n"
			+ "4.- Pais por continente  \r\n "
			+ "5.- Pais por capital \r\n"
			+ "6.- Salir");	
}
static void ListadeContinentes() {
	System.out.println(service.listaContientes());
}
static void PaisPorContinente() {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Escribe el continente");
	 String continente= sc.nextLine();
	 System.out.println(service.listaPaisesporContiente(continente));
	 
}
static void PaisMasPoblado() {
	System.out.println(service.paismasHabitado());
}
static void PaisesAporContinente() {
	System.out.println(service.paisesporContiente());
}
static void PaisPorCapital() {
	Scanner sc=new Scanner(System.in);
	 System.out.println("Escribe la capital");
	 String capital= sc.nextLine();
	 System.out.println(service.paisporCapital(capital));
}
}

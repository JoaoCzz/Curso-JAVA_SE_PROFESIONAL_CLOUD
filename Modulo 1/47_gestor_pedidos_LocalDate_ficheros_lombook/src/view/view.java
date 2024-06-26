package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;

import modelo.Pedidos;
import service.PedidosService;
import curso.io.LectorTeclado;
public class view {
	static PedidosService service= new PedidosService();
	
	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		LectorTeclado lector= new LectorTeclado();
		int opcion=0;
		do{
		try {
				Menu();
				opcion= Integer.parseInt(teclado.nextLine());
				System.out.println("Opción seleccionada: " + opcion);
				switch(opcion) {
				case 1:
					newPedido();
					break;
				case 2:
					masreciente();
					break;
				case 3:
					PedidosEntre();
					break;
				case 4:
					xd();
					break;
				case 5:
					System.out.println("Adios!");
				default:
					System.out.println("Opción no válida!");
			}
		
		}catch(Exception ex) {
			System.out.println("Introduce un numero kbron");
			teclado.nextLine();
			opcion = 0;
	}
		}while(opcion!=5);	
	
		}
		
		
	
		
	static void newPedido() {
		Pedidos p= new Pedidos();
		Scanner sc=new Scanner(System.in);
		String fecha;
		System.out.println("Introduce el Producto:");
		p.setProducto(sc.nextLine());		
		System.out.println("Introduce la cantidad que quieres:");
		p.setUnidades(Integer.parseInt(sc.nextLine()));
		System.out.println("Introduce la fecha: ");
		fecha= sc.nextLine();
		LocalDate fechaP= LocalDate.parse(fecha,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		p.setFPedido(fechaP);
		if(service.crearPedido(p)) {
			System.out.println("Pedido creado");
		}else {
			System.out.println("Nel");
		}
	}
     static void masreciente(){
    	 Pedidos masReciente =service.pedidoMasreciente();
    	 if (masReciente != null) {
             System.out.println("El pedido más reciente es: " + masReciente);
         } else {
             System.out.println("No hay pedidos registrados.");
         }
	}
     
     
     
     
     static void PedidosEntre(){
    	 Scanner sc=new Scanner(System.in);
 		 String fecha; 
 		 String fecha2;
 		 LocalDate fechaD = null;
 		 LocalDate fecha2D= null;
 		 System.out.println("Escribe la primera fecha: ");
 		 fecha= sc.nextLine();
 		 fechaD= LocalDate.parse(fecha,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	System.out.println("Escribe la segunda fecha: ");
 fecha2= sc.nextLine();
		fecha2D= LocalDate.parse(fecha2,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		service.RangoEntre(fechaD, fecha2D);
		 System.out.println("Pedidos entre " + fecha + " y " + fecha2 + ": ");
		 for (Pedidos pedido : service.RangoEntre(fechaD, fecha2D)) {
		     System.out.println(pedido);
		 }
		 
     }
     
     static void Menu(){
 		System.out.println("Hola Elige una opcion \r\n" 
 				+ "1.- Nuevo Pedido: \r\n"
 				+ "2.- Pedido mas reciente: \r\n"
 				+ "3.- Pedidos entre: \r\n"
 				+ "4.- El proximo  \r\n "
 				+ "5.- Salir");	
 	}
     static void xd() {
    	 
    	 Scanner sc=new Scanner(System.in);
 		 String fecha;
 		 LocalDate fechaD;
 		 System.out.println("Escribe la primera fecha: ");
		 fecha= sc.nextLine();
		 fechaD= LocalDate.parse(fecha,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
 		Pedidos masReciente =service.pedidoProximaFecha(fechaD);
    	 if (masReciente != null) {
             System.out.println("El pedido más reciente es: " + masReciente);
         } else {
             System.out.println("No hay pedidos registrados.");
         }
     }
     

}

package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;

import modelo.Pedidos;
import service.PedidosService;

public class view {
	
	static PedidosService service= new PedidosService();
	
	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		int opcion;
		teclado.nextLine();
		do{
			Menu();
			opcion= teclado.nextInt();
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
				System.out.println("Adios!");
				break;
			default:
				System.out.println("Opción no válida!");
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
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		try {
			p.setfPedido(formato.parse(fecha));
		} catch (ParseException e) {
			System.out.println("Nel no es el formato");
		}
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
 		 Date fechaD = null;
 		 Date fecha2D= null;
 		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
 		 System.out.println("Escribe la primera fecha: ");
 		 fecha= sc.nextLine();
 		 try {
			fechaD= formato.parse(fecha);
 		System.out.println("Escribe la segunda fecha: ");
		 fecha2= sc.nextLine();
			fecha2D= formato.parse(fecha2);
			service.RangoEntre(fechaD, fecha2D);
			 System.out.println("Pedidos entre " + fecha + " y " + fecha2 + ": ");
	         for (Pedidos pedido : service.RangoEntre(fechaD, fecha2D)) {
	             System.out.println(pedido);
	         }
		} catch (ParseException e) {
			System.out.println("nel");
		}
		 
     }
     
     static void Menu(){
 		System.out.println("Hola Elige una opcion \r\n" 
 				+ "1.- Nuevo Pedido: \r\n"
 				+ "2.- Pedido mas reciente: \r\n"
 				+ "3.- Pedidos entre: \r\n"
 				+ "4.- Salir");	
 	}

}

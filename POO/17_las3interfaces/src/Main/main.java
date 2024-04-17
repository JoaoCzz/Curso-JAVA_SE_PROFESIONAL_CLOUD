package Main;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

import Service.MetodosService;
import java.util.function.Consumer;

public class main {

	public static void main(String[] args) {
		 Collection<Integer> numeros = new ArrayList<>();
	        numeros.add(1);
	        numeros.add(2);
	        numeros.add(3);
	        numeros.add(4);
	        numeros.add(5);
	        numeros.add(-5);
	        
	        //1
	        Consumer<Integer> imprimirNumero = numero -> System.out.println("Es par -> "+ numero);
	        Predicate<Integer> esPar = numero -> numero % 2 == 0;
	        MetodosService s= new MetodosService();
	        s.Metodos(numeros, imprimirNumero, esPar);
	        
	        //2
	        Consumer<Integer> ficherosPositivos = numero -> {PrintWriter writer;
			try {
				writer = new PrintWriter("holaxd.txt");
				writer.println(numero);
		        writer.close(); 
		        System.out.println("El numero <<"+numero +">> " + "ha sido añadido al fichero con exito!");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
	        };
	       
	        Predicate<Integer> esPositivo= numero -> numero >0;
	        s.Metodos(numeros, ficherosPositivos, esPositivo);
	        //3
	        Consumer<Integer> imprimirNegativos = numero -> System.out.println("Es negativo -> " +numero);
	        Predicate <Integer> negativos= numero -> numero<0;
	        
	        s.Metodos(numeros, imprimirNegativos, negativos);
	        
	      
	}
	

}

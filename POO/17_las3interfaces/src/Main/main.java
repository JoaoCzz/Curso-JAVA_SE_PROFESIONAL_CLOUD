package Main;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.function.Supplier;

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
	        
	      //Function
	        s.m1(Set.of(1,2,3,5,6,7,8,9), n->n.length());
	        s.m2(()-> "hola xd", a-> System.out.println(a));
	        
	        s.m4((a,b)->System.out.println(a+b), (a,b)-> a.length()>b);
	        s.m5(()->3,List.of("kjk"));
	        s.m6(Map.of("hola",1), (a,b)-> System.out.println(a.length()+b));
	        s.m7((n -> List.of(n.length())));
	}
	

}

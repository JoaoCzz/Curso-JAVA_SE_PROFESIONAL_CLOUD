package principal;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Lanzador {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//Lanzar dos tareas que se ejecuten concurrentemente. Unda de ellas
		//calculara la suma de todods los numeros enrte 1 y 100, y la otra calculara
		//el facotrial de un numero cualquiera
		// Cuandos las tareas finalicen, el programa princiapl mostrara los resultados
		//mientras las tareas esten en ejecucion, el programa principal
		// estara haciendo otras cosas
		ExecutorService executor= Executors.newCachedThreadPool();
		//tarea suma
		Future<Integer> f1=
		executor.submit(() ->{
			int suma=0;
			for(int i=1;i<=100;i++) {
				suma+=i;
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return suma;
		});
		
		
		//Tarea Factorial
		Future<Integer> f2=
				executor.submit(()-> {
					int p=1;
					for(int i=1;i<=6;i++) {
						p*=i;
						try {
						Thread.sleep(100);
						}catch(InterruptedException e) {
							e.printStackTrace();
						}
					}
					return p;
				});
		//el main sigue haciendo algo hasta que las tareas terminen,
		//momento en el que se mostraran el resultado
		
		while(!f1.isDone() || !f2.isDone()) {
			System.out.println("Espera pto"); 
		}
		System.out.println("La suma de los numeros: " + f1.get());
		System.out.println("El factorial de 6: "+ f2.get());
		executor.shutdown();


	}

}

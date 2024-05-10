package Principal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import tareas.TareaMultiplicar;

public class Lanzador {
public static void main(String[] args) {
	ExecutorService executor= Executors.newCachedThreadPool();
	executor.submit(new TareaMultiplicar(8));
	executor.submit(new TareaMultiplicar(7));
	executor.submit(new TareaMultiplicar(3));
	executor.shutdown();
}
}

package principal;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import recursos.recurso;
import tareas.HiloComsumidor;
import tareas.HiloProductor;
public class Lanzador {
	public static void main(String[] args) {
		recurso recurso=new recurso();
		Lock lock=new ReentrantLock();
		Condition condicionLleno=lock.newCondition();
		Condition condicionVacio=lock.newCondition();
		ExecutorService executor=Executors.newCachedThreadPool();
		executor.submit(new HiloProductor(recurso,lock,condicionLleno,condicionVacio));
		executor.submit(new HiloComsumidor(recurso,lock,condicionLleno,condicionVacio));
		

	}
		
		
	}	



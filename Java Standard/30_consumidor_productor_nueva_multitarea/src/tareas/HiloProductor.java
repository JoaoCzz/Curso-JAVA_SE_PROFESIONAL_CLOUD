package tareas;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import recursos.recurso;
public class HiloProductor implements Runnable {
	private recurso recurso;
	private Condition condicionLleno;
	private Condition condicionvacio;
	private Lock lock;
	public HiloProductor(recurso recurso, Lock lock, Condition condicionLleno, Condition condicionVacio) {
		super();
		this.recurso = recurso;
		this.lock = lock;
		this.condicionLleno = condicionLleno;
		this.condicionvacio = condicionVacio;
	}

	public HiloProductor(recursos.recurso recurso) {
		
		this.recurso = recurso;
	}


	@Override
	public void run() {
		while(true) {
			int num= (int)(Math.random()*100+1);
			lock.lock();
			if(recurso.isLleno()) {
				try {
					condicionLleno.await();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			recurso.guardar(num);
			System.out.println("Se ha guardado el: "+num);
			condicionvacio.signal();
			lock.unlock();
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
	}



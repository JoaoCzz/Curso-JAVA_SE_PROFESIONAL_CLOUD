package tareas;
import recursos.recurso;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class HiloComsumidor implements Runnable {
private recurso recurso;
private Condition condicionLleno;
private Condition condicionvacio;
private Lock lock;
public HiloComsumidor(recurso recurso, Lock lock, Condition condicionLleno, Condition condicionvacio) {
	
	this.recurso = recurso;
	this.lock = lock;
	this.condicionLleno = condicionLleno;
	this.condicionvacio = condicionvacio;
}
	@Override
	public void run() {
		while(true) {
			lock.lock();
			if(recurso.isVacio()) {
				try {
					System.out.println("Espera pto");
					condicionvacio.await();
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Consumiendo: "+recurso.sacar());
			condicionLleno.signal();
		lock.unlock();
			try {
				Thread.sleep(80);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}

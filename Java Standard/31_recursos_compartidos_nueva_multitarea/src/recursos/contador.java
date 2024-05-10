package recursos;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class contador {
	private int valor;
	private Lock lock;
	public contador() {
		lock= new ReentrantLock();
	}
	
	public  void incrementar() {
		lock.lock();
		int temp=valor;
		temp= temp+1;
	try {
		Thread.sleep(20000);
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
	valor= temp;
	lock.unlock();
		}
	

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	

}

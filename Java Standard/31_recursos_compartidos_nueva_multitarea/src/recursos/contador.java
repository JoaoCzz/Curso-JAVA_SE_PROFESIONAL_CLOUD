package recursos;

public class contador {
	private int valor;
	
	public synchronized void incrementar() {
		
		int temp=valor;
		temp= temp+1;
	try {
		Thread.sleep(20000);
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
	valor= temp;
		}
	

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	

}

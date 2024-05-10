package principal;

import recursos.contador;

public class LanzarCliente {
	public static void main(String[] args) {
		contador cont= new contador();
		for(int i=1;i<=1000;i++) {
			new Thread(()->cont.incrementar()).start();
		}
		try {
			Thread.sleep(5);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(cont.getValor());
	}

}

package tareas;
import recursos.recurso;
public class HiloComsumidor implements Runnable {
private recurso recurso;
	@Override
	public void run() {
		while(true) {
			if(recurso.isVacio()) {
				try {
					recurso.wait();
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Consumiendo: "+recurso);
			recurso.notify();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}

package tareas;
import recursos.recurso;
public class HiloProductor implements Runnable {
	private recurso recurso;


	public HiloProductor(recursos.recurso recurso) {
		
		this.recurso = recurso;
	}





	@Override
	public void run() {
		while(true) {
			int num= (int)(Math.random()*100+1);
			synchronized(recurso) {
			if(recurso.isLleno()) {
				try {
					recurso.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			recurso.guardar(num);
			System.out.println("Se ha guardado el: "+num);
			recurso.notify();
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
	}

}

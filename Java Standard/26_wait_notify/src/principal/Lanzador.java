package principal;
import recursos.recurso;
import tareas.HiloProductor;
public class Lanzador {
	public static void main(String[] args) {
		recurso recurso= new recurso();
		new Thread(new HiloProductor(recurso)).start();
	}
	

}

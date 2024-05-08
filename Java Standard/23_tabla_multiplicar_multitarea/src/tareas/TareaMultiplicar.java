package tareas;

public class TareaMultiplicar extends Thread {
private int n;
public TareaMultiplicar(int n) {
	this.n=n;
}
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(i +"x"+ n + "=" + n*i);
		}
	}

}

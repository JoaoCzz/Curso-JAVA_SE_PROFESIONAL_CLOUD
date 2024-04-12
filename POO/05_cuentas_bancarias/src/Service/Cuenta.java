package Service;

public class Cuenta {
	private double saldo;

	public Cuenta(double saldo) {
		super();
		this.saldo = saldo;
	}
	public Cuenta() {
		saldo=100;
	}
	
	public void extraer(double cantidad) {
		if(cantidad<=saldo) {
		this.saldo-=cantidad;	
		}
	}
	public void ingresar(double cantidad) {
		this.saldo+=cantidad;
	}
	public double obtenerSaldo() {
		return saldo;
	}

}

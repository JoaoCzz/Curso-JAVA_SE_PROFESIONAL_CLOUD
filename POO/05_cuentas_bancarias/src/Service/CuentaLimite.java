package Service;

public class CuentaLimite extends Cuenta{
private double limite;


public CuentaLimite(double saldo, double limite) {
	super(saldo);
	this.limite = limite;
}



public boolean ajustarlimite() {
	if(limite/2<=this.obtenerSaldo()) {
		return true;
	}
	return false;
}
@Override
public void extraer(double cantidad) {
	if(ajustarlimite()==true) {
		super.extraer(cantidad);
	}
}



}

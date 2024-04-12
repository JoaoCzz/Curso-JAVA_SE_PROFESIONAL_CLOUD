package Service;

import java.time.LocalDateTime;
import java.util.ArrayList;

import Model.Movimiento;

public class CuentaMovimientos extends CuentaLimite{
	
	ArrayList<Movimiento> movimientos= new ArrayList();
	
	public CuentaMovimientos(double saldo, double limite) {
		super(saldo, limite);
		
	}
@Override
	public void extraer(double cantidad) {
		Movimiento m= new Movimiento();
		m.setCantidad(cantidad);
		m.setfHora(LocalDateTime.now());
		m.setTipoMovimiento("extraccion");
		movimientos.add(m);
		super.extraer(cantidad);
	}
	@Override
	public void ingresar(double cantidad) {
		Movimiento m= new Movimiento();
		m.setCantidad(cantidad);
		m.setfHora(LocalDateTime.now());
		m.setTipoMovimiento("ingreso");
		movimientos.add(m);
		super.ingresar(cantidad);
	}
public ArrayList<Movimiento> obtenerMovimientos(){
	
	return movimientos;
}
}

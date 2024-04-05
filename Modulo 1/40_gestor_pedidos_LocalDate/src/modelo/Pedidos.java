package modelo;

import java.time.LocalDate;
import java.util.Date;

public class Pedidos {
	private String producto;
	private int unidades;
	private LocalDate fPedido;
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	public LocalDate getfPedido() {
		return fPedido;
	}
	public void setfPedido(LocalDate fPedido) {
		this.fPedido = fPedido;
	}
	public Pedidos() {
		super();
	}
	@Override
	public String toString() {
		return "Pedidos [producto=" + producto + ", unidades=" + unidades + ", fPedido=" + fPedido + "]";
	}
	
	
	
	

}

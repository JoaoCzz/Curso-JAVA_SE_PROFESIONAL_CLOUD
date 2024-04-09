package unidades;

import java.time.LocalDate;

import modelo.Pedidos;

public class util {
	public Pedidos convertirCadenaPedido(String linea) {
		String [] datos= linea.split(",");
		return new Pedidos(datos[0],Integer.parseInt(datos[1]),LocalDate.parse(datos[2]));
	}
	
	public static String unirPedidos(Pedidos pedido) {
		return pedido.getProducto()+","+pedido.getUnidades()+","+pedido.getfPedido();
	}

}

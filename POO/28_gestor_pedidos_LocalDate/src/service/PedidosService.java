package service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import modelo.Pedidos;

public class PedidosService {
	
	HashSet <Pedidos> pedidos= new HashSet <>(); 
	
	
		public boolean crearPedido (Pedidos p){
			
			return pedidos.add(p);
	}
		public Pedidos pedidoMasreciente() {
			
		return  pedidos.stream().filter(pedido -> pedido.getfPedido().isBefore(LocalDate.now()))
                .max(Comparator.comparing(Pedidos::getfPedido))
                .orElse(null);
		}
		
//		
//		public ArrayList<Pedidos> RangoEntre(LocalDate f1,LocalDate f2){
//			return pedidos.stream().filter()
//		}
		
		public Pedidos pedidoProximaFecha(LocalDate fecha) {
		return pedidos.stream().filter(pedido -> pedido.getfPedido().isBefore(fecha)||pedido.getfPedido().isAfter(fecha)||pedido.getfPedido().equals(fecha))
				.min(Comparator.comparing(pedido -> Math.abs(ChronoUnit.DAYS.between(pedido.getfPedido(), fecha)))).orElse(null);	
			
//		
			}
		
		public Pedidos pedidoMasrecienteCON() {
			
			return  pedidos.stream().filter(pedido -> pedido.getfPedido().isBefore(LocalDate.now()))
	                .min(Comparator.comparing(Pedidos::getfPedido).thenComparing(p -> p.getUnidades()).reversed())
	                .orElse(null);
	                
			}
		
		public List<Pedidos> pedidosdelProducto(String nombre){
			return  pedidos.stream().filter(p -> p.getProducto().equals(nombre)).collect(Collectors.toList());
		}
		
		public Pedidos pedidoconmenorUnidades() {
			return pedidos.stream().min(Comparator.comparingInt(Pedidos::getUnidades)).orElse(null);
		}
		//devuelve una cadena con los nombres de todos los productos, sin duplicados, separados por "-"
		
		public String nombreProductos() {
			return pedidos.stream().map(p -> p.getProducto()).distinct().collect(Collectors.joining("-"));
		}
			
}


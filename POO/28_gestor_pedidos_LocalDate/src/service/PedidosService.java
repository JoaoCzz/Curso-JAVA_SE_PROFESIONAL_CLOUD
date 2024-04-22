package service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;

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
			Pedidos masreciente = null;
			Pedidos maslejano =null;
			for(Pedidos pedidos: pedidos) {
				LocalDate fechaPedido = pedidos.getfPedido();
				if (fechaPedido != null) {
		            if (masreciente == null || fechaPedido.isAfter(masreciente.getfPedido())) {
		                masreciente = pedidos;
		            }
		            if (maslejano == null || fechaPedido.isBefore(maslejano.getfPedido())) {
		                maslejano = pedidos;
		            }
		        }
		    }    
		    long diasMasReciente = masreciente != null ? Math.abs(ChronoUnit.DAYS.between(fecha, masreciente.getfPedido())) : Long.MAX_VALUE;
		    long diasMasLejano = maslejano != null ? Math.abs(ChronoUnit.DAYS.between(fecha, maslejano.getfPedido())) : Long.MAX_VALUE;
		    
		    return diasMasReciente <= diasMasLejano ? masreciente : maslejano;

			}
}


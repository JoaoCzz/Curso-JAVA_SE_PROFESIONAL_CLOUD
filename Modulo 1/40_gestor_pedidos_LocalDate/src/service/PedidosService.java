package service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

import modelo.Pedidos;

public class PedidosService {
	
	HashSet <Pedidos> pedidos= new HashSet <>(); 
	
	
		public boolean crearPedido (Pedidos p){
			
			return pedidos.add(p);
	}
		public Pedidos pedidoMasreciente() {
			
			   Pedidos masreciente = null;
			for(Pedidos pedidos: pedidos) {
				LocalDate fechaPedido = pedidos.getfPedido();
				if (fechaPedido != null && fechaPedido.compareTo(LocalDate.now()) <= 0) {
	                if (masreciente == null || fechaPedido.compareTo(masreciente.getfPedido()) > 0) {
	                    masreciente = pedidos;
	                }
				}	
			}
			
			return masreciente;
		}
		
		
		public ArrayList<Pedidos> RangoEntre(LocalDate f1,LocalDate f2){
			 ArrayList<Pedidos> Rango = new ArrayList<>();
			 for (Pedidos pedido : pedidos) {
		            LocalDate fechaPedido = pedido.getfPedido();
		            if (fechaPedido.compareTo(f1) >= 0 && fechaPedido.compareTo(f2) <= 0) {
		                Rango.add(pedido);
		            }
		        }
		        return Rango;
		}
		
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


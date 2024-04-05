package service;

import java.time.LocalDate;
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

}

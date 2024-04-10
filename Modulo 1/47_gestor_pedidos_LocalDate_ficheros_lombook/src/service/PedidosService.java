package service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

import modelo.Pedidos;
import unidades.util;

public class PedidosService {
	
	HashSet <Pedidos> pedidos= new HashSet <>(); 
	 util utilservice= new util();
	
	
	String ruta="pedidos.txt";
		public boolean crearPedido (Pedidos p){
			try (FileOutputStream fos = new FileOutputStream(ruta, true);
		            PrintStream out = new PrintStream(fos)) {
				out.print(p);
			 } catch (FileNotFoundException e) {
		            e.printStackTrace();
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
			return true;
	}
		public Pedidos pedidoMasreciente() {
			Pedidos masreciente = null;
		    try (FileReader fr = new FileReader(ruta);
		         BufferedReader bf = new BufferedReader(fr)) {    
		        String linea = null;
		        while ((linea = bf.readLine()) != null) {
		            Pedidos pedido = utilservice.convertirCadenaPedido(linea);
		            if (masreciente == null || pedido.getFPedido().isAfter(masreciente.getFPedido())) {
		                masreciente = pedido;
		            }
		        }
		    } catch (IOException e) {
		        e.printStackTrace();
		    }
		    System.out.println("Pedido más reciente encontrado: " + masreciente);
		    return masreciente;
		}
		
		
		public ArrayList<Pedidos> RangoEntre(LocalDate f1,LocalDate f2){
			 ArrayList<Pedidos> Rango = new ArrayList<>();
			 for (Pedidos pedido : pedidos) {
		            LocalDate fechaPedido = pedido.getFPedido();
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
				LocalDate fechaPedido = pedidos.getFPedido();
				if (fechaPedido != null) {
		            if (masreciente == null || fechaPedido.isAfter(masreciente.getFPedido())) {
		                masreciente = pedidos;
		            }
		            if (maslejano == null || fechaPedido.isBefore(maslejano.getFPedido())) {
		                maslejano = pedidos;
		            }
		        }
		    }    
		    long diasMasReciente = masreciente != null ? Math.abs(ChronoUnit.DAYS.between(fecha, masreciente.getFPedido())) : Long.MAX_VALUE;
		    long diasMasLejano = maslejano != null ? Math.abs(ChronoUnit.DAYS.between(fecha, maslejano.getFPedido())) : Long.MAX_VALUE;
		    
		    return diasMasReciente <= diasMasLejano ? masreciente : maslejano;

			}
}


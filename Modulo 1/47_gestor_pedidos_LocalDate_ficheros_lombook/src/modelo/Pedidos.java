package modelo;

import java.time.LocalDate;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Pedidos {
	private String producto;
	private int unidades;
	private LocalDate fPedido;
	
}
	
	
	
	



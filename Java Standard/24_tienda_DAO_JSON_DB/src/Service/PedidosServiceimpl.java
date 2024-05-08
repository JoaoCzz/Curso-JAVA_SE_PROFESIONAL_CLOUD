package Service;

import java.util.ArrayList;
import java.util.List;

import DAO.DAOfactory;
import DAO.PedidoDAO;
import DAO.PedidoDAOJSON;
import Modelo.Pedido;

public class PedidosServiceimpl implements PedidosService {
	PedidoDAOJSON pedidoJson;
	PedidoDAO pedido;
	public PedidosServiceimpl() {
		pedidoJson= DAOfactory.getPedidoDAOJSON();
		pedido= DAOfactory.getPedidoDAO();
		
	}

	@Override
	public void savePedido(List<Pedido> pedido) {
//	List<Pedido> aux= pedido.stream()
		
	}

}

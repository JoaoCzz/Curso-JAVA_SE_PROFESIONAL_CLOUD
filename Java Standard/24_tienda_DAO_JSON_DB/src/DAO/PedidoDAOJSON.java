package DAO;
import java.util.List;

import Modelo.JSONPedido;
import Modelo.Pedido;
public interface PedidoDAOJSON {
List<Pedido> getPedidos(String ruta);
}

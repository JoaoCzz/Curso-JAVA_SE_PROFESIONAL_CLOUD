package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import Locator.LocatorConnection;
import Modelo.Pedido;

public class PedidoDAOimpl implements PedidoDAO{

	@Override
	public void save(List<Pedido> pedidox) {
		try (Connection con=LocatorConnection.getConnection();){
			String sql="insert into pedidos(producto,tienda,fechaPedido,precio) values ?,?,?,?";
			PreparedStatement ps=con.prepareStatement(sql);
			con.setAutoCommit(false);
			for(Pedido p:pedidox){
				ps.setString(1, p.getProducto());
				ps.setString(2, p.getTienda());
				ps.setObject(3, p.getFechaPedido());
				ps.setDouble(4, p.getPrecio());
				ps.execute();
			}
			con.commit();		
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
	}

}

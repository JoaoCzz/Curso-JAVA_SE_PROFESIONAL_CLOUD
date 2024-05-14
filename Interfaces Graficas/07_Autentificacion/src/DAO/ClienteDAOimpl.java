package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.PreparableStatement;

import Locator.LocatorConnection;
import Modelo.Clientes;

public class ClienteDAOimpl implements ClientesDAO{

	@Override
	public Clientes findCliente(String usuario) {
		Clientes aux= new Clientes();
		try (Connection con= LocatorConnection.getConnection()){
			String sql="select * from clientes where usuario =?";
			PreparedStatement ps=con.prepareStatement(sql);
			con.setAutoCommit(false);
			ps.setString(1, usuario);
			ResultSet st= ps.executeQuery();
			con.commit();
			if (st.next()) {
                aux = new Clientes(
                        st.getInt("idCliente"),
                        st.getString("usuario"),
                        st.getString("password"),
                        st.getString("email"),
                        st.getInt("telefono")
                );
			
		
	}
		}catch(SQLException ex) {
		ex.printStackTrace();
	}
		return aux;

	
}

	@Override
	public void registrar(Clientes cliente) {
	}
	
}


package Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import DAO.ClientesDAO;
import DAO.DAOFactory;
import Locator.LocatorConnection;
import Modelo.Clientes;

public class ClienteServiceimpl implements ClientesService {
	ClientesDAO dao;
	
	public ClienteServiceimpl() {
		dao= DAOFactory.getClienteDAO();
	}

	@Override
	public boolean coinciden(String usuario, String password) {
		Clientes cliente= dao.findCliente(usuario);
		 return cliente != null && usuario.equals(cliente.getUsuario()) && password.equals(cliente.getPassword());
	}

	@Override
	public boolean registrar(Clientes cliente) {
		try (Connection con= LocatorConnection.getConnection()){
			 if (dao.findCliente(cliente.getUsuario()).equals(null)) {
				 String sql = "INSERT INTO clientes(usuario,password,email,telefono) VALUES (?,?,?,?)";
			        PreparedStatement ps = con.prepareStatement(sql);
			        ps.setString(1, cliente.getUsuario());
			        ps.setString(2, cliente.getPassword());
			        ps.setString(3, cliente.getEmail());
			        ps.setInt(4, cliente.getTelefono());
			        ps.execute();
			        return true;   
			}
	       
		 } catch (SQLException ex) {
		        ex.printStackTrace();
		         System.out.println(ex.getMessage()); 
		    }
		return false;
		
	}
	

}

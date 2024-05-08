package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Locator.LocatorConnection;
import Modelo.Cliente;
import Modelo.Cuenta;
import model.Comunidad;

public class CuentaDAOimpl implements CuentaDAO{

	@Override
	public Cuenta findCuenta(int idCuenta) {
		Cuenta aux= new Cuenta();
		try (Connection con= LocatorConnection.getConnection()){
			String sql="select * from cuentas where idCuenta=?";
			PreparedStatement ps=con.prepareStatement(sql);
			con.setAutoCommit(false);//cancelamos autocommit
				ps.setInt(1, idCuenta);	
				ResultSet st= ps.executeQuery();
			    con.commit();
0		    aux= new Cuenta(st.getInt(numeroCuenta),st.getDouble(numeroCuenta),st.getArray(cliente),st.getNString(tipoCuenta));
			    
			   
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
		return aux;	
		
	}
	private int numeroCuenta;
	private double saldo;
	private Cliente cliente;
	private String tipoCuenta;
	@Override
	public List<Cuenta> findAllCuenta() {
		return null;
		
	}

	@Override
	public void UpdateSaldo(int idCuenta) {
		// TODO Auto-generated method stub
		
	}
}


package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Locator.LocatorConnection;
import model.Comunidad;
import model.Provincia;

public class ProvinciasDAOimpl implements ProvinciasDAO {

	
	@Override
	public void save(List<Provincia> provincias) {
		try (Connection con= LocatorConnection.getConnection()){
			String sql="insert into provincias(codigo,nombre,codComunidad) values(?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			con.setAutoCommit(false);//cancelamos autocommit
			for(Provincia p:provincias){
				ps.setString(1, p.getCodigo());
				ps.setString(2, p.getNombre());
				ps.setString(3, p.getCodComunidad());
				ps.execute();
			}
			con.commit();
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
		
	}

	@Override
	public List<String> FindCODE() {
		List<String> resultado= new ArrayList();
		try (Connection con= LocatorConnection.getConnection()){
			String sql="Select codigo from provincas where codigo";
			PreparedStatement ps=con.prepareStatement(sql);
			con.setAutoCommit(false);
			ResultSet rs= ps.executeQuery();
			while (rs.next()) {
                String foundCode = rs.getString("codigo");
                resultado.add(foundCode);
            }
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return resultado;
	}
}

	



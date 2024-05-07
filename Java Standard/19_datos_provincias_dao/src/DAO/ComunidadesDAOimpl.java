package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.xml.sax.Locator;

import Locator.LocatorConnection;
import model.Comunidad;

public class ComunidadesDAOimpl implements ComunidadesDAO {

	@Override
	public void save(Comunidad comunidad) {
		
		
	}

	@Override
	public void save(List<Comunidad> comunidades) {
		try (Connection con= LocatorConnection.getConnection()){
			String sql="insert into comunidades(codigo,nombre) values(?,?)";

			PreparedStatement ps=con.prepareStatement(sql);
			con.setAutoCommit(false);//cancelamos autocommit
			for(Comunidad c:comunidades){
				ps.setString(1, c.getCodigo());
				ps.setString(2, c.getNombre());
				ps.execute();
			}
			con.commit();
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}	
		
	}

	@Override
	public boolean existComunidad(String codigo) {
		try (Connection con= LocatorConnection.getConnection()){
			String sql = "Select case when count(*) >0 then true else false end from comunidades where codigo= ?";
	        try (PreparedStatement ps = con.prepareStatement(sql)) {
	            ps.setString(1, codigo); 
	            try (ResultSet rs = ps.executeQuery()) {
	                if (rs.next()) {
	                    return rs.getBoolean(1); 
	                }
	            }
	        } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            } catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		return false;
        }
}

package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import DAO.ComunidadesDAO;
import model.Comunidad;
import model.Municipio;
import model.Provincia;

public class ComunidadesServiceImpl implements ComunidadesService {
	String cadenaConexion="jdbc:mysql://localhost:3306/comunidades";
	String usuario="root";
	String password="root";
	
	ComunidadesDAO comunidadesDAO;
	
	@Override
	public int saveComunidades(List<Comunidad> comunidades) {
		try (Connection con=DriverManager.getConnection(cadenaConexion,usuario,password);){
			String sql="insert into comunidades(codigo,nombre) values(?,?)";
			int count=0;
			for(Comunidad c: comunidades) {
				boolean existe= comunidadesDAO.existComunidad(c.getCodigo());
				if(!existe) {
					PreparedStatement ps=con.prepareStatement(sql);
					con.setAutoCommit(false);
					ps.setString(1, c.getCodigo());
					ps.setString(2, c.getNombre());
					count++;
					ps.execute();
					return count;
				}
				
			}
			con.commit();
			}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
		return 0;
		}
		
	public void saveComunidad(Comunidad comunidad) {
		try (Connection con = DriverManager.getConnection(cadenaConexion, usuario, password)) {
	        String sql = "INSERT INTO comunidades(codigo, nombre) VALUES (?, ?)";
	        PreparedStatement ps = con.prepareStatement(sql);
	        ps.setString(1, comunidad.getCodigo());
	        ps.setString(2, comunidad.getNombre());
	        ps.executeUpdate();
	    } catch (SQLException ex) {
	        ex.printStackTrace();
	    }
	}
	public boolean existeComunidad(int codigo) {
		try (Connection con = DriverManager.getConnection(cadenaConexion, usuario, password)) {
	        String sql = "Select case when count(*) >0 then true else false end from comunidades where codigo= ?";
	        try (PreparedStatement ps = con.prepareStatement(sql)) {
	            ps.setInt(1, codigo); 
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
	
	public void borrarComunidades() {
		try (Connection con=DriverManager.getConnection(cadenaConexion,usuario,password);){
			String sql="delete from comunidades";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.execute();
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
	}
	@Override
	public void saveProvincias(List<Provincia> provincias) {
		try (Connection con=DriverManager.getConnection(cadenaConexion,usuario,password);){
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
	public void saveMunicipios(List<Municipio> municipios) {
		try (Connection con=DriverManager.getConnection(cadenaConexion,usuario,password);){
			String sql="insert into municipios(codigo,nombre,codProvincia,superficie,altitud,poblacion) values(?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			con.setAutoCommit(false);//cancelamos autocommit
			for(Municipio m:municipios){
				ps.setString(1, m.getCodigo());
				ps.setString(2, m.getNombre());
				ps.setString(3, m.getCodProvincia());
				ps.setDouble(4, m.getSuperficie());
				ps.setInt(5, m.getAltitud());
				ps.setInt(6, m.getPoblacion());
				ps.execute();
			}
			con.commit();//confirmamos tx si no ha habido fallos
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	public int publacionTotalProvincia(String codigoProvincia) {
		try (Connection con=DriverManager.getConnection(cadenaConexion,usuario,password);){
			String sql="select sum(poblacion) from municipios where codProvincia=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, codigoProvincia);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				return rs.getInt(1);
			}
			return 0;
		}
		catch(SQLException ex) {
			ex.printStackTrace();
			return 0;
		}
	}
}

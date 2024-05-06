package Service;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import Modelo.Comunidad;
import Modelo.Municipio;
import Modelo.Provincia;
public class ComunidadesService {
	String cadenaConexion="jdbc:mysql://localhost:3306/comunidades";
	String usuario="root";
	String password="root";
	
	public void saveComunidades(List<Comunidad> comunidades) {
		try (Connection con=DriverManager.getConnection(cadenaConexion,usuario,password);){
			String sql="insert into comunidades(codigo,nombre) values(?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			con.setAutoCommit(false);// Cancelamos AutoCommit
			for(Comunidad c:comunidades){
				ps.setInt(1, c.getCodigo());
				ps.setString(2, c.getNombre());
				ps.execute();
			}
			con.commit(); // Confirmamos tx si no ha habido fallos
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
	}
	public void saveComunidad(Comunidad comunidad) {
		//pendiente
	}
	public boolean existeComunidad(int codigo) {
		//pendiente
		return false;
	}
	public void borrarComunidades() {
	}
	public void saveProvincias(List<Provincia> provincias) {
		try (Connection con=DriverManager.getConnection(cadenaConexion,usuario,password);){
			String sql="insert into provincias(codigo,nombre,codComunidad) values(?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			con.setAutoCommit(false);// Cancelamos AutoCommit
			for(Provincia p:provincias){
				ps.setString(1, p.getCodigo());
				ps.setString(2, p.getNombre());
				ps.setInt(3, p.getCodComunidad());
				ps.execute();
			}
			con.commit(); // Confirmamos tx si no ha habido fallos
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
	}
	public void saveMunicipios(List<Municipio> municipios) {
		try (Connection con=DriverManager.getConnection(cadenaConexion,usuario,password);){
			String sql="insert into municipios(codigo,nombre,codProvincia,superficie,altitud,poblacion) values(?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			con.setAutoCommit(false);// Cancelamos AutoCommit
			for(Municipio m:municipios){
				ps.setInt(1, m.getCodigo());
				ps.setString(2, m.getNombre());
				ps.setString(3, m.getCodProvincia());
				ps.setDouble(4, m.getSuperficie());
				ps.setInt(5, m.getAltitud());
				ps.setInt(6, m.getPoblacion());
				ps.execute();
			}
			con.commit(); // Confirmamos tx si no ha habido fallos00
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
	}
}

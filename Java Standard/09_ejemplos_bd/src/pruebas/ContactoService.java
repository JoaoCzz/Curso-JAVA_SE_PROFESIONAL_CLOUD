package pruebas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Modelo.Contacto;

public class ContactoService {
	
	
      private  String cadenaConexion="jdbc:mysql://localhost:3306/agenda";
      private  String usuario="root";
      private  String password="root";
public void nuevoContacto (Contacto c1) {
	 try(Connection con= DriverManager.getConnection(cadenaConexion,usuario,password);){
	String sql="Insert into contactos(nombre,email,edad) values (?,?,?)";
	PreparedStatement preparedStatement = con.prepareStatement(sql);
    preparedStatement.setString(1, c1.getName());
    preparedStatement.setString(2, c1.getEmail());
    preparedStatement.setInt(3, c1.getEdad());
    preparedStatement.execute();
}catch(SQLException ex) {
    ex.printStackTrace();
  
}	
}

public void eliminarContacto(String email) {
	 try(Connection con= DriverManager.getConnection(cadenaConexion,usuario,password);){
		String sql="Delete  contactos where email= ?";
		PreparedStatement preparedStatement = con.prepareStatement(sql);
        preparedStatement.setString(1, email);
        preparedStatement.execute();
		System.out.println("Se elimino xd");
	}catch(SQLException ex) {
		ex.printStackTrace();
	}
	}


public void actualizarContacto(String email,int edad) {
	 try(Connection con= DriverManager.getConnection(cadenaConexion,usuario,password);){
		String sql="Update  contactos Set edad= ? where email=?";
		PreparedStatement preparedStatement = con.prepareStatement(sql);
		preparedStatement.setInt(1, edad);
        preparedStatement.setString(2, email);
        preparedStatement.execute();
		System.out.println("Se actualizo xd");
	}catch(SQLException ex) {
		ex.printStackTrace();
	}
	}

public List<Contacto> listContactos(){
	List<Contacto> c= new ArrayList<Contacto>();
	try(Connection con= DriverManager.getConnection(cadenaConexion,usuario,password);){
		String sql="Select * from contactos";
		Statement st= con.createStatement();
		ResultSet rs= st.executeQuery(sql);
		while(rs.next()) {
			c.add(new Contacto(rs.getInt("idContacto"),rs.getString("nombre"),rs.getString("email"),rs.getInt("edad")));
		}
} catch (SQLException e) {
	
	e.printStackTrace();
}
	return c;
}

public Contacto BuscarContacto(int idcontacto) {
	Contacto c1= new Contacto();
	try(Connection con= DriverManager.getConnection(cadenaConexion,usuario,password);){
		String sql="Select * from contactos where idContacto=?";
		PreparedStatement pr= con.prepareStatement(sql);
		pr.setInt(1, idcontacto);
		ResultSet rs= pr.executeQuery();
		if(rs.next()) {
			c1.setName(rs.getString("nombre"));
			c1.setEmail(rs.getString("email"));
			c1.setEdad(rs.getInt("edad"));
			}
		
		return c1;
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	return null;
}
	
}
private Contacto existeContactoPorEmail(String email) {
	try(Connection con=DriverManager.getConnection(cadenaConexion,usuario,password);){		
		String sql="select * from contactos where email=?";
		PreparedStatement st=con.prepareStatement(sql);
		st.setString(1, email);
		ResultSet rs=st.executeQuery();
		//debemos movernos a la primera y única fila, para poder extraer
		//el valor de dicha fila
		if(
rs.next
()) {
			return new Contacto(rs.getInt("idContacto"),
						rs.getString("nombre"),
						rs.getString("email"),
						rs.getInt("edad"));
		}
			
		return null;
	}catch(SQLException ex) {
		ex.printStackTrace();
		return null;
	}
	
} 
	


public void nuevoContactoporemail (Contacto c1) {
	Contacto c2= existeContactoPorEmail(c1.getEmail());
	if(c2==null) {
		

	}
	 try(Connection con= DriverManager.getConnection(cadenaConexion,usuario,password);){
	String sql="Insert into contactos(nombre,email,edad) values (?,?,?)";
	PreparedStatement preparedStatement = con.prepareStatement(sql);
   preparedStatement.setString(1, c1.getName());
   preparedStatement.setString(2, c1.getEmail());
   preparedStatement.setInt(3, c1.getEdad());
   preparedStatement.execute();
}catch(SQLException ex) {
   ex.printStackTrace();
 
}	
}
}



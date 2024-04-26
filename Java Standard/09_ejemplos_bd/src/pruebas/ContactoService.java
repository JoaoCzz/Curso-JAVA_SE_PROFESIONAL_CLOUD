package pruebas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
}



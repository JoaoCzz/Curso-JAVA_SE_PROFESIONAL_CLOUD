package Locator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data


public class LocatorConnection {
	
public static Connection getConnection() throws SQLException {
	String cadenaConexion="jdbc:mysql://localhost:3306/comunidades";
	String usuario="root";
	String password="root";
	return DriverManager.getConnection(cadenaConexion,usuario,password);
}
}

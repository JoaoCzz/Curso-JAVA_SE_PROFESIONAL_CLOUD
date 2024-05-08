package Locator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LocatorConnection {
	public static Connection getConnection() throws SQLException {
		String cadenaConexion="jdbc:mysql://localhost:3306/bancadb";
		String usuario="root";
		String password="root";
		return DriverManager.getConnection(cadenaConexion,usuario,password);
	}
}

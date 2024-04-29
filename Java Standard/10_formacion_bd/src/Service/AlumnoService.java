package Service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.stream.Stream;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import Modelo.Alumno;



public class AlumnoService {
	
	private  String cadenaConexion="jdbc:mysql://localhost:3306/curso";
    private  String usuario="root";
    private  String password="root";
    
    public Alumno AlumnoporDNI(String dni) {
    	Alumno c1= new Alumno();
    	try(Connection con= DriverManager.getConnection(cadenaConexion,usuario,password);){
    		String sql="Select * from alumno where dni=?";
    		PreparedStatement pr= con.prepareStatement(sql);
    		pr.setString(1, dni);
    		ResultSet rs= pr.executeQuery();
    		if(rs.next()) {
    			c1.setDni(rs.getString("dni"));
    			c1.setNombre(rs.getString("nombre"));
    			c1.setEdad(rs.getInt("edad"));
    			c1.setNota(rs.getDouble("nota"));
    			c1.setIdCurso(rs.getInt("idcurso"));
    			}
    		return c1;
    	} catch (SQLException e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    		return null;
    	}
    }
    
   public Boolean agregarAlumno(Alumno alumno) {
	   if(AlumnoporDNI(alumno.getDni())!=null) {
		   return false;
	   }
	   try(Connection con= DriverManager.getConnection(cadenaConexion,usuario,password);){
			String sql="Insert into Alumnos(dni,nombre,edad,nota,idCurso) values (?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
		
			ps.setString(1, alumno.getDni());
			ps.setString(2,alumno.getNombre());
			ps.setInt(3, alumno.getEdad());
			ps.setDouble(4, alumno.getNota());
			ps.setInt(5, alumno.getIdCurso());
			return true;
			
	   
   } catch (SQLException e) {
	
	e.printStackTrace();
	return false;
}
}
    }

package principal;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PruebaEscritura2 {
public static void main(String[] args) {
	String ruta= "dias.txt";
	/*FileOutputStream fos=null;
	PrintStream out=null;
	try {
	    fos= new FileOutputStream(ruta,true);
		out = new PrintStream(fos);
		out.println("lunes");
		out.println("martes");
		out.println("miercoles");
		out.println("jueves");
		out.println("viernes");
		System.out.println("Informacion añadida");
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}finally {
		out.close();
		try {
			fos.close();
		} catch (IOException e) {

			e.printStackTrace();
			
		}
	}*/
	
	//Try con recursos
	try(FileOutputStream fos= new FileOutputStream(ruta,true);
			PrintStream out= new PrintStream(fos)){
		out.println("lunes");
		out.println("martes");
		out.println("miercoles");
		out.println("jueves");
		out.println("viernes");
		System.out.println("Informacion añadida");
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	

}
}

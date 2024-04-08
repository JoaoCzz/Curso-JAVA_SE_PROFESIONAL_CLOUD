package principal;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PruebaEscritura {
public static void main(String[] args) {
	String ruta= "dias.txt";
	PrintStream out;
	try {
		out = new PrintStream(ruta);
		out.println("lunes");
		out.println("martes");
		out.println("miercoles");
		out.println("jueves");
		out.println("viernes");
		System.out.println("Informacion añadida");
		out.close();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	

}
}

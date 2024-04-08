import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class GuardarCursoFichero {
	public static void main(String[] args) {
		String [] cursos= {
		"Java basico",
		"Pyhton para principiantes",
		"Java EE en Web",
		"JavaScript en Front",
		"POO con Java",
		"Python y Django",
		"Desarrollo Web con ASP.NET",
		"Aplicaciones Web con Phyton"
		};
		
		//solicitamos por teclado la introduccion de un nombe y guardar en un fichero todos los cursos
		//que contengan ese nombre
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Escribe un nombre clave");
		String clave= sc.nextLine();
		String ruta= "cursos.txt";
		try (FileOutputStream fos = new FileOutputStream(ruta, true);
	             PrintStream out = new PrintStream(fos)) {
	            for (String curso : cursos) {
	                if (curso.contains(clave)) {
	                    out.println(curso);
	                    System.out.println("Se ha añadido " + curso);
	                }else{
	                	System.out.println("No encontramos ningun curso con el nombre: "+clave);
	                }
	            }
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	  
		
	
	}

}

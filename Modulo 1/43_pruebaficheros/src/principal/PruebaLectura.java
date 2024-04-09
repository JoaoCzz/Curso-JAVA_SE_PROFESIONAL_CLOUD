package principal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PruebaLectura {
	public static void main(String[] args) {
		String ruta="dias.txt";
		try (FileReader fr= new FileReader(ruta);
				BufferedReader bf= new BufferedReader(fr)){
			/*String linea= bf.readLine();
					while(linea!=null) {
						System.out.println(linea);
						linea= bf.readLine();
					}
			*/
			String linea;
			while((linea=bf.readLine())!=null){
				System.out.println(linea);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}

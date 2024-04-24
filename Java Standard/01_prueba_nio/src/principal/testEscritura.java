package principal;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class testEscritura {
	public static void main(String[] args) {
		String ruta="nombres.txt";
		Path pt= Path.of(ruta);
		try {
			if(Files.notExists(pt)) {				
			Files.createFile(pt);
			
		}
			Files.writeString(pt, "cadena2",StandardOpenOption.APPEND);
			Files.writeString(pt, "cadena3",StandardOpenOption.APPEND);
			Files.writeString(pt, "cadena1",StandardOpenOption.APPEND);
			
		} catch (IOException e) {
		
			e.printStackTrace();
		
		}
		}
	

	}


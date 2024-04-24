package principal;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class testEscrituraLista {
	public static void main(String[] args) {
		String ruta= "nombres.txt";
		Path pt= Path.of(ruta);
		List <String> dias= List.of("Lunes", "Martes", "Miercoles", "Jueves");
		try {
			Files.write(pt, dias, StandardOpenOption.APPEND);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}

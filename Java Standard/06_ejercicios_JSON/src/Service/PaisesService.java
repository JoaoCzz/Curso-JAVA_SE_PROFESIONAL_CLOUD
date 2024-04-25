package Service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import Modelo.Pais;


public class PaisesService {
	String dir="C:\\Users\\manana\\Downloads\\paises.json";		
	private Stream <Pais> getPaises(){
		try {
			Gson gson= new Gson();
			return Arrays.stream(gson.fromJson(new FileReader(dir), Pais[].class));
		}catch (JsonSyntaxException | JsonIOException | FileNotFoundException e){
			e.printStackTrace();
			return Stream.empty();
		}
	}
	
	public List<String> listaContientes(){
		return getPaises().map(c -> c.getContinente()).distinct().toList();
	}
	public List<String> listaPaisesporContiente(String continente){
	return getPaises().filter(c -> c.getContinente().equals(continente)).map(s -> s.getNombre()).toList();
}
	public String paismasHabitado() {
		return getPaises().max(Comparator.comparingInt(c -> c.getHabitantes())).map(c -> c.getNombre()).toString();
	}
	
	public Map<String,String> paisesporContiente(){
		return getPaises().collect(Collectors.toMap(c -> c.getContinente(), c-> c.getNombre()));
		
	}
	public String paisporCapital(String capital) {
		return getPaises().filter(c -> c.getCapital().equals(capital)).map(c -> c.getNombre()).toString();
	}
	
	
}

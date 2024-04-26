package Service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandler;
import java.net.http.HttpResponse.BodyHandlers;
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
		
	private Stream <Pais> getPaises(){
		
			Gson gson= new Gson();
			String url="https://restcountries.com/v2/all";
			HttpRequest request= HttpRequest.newBuilder().uri(URI.create(url)).GET().build();
			HttpClient client= HttpClient.newBuilder().build();
			HttpResponse<String> respuesta;
			try {
				respuesta = client.send(request, BodyHandlers.ofString());
				return Arrays.stream(gson.fromJson(respuesta.body(),Pais[].class)) ;
			} catch (IOException | InterruptedException e) {
				// TODO Auto-generated catch block
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
		return getPaises().filter(c -> c.getCapital().equals(capital)).findFirst().map(c -> c.getNombre()).toString();
	}
	
	
}

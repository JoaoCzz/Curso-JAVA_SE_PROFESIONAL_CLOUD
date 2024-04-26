package Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Arrays;
import java.util.stream.Stream;

import com.google.gson.Gson;

import Modelo.Municipio;


public class elTiempoService {
	private Stream <Municipio> getPaises(){
		
		Gson gson= new Gson();
		String url="https://www.el-tiempo.net/api/json/v2/provincias";
		HttpRequest request= HttpRequest.newBuilder().uri(URI.create(url)).GET().build();
		HttpClient client= HttpClient.newBuilder().build();
		HttpResponse<String> respuesta;
		try {
			respuesta = client.send(request, BodyHandlers.ofString());
			return Arrays.stream(gson.fromJson(respuesta.body(),Municipio[].class)) ;
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Stream.empty();
		}
	}
	
	
public 	
		
}

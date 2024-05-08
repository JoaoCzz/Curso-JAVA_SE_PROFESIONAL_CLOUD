package DAO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import Modelo.JSONPedido;
import Modelo.Pedido;

public class PedidoDAOJSONimpl implements PedidoDAOJSON {

	@Override
	public List<Pedido> getPedidos(String ruta) {
		Gson gson= new Gson();
		try {
			List<Pedido> pedidos=Arrays.asList(gson.fromJson(new FileReader(ruta), Pedido[].class));
			return pedidos;
		} catch (JsonSyntaxException | JsonIOException | FileNotFoundException e) {
			e.printStackTrace();
		
	}
		return null;

}
}
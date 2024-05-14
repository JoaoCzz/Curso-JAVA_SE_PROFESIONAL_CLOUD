package Service;

import Modelo.Clientes;

public interface ClientesService {
boolean coinciden(String usuario,String password);
boolean registrar(Clientes cliente);
}

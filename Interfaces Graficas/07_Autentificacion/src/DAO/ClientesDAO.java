package DAO;

import Modelo.Clientes;

public interface ClientesDAO {
	Clientes findCliente(String usuario);
	
	void registrar(Clientes cliente);

}

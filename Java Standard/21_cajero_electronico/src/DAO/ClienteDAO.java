package DAO;

import com.mysql.cj.xdevapi.Client;

import Modelo.Cliente;

public interface ClienteDAO {
Cliente findTitulares(int idCuenta);
}

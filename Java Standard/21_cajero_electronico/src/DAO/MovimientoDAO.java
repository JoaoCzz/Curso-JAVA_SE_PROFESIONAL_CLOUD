package DAO;

import java.util.List;

import Modelo.Movimientos;

public interface MovimientoDAO {
	
List<Movimientos> findByCuentas(int idCuenta);
void save (Movimientos movimiento);
}

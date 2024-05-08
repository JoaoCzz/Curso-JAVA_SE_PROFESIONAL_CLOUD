package DAO;

import java.util.List;

import Modelo.Cuenta;

public interface CuentaDAO {
Cuenta findCuenta(int idCuenta);
List<Cuenta> findAllCuenta();
void UpdateSaldo(int idCuenta);
}

package DAO;

public class DAOFactory {
	public static ClientesDAO getClienteDAO() {
		return new ClienteDAOimpl();
	}
}

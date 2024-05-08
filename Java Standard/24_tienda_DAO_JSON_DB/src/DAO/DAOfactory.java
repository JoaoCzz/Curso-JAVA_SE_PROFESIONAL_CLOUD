package DAO;

public class DAOfactory {
public static PedidoDAO getPedidoDAO() {
	return new PedidoDAOimpl();
}
public static PedidoDAOJSON getPedidoDAOJSON() {
	return new PedidoDAOJSONimpl();
}
}

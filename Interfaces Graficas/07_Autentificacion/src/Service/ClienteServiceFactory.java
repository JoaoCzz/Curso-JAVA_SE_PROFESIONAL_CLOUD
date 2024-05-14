package Service;

public class ClienteServiceFactory {
	public static ClientesService getClienteService() {
		return new ClienteServiceimpl();
	}

}

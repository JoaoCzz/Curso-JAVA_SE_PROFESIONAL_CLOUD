package main;

import DAO.ClientesDAO;
import DAO.DAOFactory;
import Modelo.Clientes;
import Service.ClienteServiceFactory;
import Service.ClientesService;

public class prueba {
	 public static void main(String[] args) {
	        // Crear un objeto Clientes con datos de prueba
	        Clientes cliente = new Clientes();
	        cliente.setUsuario("usuario_prueba");
	        cliente.setPassword("contraseña_prueba");
	        cliente.setEmail("correo_prueba@example.com");
	        cliente.setTelefono(123456789);

	        // Crear una instancia de ClienteServiceimpl
	        ClientesService clienteService = ClienteServiceFactory.getClienteService();
	        ClientesDAO dao= DAOFactory.getClienteDAO();
	        

	        // Llamar al método registrar y guardar el resultado
	        boolean registroExitoso = clienteService.registrar(cliente);

	        // Imprimir el resultado del registro
	        if (registroExitoso) {
	            System.out.println("Cliente registrado exitosamente.");
	        } else {
	            System.out.println("No se pudo registrar el cliente.");
	            System.out.println(clienteService.coinciden("usuario_prueba", "contraseña_prueba"));
	            System.out.println(dao.findCliente(cliente.getUsuario()));
	        }
	        
	    }
}

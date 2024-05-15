package Graficos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Clientes;
import Service.ClienteServiceFactory;
import Service.ClientesService;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Jtusuario;
	private JPasswordField JPassword;
	private JTextField JTEmail;
	private JTextField Jtelefono;
	ClientesService clienteService;
	private JLabel Mensaje;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registro frame = new Registro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Registro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario:");
		lblNewLabel.setBounds(21, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		Jtusuario = new JTextField();
		Jtusuario.setBounds(129, 8, 86, 20);
		contentPane.add(Jtusuario);
		Jtusuario.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Contraseña:");
		lblNewLabel_1.setBounds(10, 52, 71, 14);
		contentPane.add(lblNewLabel_1);
		
		JPassword = new JPasswordField();
		JPassword.setBounds(129, 49, 86, 20);
		contentPane.add(JPassword);
		
		JLabel lblNewLabel_2 = new JLabel("Email:");
		lblNewLabel_2.setBounds(21, 105, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JTEmail = new JTextField();
		JTEmail.setBounds(129, 102, 86, 20);
		contentPane.add(JTEmail);
		JTEmail.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Telefono: ");
		lblNewLabel_3.setBounds(10, 149, 71, 14);
		contentPane.add(lblNewLabel_3);
		

		Mensaje = new JLabel("");
		Mensaje.setBounds(10, 174, 414, 87);
		contentPane.add(Mensaje);
		
		Jtelefono = new JTextField();
		Jtelefono.setBounds(129, 146, 86, 20);
		contentPane.add(Jtelefono);
		Jtelefono.setColumns(10);
		
		JButton btnNewButton = new JButton("Registrarse");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				clienteService= ClienteServiceFactory.getClienteService();
				Clientes aux= new Clientes();
				aux.setIdCliente(0);
				aux.setUsuario(Jtusuario.getText());
				aux.setPassword(new String(JPassword.getPassword()));
				aux.setEmail(JTEmail.getText());
				aux.setTelefono(Integer.parseInt(Jtelefono.getText()));
				
				if(clienteService.registrar(aux)==true) {
					Mensaje.setText("Registrado");
				}else {
					Mensaje.setText("Hubo un error");
					
				}
			} catch (NumberFormatException ex) {
	            Mensaje.setText("Número de teléfono inválido");
	        } catch (Exception ex) {
	            Mensaje.setText("Error inesperado: " + ex.getMessage());
	            ex.printStackTrace();
	        }
			}
		});
		btnNewButton.setBounds(296, 69, 89, 23);
		contentPane.add(btnNewButton);
		
		
	}

}

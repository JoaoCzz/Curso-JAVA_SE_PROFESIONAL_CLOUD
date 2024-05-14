package Graficos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Clientes;
import Service.ClienteServiceFactory;
import Service.ClientesService;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Jtf1;
	private JPasswordField Jpf1;
	ClientesService clienteService;
	private JLabel Mensaje;
	private JButton Registrarse;
	
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		clienteService= ClienteServiceFactory.getClienteService();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario:");
		lblNewLabel.setBounds(60, 59, 46, 14);
		contentPane.add(lblNewLabel);
		
		Jtf1 = new JTextField();
		Jtf1.setBounds(133, 56, 86, 20);
		contentPane.add(Jtf1);
		Jtf1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Contraseña:");
		lblNewLabel_1.setBounds(58, 122, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		Jpf1 = new JPasswordField();
		Jpf1.setBounds(133, 119, 86, 20);
		contentPane.add(Jpf1);
		
		JButton Entrar = new JButton("Entrar");
		Entrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(clienteService.coinciden(Jtf1.getText(), new String(Jpf1.getPassword()))) {
					Mensaje.setText("Bienvenido");
				}else {
				Mensaje.setText("puto");
				}
				JOptionPane.showConfirmDialog(Login.this, Mensaje);
			}
		});
		Entrar.setBounds(60, 184, 89, 23);
		contentPane.add(Entrar);
		
		Mensaje = new JLabel("");
		Mensaje.setBounds(154, 236, 46, 14);
		contentPane.add(Mensaje);
		
		
		
		Registrarse = new JButton("Registrarse");
		Registrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
		Registro registrartepto= new Registro();
		registrartepto.setVisible(true);
			
			
		}
		});
		Registrarse.setBounds(213, 184, 89, 23);
	contentPane.add(Registrarse);
		
		
		

	
	}	
}

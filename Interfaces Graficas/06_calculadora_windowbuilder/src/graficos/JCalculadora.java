package graficos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;

public class JCalculadora extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField jtf1;
	private JTextField jtf2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JCalculadora frame = new JCalculadora();
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
	public JCalculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Numero 1");
		lblNewLabel.setBounds(33, 31, 89, 21);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		contentPane.add(lblNewLabel);
		
		jtf1 = new JTextField();
		jtf1.setBounds(108, 31, 86, 20);
		contentPane.add(jtf1);
		jtf1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Numero 2");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(33, 79, 65, 30);
		contentPane.add(lblNewLabel_1);
		
		jtf2 = new JTextField();
		jtf2.setBounds(108, 84, 86, 20);
		contentPane.add(jtf2);
		jtf2.setColumns(10);

		JLabel lbResultado = new JLabel("");
		lbResultado.setBounds(127, 200, 113, 14);
		contentPane.add(lbResultado);
		
		JButton jbtSumar = new JButton("Sumar");
		jbtSumar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int suma= Integer.parseInt(jtf1.getText())+Integer.parseInt(jtf2.getText());
				lbResultado.setText("El resultado es:" + suma);
				
			}
		});
		jbtSumar.setBounds(33, 140, 89, 23);
		contentPane.add(jbtSumar);
		
		JButton jbtMultiplicar = new JButton("Multiplicar");
		jbtMultiplicar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int multiplicacion= Integer.parseInt(jtf1.getText())*Integer.parseInt(jtf2.getText());
				lbResultado.setText("El resultado es:" + multiplicacion);
				
			}
		
		
	});
		jbtMultiplicar.setBounds(151, 140, 89, 23);
		contentPane.add(jbtMultiplicar);
		
		JButton Cerrar = new JButton("Cerrar");
		Cerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JCalculadora.this.dispose();
			}
		});
		Cerrar.setBounds(345, 0, 89, 23);
		contentPane.add(Cerrar);
	
	}
}


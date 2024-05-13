package Graficos;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaControladores extends JFrame {
	
	public VentanaControladores() {
		super("Ventana controles");
		this.setBounds(100, 100, 700, 300);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		initComponets();
		this.setVisible(true);
	}
	private void initComponets() {
		this.setLayout(null);
		JButton jbt1= new JButton("Pulsar Aqui");
		JLabel jl1= new JLabel();
		JButton colorear= new JButton("Colorear");
		colorear.setBounds(400, 50, 120, 50);
		jl1.setBounds(100, 100, 150, 40);
		jbt1.setBounds(50,50,300,50);
		this.add(jbt1);
		//Gestion de eventos
		ActionListener l1= e -> jbt1.setText("Has pulsado");
		jbt1.addActionListener(l1);
		
		ActionListener l2= e -> VentanaControladores.this.getContentPane().setBackground(Color.YELLOW);
		colorear.addActionListener(l2);
	}
}

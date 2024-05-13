package Graficos;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

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
		jbt1.setBounds(50,50,300,50);
		this.add(jbt1);
	}
}

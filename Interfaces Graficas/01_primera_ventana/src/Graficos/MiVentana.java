package Graficos;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MiVentana extends JFrame {
public MiVentana() {
	super("Primera ventana Swing");
	this.setBounds(100, 100, 700, 300);
	this.setVisible(true);
	this.getContentPane().setBackground(Color.YELLOW);
	this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}

}

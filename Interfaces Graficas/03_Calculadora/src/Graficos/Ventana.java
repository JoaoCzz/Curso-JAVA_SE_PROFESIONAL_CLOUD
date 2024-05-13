package Graficos;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ventana extends JFrame{
	public Ventana() {
		super("JCalculadora");
		this.setBounds(100, 100, 700, 300);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		InitComponets();
		this.setVisible(true);
	}
	
	public void InitComponets() {
		JLabel jl1 = new JLabel("Numero 1");
        JLabel jl2 = new JLabel("Numero 2");
        JLabel jlResultado = new JLabel("");
        JTextField jtf1 = new JTextField();
        JTextField jtf2 = new JTextField();
        JButton jbSumar = new JButton("Sumar");
        JButton jbMultiplicar = new JButton("Multiplicar");
        jl1.setBounds(150, 50, 130, 40); 
        jtf1.setBounds(280, 50, 100, 40);
        jl2.setBounds(150, 130, 130, 40); 
        jtf2.setBounds(280, 130, 100, 40);
        jlResultado.setBounds(50, 150, 220, 30); 
        jbSumar.setBounds(120, 220, 150, 50); 
        jbMultiplicar.setBounds(360, 220, 150, 50);
        
        this.add(jl1);
        this.add(jtf1);
        this.add(jl2);
        this.add(jtf2);
        this.add(jlResultado);
        this.add(jbSumar);
        this.add(jbMultiplicar);
		
		
	}
}

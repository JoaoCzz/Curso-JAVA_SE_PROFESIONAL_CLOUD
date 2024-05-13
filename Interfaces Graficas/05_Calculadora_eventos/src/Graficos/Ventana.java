package Graficos;

import java.awt.Color;
import java.awt.event.ActionListener;

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
        jl1.setBounds(50, 50, 100, 30); 
        jtf1.setBounds(170, 50, 100, 30); 
        jl2.setBounds(50, 100, 100, 30); 
        jtf2.setBounds(170, 100, 100, 30); 
        jlResultado.setBounds(50, 150, 220, 30); 
        jbSumar.setBounds(50, 200, 100, 50); 
        jbMultiplicar.setBounds(170, 200, 100, 50);
        
        this.add(jl1);
        this.add(jtf1);
        this.add(jl2);
        this.add(jtf2);
        this.add(jlResultado);
        this.add(jbSumar);
        this.add(jbMultiplicar);
        //Eventos
        
        ActionListener a1=( e ->{
        	int a= Integer.parseInt(jtf1.getText());
        	int b= Integer.parseInt(jtf2.getText());
        	int resultado= a+b;
        	jlResultado.setText("Es: "+resultado);
        });
        		jbSumar.addActionListener(a1);
		
        		ActionListener a2=( e ->{
                	int a= Integer.parseInt(jtf1.getText());
                	int b= Integer.parseInt(jtf2.getText());
                	int resultado= a*b;
                	jlResultado.setText("Es: "+resultado);
                });
                		jbMultiplicar.addActionListener(a2);
        		
	}
}

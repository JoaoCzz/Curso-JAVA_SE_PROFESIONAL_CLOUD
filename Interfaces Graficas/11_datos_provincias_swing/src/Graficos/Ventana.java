package Graficos;

import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import adaptadores.TableModelPaisesImpl;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Comunidad:");
		lblNewLabel.setBounds(27, 24, 66, 14);
		contentPane.add(lblNewLabel);
		
		JComboBox ComboComunidades = new JComboBox();
		ComboComunidades.setBounds(110, 20, 111, 22);
		ComboComunidades.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					String seleccionado=(String)ComboComunidades.getSelectedItem();
		contentPane.add(ComboComunidades);
		
		JLabel lblNewLabel_1 = new JLabel("Provincia:");
		lblNewLabel_1.setBounds(30, 73, 63, 14);
		contentPane.add(lblNewLabel_1);
		
		JComboBox ComboProvincias = new JComboBox();
		ComboProvincias.setBounds(110, 69, 111, 22);
		ComboProvincias.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					String seleccionado=(String)ComboProvincias.getSelectedItem();
		contentPane.add(ComboProvincias);
		var adaptador=new TableModelMunicipiosImpl(seleccionado);
		table.setModel(adaptador);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(81, 107, 311, 143);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setColumnHeaderView(table);
		
		JLabel lblNewLabel_2 = new JLabel("Municipios:");
		lblNewLabel_2.setBounds(8, 159, 63, 14);
		contentPane.add(lblNewLabel_2);
	}
}

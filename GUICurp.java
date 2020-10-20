package ADAS.ada2_elCurp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUICurp extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textApellidoPaterno;
	private JTextField textApellidoMaterno;
	private JTextField textAnio;
	DefaultComboBoxModel modelEstados = new DefaultComboBoxModel();
	ButtonGroup grupoBotones = new ButtonGroup();
	int indice = 0;
	listaPersonas Curps = new listaPersonas();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUICurp frame = new GUICurp();
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
	
	public GUICurp() {
		
		String meses[] = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto", "Septiembre", "Octubre", "Noviembre","Diciembre"};
		
		Estado estados[] = {
			new Estado("Aguascalientes", "AG"),
			new Estado("Baja california", "BC"),
			new Estado("Baja california sur", "BS"),
			new Estado("Campeche", "CM"),
			new Estado("Chiapas", "CS"),
			new Estado("Chihuahua", "CH"),
			new Estado("Coahuila de Zaragoza", "CO"),
			new Estado("Colima", "CL"),
			new Estado("Ciudad de México", "CX"),
			new Estado("Durango", "DG"),
			new Estado("Guanajuato", "GT"),
			new Estado("Guerrero", "GR"),
			new Estado("Hidalgo", "HG"),
			new Estado("Jalisco", "JC"),
			new Estado("México", "EM"),
			new Estado("Michoacan de Ocampo", "MI"),
			new Estado("Morelos", "MO"),
			new Estado("Nayarit", "NA"),
			new Estado("Nuevo león", "NL"),
			new Estado("Oaxaca", "OA"),
			new Estado("Puebla", "PU"),
			new Estado("Querétaro", "QT"),
			new Estado("Quintana roo", "QR"),
			new Estado("San luis potosí", "SL"),
			new Estado("Sinaloa", "SI"),
			new Estado("Sonora", "SO"),
			new Estado("Tabasco", "TB"),
			new Estado("Tamaulipas", "TM"),
			new Estado("Tlaxcala", "TL"),
			new Estado("Veracruz", "VE"),
			new Estado("Yucatán", "YU"),
			new Estado("Zacatecas", "ZA"),
		};
		
		for(int i=0; i<estados.length; i++) {
			modelEstados.addElement(estados[i]);
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 388, 504);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Generardor de CURP");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(102, 6, 172, 48);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setBounds(30, 67, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Apellido paterno:");
		lblNewLabel_2.setBounds(30, 95, 136, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Apellido materno:");
		lblNewLabel_3.setBounds(30, 123, 121, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Fecha de nacimiento:");
		lblNewLabel_4.setBounds(30, 151, 145, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Sexo:");
		lblNewLabel_5.setBounds(30, 258, 61, 16);
		contentPane.add(lblNewLabel_5);
		
		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setBounds(40, 286, 141, 23);
		contentPane.add(rdbtnMasculino);
		grupoBotones.add(rdbtnMasculino);
		
		JRadioButton rdbtnFemenino= new JRadioButton("Femenino");
		rdbtnFemenino.setBounds(40, 311, 105, 23);
		contentPane.add(rdbtnFemenino);
		grupoBotones.add(rdbtnFemenino);
		
		
		JLabel lblNewLabel_6 = new JLabel("Estado de nacimiento:");
		lblNewLabel_6.setBounds(30, 346, 145, 16);
		contentPane.add(lblNewLabel_6);
		
		JComboBox cmbEstados = new JComboBox();
		cmbEstados.setBounds(175, 344, 191, 23);
		contentPane.add(cmbEstados);
		cmbEstados.setModel(modelEstados);
		
		
		textNombre = new JTextField();
		textNombre.setBounds(103, 62, 217, 26);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		textApellidoPaterno = new JTextField();
		textApellidoPaterno.setBounds(148, 90, 172, 26);
		contentPane.add(textApellidoPaterno);
		textApellidoPaterno.setColumns(10);
		
		textApellidoMaterno = new JTextField();
		textApellidoMaterno.setBounds(148, 118, 172, 26);
		contentPane.add(textApellidoMaterno);
		textApellidoMaterno.setColumns(10);

		
		JLabel lblNewLabel_7 = new JLabel("Día");
		lblNewLabel_7.setBounds(40, 174, 33, 16);
		contentPane.add(lblNewLabel_7);
		
		JComboBox cmbDia = new JComboBox();
		cmbDia.setBounds(71, 173, 80, 20);
		contentPane.add(cmbDia);
		for (int i=0; i<31; i++) {
			cmbDia.addItem(String.valueOf(i+1));
		}
		
		JLabel lblNewLabel_8 = new JLabel("Mes");
		lblNewLabel_8.setBounds(40, 202, 33, 16);
		contentPane.add(lblNewLabel_8);
		
		JComboBox cmbMes = new JComboBox();
		cmbMes.setBounds(71, 198, 145, 27);
		contentPane.add(cmbMes);
		for (int i= 0; i<meses.length; i++) {
			cmbMes.addItem(meses[i]);
		}
				
		JLabel lblNewLabel_9 = new JLabel("Año");
		lblNewLabel_9.setBounds(40, 230, 33, 16);
		contentPane.add(lblNewLabel_9);
		
		textAnio = new JTextField();
		textAnio.setBounds(73, 225, 104, 26);
		contentPane.add(textAnio);
		textAnio.setColumns(10);
		
		JButton btnNewButton = new JButton("Generar CURP");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Persona persona = new Persona();
				
				persona.setNombre(textNombre.getText().toUpperCase());
				persona.setApellidoPaterno(textApellidoPaterno.getText().toUpperCase());
				persona.setApellidoMaterno(textApellidoMaterno.getText().toUpperCase());
				persona.setDia(cmbDia.getSelectedItem().toString());
				persona.setMes(cmbMes.getSelectedIndex() + 1);
				persona.setAnio(textAnio.getText());	
				if(rdbtnMasculino.isSelected()) { 
					persona.setHombre(true); 
				} else { 
					persona.setHombre(false);
				}
				persona.setEstado((Estado) cmbEstados.getSelectedItem());
				persona.setIndice(Integer.toString(indice));
				
				String CURP = persona.generateCurp();
				
				persona.setCurp(CURP);
				JOptionPane.showMessageDialog(null, "Su CURP es: " + CURP);
				
				Curps.arrPersonas[indice] = persona;
				
				indice++;
				textNombre.setText("");
				textApellidoPaterno.setText("");
				textApellidoMaterno.setText("");
				textAnio.setText("");
				cmbDia.setSelectedIndex(0);
				cmbMes.setSelectedIndex(0);
				cmbEstados.setSelectedIndex(0);
			}
		});
		btnNewButton.setBounds(102, 393, 160, 36);
		contentPane.add(btnNewButton);
		
		
		
		JButton btnMostrar = new JButton("Mostrar otros CURP");
		btnMostrar.setBounds(102, 441, 160, 36);
		contentPane.add(btnMostrar);
		
		
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnMostrar.setVisible(false);
				MostrarCurps mostrarCurps = new MostrarCurps();
				mostrarCurps.setVisible(true);
				mostrarCurps.Curps.arrPersonas = Curps.arrPersonas;
				
			}
		});
	}
}

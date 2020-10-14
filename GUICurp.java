package ADAS.ada2_elCurp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;

public class GUICurp extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

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
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Masculino");
		rdbtnNewRadioButton.setBounds(40, 286, 141, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Femenino");
		rdbtnNewRadioButton_1.setBounds(40, 311, 105, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_6 = new JLabel("Estado de nacimiento:");
		lblNewLabel_6.setBounds(30, 346, 145, 16);
		contentPane.add(lblNewLabel_6);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(175, 344, 145, 23);
		contentPane.add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(103, 62, 217, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(148, 90, 172, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(148, 118, 172, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Generar CURP");
		btnNewButton.setBounds(102, 393, 160, 36);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Mostrar otros CURP");
		btnNewButton_1.setBounds(102, 441, 160, 36);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_7 = new JLabel("Día");
		lblNewLabel_7.setBounds(40, 174, 33, 16);
		contentPane.add(lblNewLabel_7);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(71, 173, 61, 20);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel_8 = new JLabel("Mes");
		lblNewLabel_8.setBounds(40, 202, 33, 16);
		contentPane.add(lblNewLabel_8);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(71, 198, 110, 27);
		contentPane.add(comboBox_2);
		
		JLabel lblNewLabel_9 = new JLabel("Año");
		lblNewLabel_9.setBounds(40, 230, 33, 16);
		contentPane.add(lblNewLabel_9);
		
		textField_3 = new JTextField();
		textField_3.setBounds(73, 225, 104, 26);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
	}
}

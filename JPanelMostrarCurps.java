package ADAS.ada2_elCurp;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class JPanelMostrarCurps extends JPanel {

	/**
	 * Create the panel.
	 */
	public JPanelMostrarCurps() {
		
		setBounds(100, 100, 388, 504);
		setLayout(null);
		setLayout(null);
		
		JButton btnRegresar = new JButton("< Regresar");
		btnRegresar.setBounds(6, 18, 112, 29);
		add(btnRegresar);
		
		JLabel lblNewLabel = new JLabel("Lista de CURPS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel.setBounds(102, 6, 172, 48);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre(s):");
		lblNewLabel_1.setBounds(34, 78, 83, 16);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Apellidos: ");
		lblNewLabel_2.setBounds(34, 126, 73, 16);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Fecha de nacimiento: ");
		lblNewLabel_3.setBounds(34, 171, 137, 16);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Sexo:");
		lblNewLabel_4.setBounds(34, 216, 61, 16);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Entidad federativa:");
		lblNewLabel_5.setBounds(34, 259, 137, 16);
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("CURP: ");
		lblNewLabel_6.setBounds(34, 307, 61, 16);
		add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("Anterior");
		btnNewButton.setBounds(34, 381, 117, 29);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Siguiente");
		btnNewButton_1.setBounds(211, 381, 117, 29);
		add(btnNewButton_1);
		
		
	}

}

package ADAS.ada2_elCurp;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class MostrarCurps extends JFrame {

	private JPanel contentPane;
	public  listaPersonas Curps = new listaPersonas();
	public int indice = 0;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MostrarCurps frame = new MostrarCurps();
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
	public MostrarCurps() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 375, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Lista de CURPS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel.setBounds(102, 6, 172, 48);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre(s):");
		lblNewLabel_1.setBounds(34, 78, 83, 16);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Apellidos: ");
		lblNewLabel_2.setBounds(34, 126, 73, 16);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Fecha de nacimiento: ");
		lblNewLabel_3.setBounds(34, 171, 137, 16);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Sexo:");
		lblNewLabel_4.setBounds(34, 216, 61, 16);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Entidad federativa:");
		lblNewLabel_5.setBounds(34, 259, 137, 16);
		getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("CURP: ");
		lblNewLabel_6.setBounds(34, 307, 61, 16);
		getContentPane().add(lblNewLabel_6);
		
		JButton btnAnterior = new JButton("Anterior");
		
		btnAnterior.setBounds(34, 381, 117, 29);
		getContentPane().add(btnAnterior);
		
		JButton btnSiguiente = new JButton("Siguiente");
		
		btnSiguiente.setBounds(211, 381, 117, 29);
		getContentPane().add(btnSiguiente);
		
		JLabel lblNombre = new JLabel("");
		lblNombre.setBounds(110, 78, 187, 16);
		getContentPane().add(lblNombre);
		
		JLabel lblApellidos = new JLabel("");
		lblApellidos.setBounds(110, 126, 187, 16);
		getContentPane().add(lblApellidos);
		
		JLabel lblDate = new JLabel("");
		lblDate.setBounds(183, 171, 187, 16);
		getContentPane().add(lblDate);
		
		JLabel lblSexo = new JLabel("");
		lblSexo.setBounds(75, 216, 187, 16);
		getContentPane().add(lblSexo);
		
		JLabel lblEstado = new JLabel("");
		lblEstado.setBounds(162, 259, 187, 16);
		getContentPane().add(lblEstado);
		
		JLabel lblCurp = new JLabel("");
		lblCurp.setBounds(75, 307, 199, 16);
		getContentPane().add(lblCurp);

		
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNombre.setText(Curps.arrPersonas[indice].nombre);
				lblApellidos.setText(Curps.arrPersonas[indice].apellidoPaterno + " " + Curps.arrPersonas[indice].apellidoMaterno);
				lblDate.setText(Curps.arrPersonas[indice].dia + "/" + Curps.arrPersonas[indice].mes + "/" + Curps.arrPersonas[indice].anio);
				String sexo;
				if (Curps.arrPersonas[indice].Hombre == true) {
					sexo = "Masculino";
				} else {
					sexo = "Femenino";
				}
				
				lblSexo.setText(sexo);
				lblEstado.setText(Curps.arrPersonas[indice].estado.getNombre());
				lblCurp.setText(Curps.arrPersonas[indice].Curp);
				
				if (indice < Curps.arrPersonas.length) {
					indice--;
				} else {
					JOptionPane.showMessageDialog(null, "No hay mas elementos en la lista para recorrer");
				}
				
			}
		});
		
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println(Curps.arrPersonas[indice].nombre);
				lblNombre.setText(Curps.arrPersonas[indice].nombre);
				lblApellidos.setText(Curps.arrPersonas[indice].apellidoPaterno + " " + Curps.arrPersonas[indice].apellidoMaterno);
				lblDate.setText(Curps.arrPersonas[indice].dia + "/" + Curps.arrPersonas[indice].mes + "/" + Curps.arrPersonas[indice].anio);
				String sexo;
				if (Curps.arrPersonas[indice].Hombre == true) {
					sexo = "Masculino";
				} else {
					sexo = "Femenino";
				}
				
				lblSexo.setText(sexo);
				lblEstado.setText(Curps.arrPersonas[indice].estado.getNombre());
				lblCurp.setText(Curps.arrPersonas[indice].Curp);
				
				if (indice < Curps.arrPersonas.length && indice >= 0) {
					indice++;
				} else {
					JOptionPane.showMessageDialog(null, "No hay mas elementos en la lista para recorrer");
				}
			}
		});
	}

}



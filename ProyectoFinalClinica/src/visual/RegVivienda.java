package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class RegVivienda extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtCalle;
	private JTextField txtSector;
	private JTextField txtCiudad;
	private JTextField txtTelefono;
	private static DefaultTableModel model;
	private static Object[] row;
	private JTextField txtBuscar;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegVivienda dialog = new RegVivienda();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegVivienda() {
		setTitle("Registrar Vivienda");
		setBounds(100, 100, 554, 389);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(218, 221, 216));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(107, 170, 117, 60));
			panel.setBounds(0, 11, 538, 136);
			contentPanel.add(panel);
			panel.setLayout(null);
			
			JLabel lblCalle = new JLabel("Calle:");
			lblCalle.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
			lblCalle.setOpaque(true);
			lblCalle.setHorizontalAlignment(SwingConstants.CENTER);
			lblCalle.setForeground(new Color(0, 0, 0));
			lblCalle.setBackground(new Color(255, 255, 255));
			lblCalle.setBounds(23, 19, 72, 22);
			panel.add(lblCalle);
			{
				JLabel lblSector = new JLabel("Sector:");
				lblSector.setOpaque(true);
				lblSector.setHorizontalAlignment(SwingConstants.CENTER);
				lblSector.setForeground(Color.BLACK);
				lblSector.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
				lblSector.setBackground(Color.WHITE);
				lblSector.setBounds(23, 54, 72, 22);
				panel.add(lblSector);
			}
			
			txtCalle = new JTextField();
			txtCalle.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
			txtCalle.setBounds(105, 19, 140, 22);
			panel.add(txtCalle);
			txtCalle.setColumns(10);
			
			txtSector = new JTextField();
			txtSector.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
			txtSector.setColumns(10);
			txtSector.setBounds(105, 54, 140, 22);
			panel.add(txtSector);
			
			JLabel lblCiudad = new JLabel("Ciudad:");
			lblCiudad.setOpaque(true);
			lblCiudad.setHorizontalAlignment(SwingConstants.CENTER);
			lblCiudad.setForeground(Color.BLACK);
			lblCiudad.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
			lblCiudad.setBackground(Color.WHITE);
			lblCiudad.setBounds(291, 19, 72, 22);
			panel.add(lblCiudad);
			
			txtCiudad = new JTextField();
			txtCiudad.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
			txtCiudad.setColumns(10);
			txtCiudad.setBounds(373, 19, 140, 22);
			panel.add(txtCiudad);
			
			JLabel lblTelefono = new JLabel("Telefono:");
			lblTelefono.setOpaque(true);
			lblTelefono.setHorizontalAlignment(SwingConstants.CENTER);
			lblTelefono.setForeground(Color.BLACK);
			lblTelefono.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
			lblTelefono.setBackground(Color.WHITE);
			lblTelefono.setBounds(291, 54, 72, 22);
			panel.add(lblTelefono);
			
			txtTelefono = new JTextField();
			txtTelefono.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
			txtTelefono.setColumns(10);
			txtTelefono.setBounds(373, 54, 140, 22);
			panel.add(txtTelefono);
			
			JLabel lblNumero = new JLabel("N\u00FAmero:");
			lblNumero.setOpaque(true);
			lblNumero.setHorizontalAlignment(SwingConstants.CENTER);
			lblNumero.setForeground(Color.BLACK);
			lblNumero.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
			lblNumero.setBackground(Color.WHITE);
			lblNumero.setBounds(23, 89, 72, 22);
			panel.add(lblNumero);
			
			JSpinner spinner = new JSpinner();
			spinner.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
			spinner.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
			spinner.setBounds(105, 89, 72, 22);
			panel.add(spinner);
		}
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(105, 116, 124, 120));
		panel.setBounds(0, 158, 538, 136);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblBuscar = new JLabel("Buscar:");
		lblBuscar.setOpaque(true);
		lblBuscar.setHorizontalAlignment(SwingConstants.CENTER);
		lblBuscar.setForeground(Color.BLACK);
		lblBuscar.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
		lblBuscar.setBackground(Color.WHITE);
		lblBuscar.setBounds(22, 21, 62, 22);
		panel.add(lblBuscar);
		
		txtBuscar = new JTextField();
		txtBuscar.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
		txtBuscar.setColumns(10);
		txtBuscar.setBounds(94, 21, 140, 22);
		panel.add(txtBuscar);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(244, 21, 38, 22);
		panel.add(btnNewButton);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setOpaque(true);
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setForeground(Color.BLACK);
		lblNombre.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
		lblNombre.setBackground(Color.WHITE);
		lblNombre.setBounds(22, 59, 62, 22);
		panel.add(lblNombre);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(94, 59, 188, 22);
		panel.add(textField_2);
		
		JButton btnAsignar = new JButton("Asignar residente");
		btnAsignar.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
		btnAsignar.setBounds(94, 92, 140, 22);
		panel.add(btnAsignar);
		
		JLabel lblNewLabel = new JLabel("Imagen");
		lblNewLabel.setBounds(374, 21, 140, 93);
		panel.add(lblNewLabel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnRegistrar = new JButton("Registrar");
				btnRegistrar.setFont(new Font("Gill Sans MT", Font.PLAIN, 14));
				btnRegistrar.setActionCommand("OK");
				buttonPane.add(btnRegistrar);
				getRootPane().setDefaultButton(btnRegistrar);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.setFont(new Font("Gill Sans MT", Font.PLAIN, 14));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}

package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import logico.Clinica;
import logico.Paciente;
import logico.Vivienda;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;

public class RegVivienda extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtCalle;
	private JTextField txtSector;
	private JTextField txtCiudad;
	private JTextField txtTelefono;
	private JTextField txtBuscar;
	private JTextField txtNombre;
	private Vivienda vivienda = null;
	private ArrayList<Paciente> residentesAAgregar = new ArrayList<Paciente>();
	private Paciente pacienteABuscar = new Paciente("", "", null, '0', "", "", "");
	private JSpinner spnNumero;
	private JButton btnAsignar;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegVivienda dialog = new RegVivienda(null, false);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegVivienda(Vivienda viviendaAModificar, boolean mod) {
		
		
		//Pacientes para probar el bot�n de b�squeda por c�dula 
		Clinica.getInstance().insertarPaciente(new Paciente("001", "Julito", null, 'M', "809", "123232", "000"));
		Clinica.getInstance().insertarPaciente(new Paciente("100", "Pedrito", null, 'M', "809", "123232", "000"));
		
		setTitle("Registrar Vivienda");
		
		vivienda = viviendaAModificar;
		
		if (vivienda != null) {
			
			if (mod) {
				setTitle("Modificar Vivienda");
			}
			else {
				setTitle("Visualizar Vivienda");
			}
		}
		
		setResizable(false);
		setBounds(100, 100, 554, 345);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(218, 221, 216));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panelContenedor1 = new JPanel();
			panelContenedor1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panelContenedor1.setBackground(new Color(107, 170, 117, 60));
			panelContenedor1.setBounds(0, 11, 538, 111);
			contentPanel.add(panelContenedor1);
			panelContenedor1.setLayout(null);
			
			JLabel lblCalle = new JLabel("Calle:");
			lblCalle.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
			lblCalle.setOpaque(true);
			lblCalle.setHorizontalAlignment(SwingConstants.CENTER);
			lblCalle.setForeground(new Color(0, 0, 0));
			lblCalle.setBackground(new Color(255, 255, 255));
			lblCalle.setBounds(23, 9, 72, 22);
			panelContenedor1.add(lblCalle);
			{
				JLabel lblSector = new JLabel("Sector:");
				lblSector.setOpaque(true);
				lblSector.setHorizontalAlignment(SwingConstants.CENTER);
				lblSector.setForeground(Color.BLACK);
				lblSector.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
				lblSector.setBackground(Color.WHITE);
				lblSector.setBounds(23, 44, 72, 22);
				panelContenedor1.add(lblSector);
			}
			
			txtCalle = new JTextField();
			txtCalle.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
			txtCalle.setBounds(105, 9, 140, 22);
			panelContenedor1.add(txtCalle);
			txtCalle.setColumns(10);
			
			txtSector = new JTextField();
			txtSector.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
			txtSector.setColumns(10);
			txtSector.setBounds(105, 44, 140, 22);
			panelContenedor1.add(txtSector);
			
			JLabel lblCiudad = new JLabel("Ciudad:");
			lblCiudad.setOpaque(true);
			lblCiudad.setHorizontalAlignment(SwingConstants.CENTER);
			lblCiudad.setForeground(Color.BLACK);
			lblCiudad.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
			lblCiudad.setBackground(Color.WHITE);
			lblCiudad.setBounds(291, 9, 72, 22);
			panelContenedor1.add(lblCiudad);
			
			txtCiudad = new JTextField();
			txtCiudad.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
			txtCiudad.setColumns(10);
			txtCiudad.setBounds(373, 9, 140, 22);
			panelContenedor1.add(txtCiudad);
			
			JLabel lblTelefono = new JLabel("Telefono:");
			lblTelefono.setOpaque(true);
			lblTelefono.setHorizontalAlignment(SwingConstants.CENTER);
			lblTelefono.setForeground(Color.BLACK);
			lblTelefono.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
			lblTelefono.setBackground(Color.WHITE);
			lblTelefono.setBounds(291, 44, 72, 22);
			panelContenedor1.add(lblTelefono);
			
			txtTelefono = new JTextField();
			txtTelefono.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
			txtTelefono.setColumns(10);
			txtTelefono.setBounds(373, 44, 140, 22);
			panelContenedor1.add(txtTelefono);
			
			JLabel lblNumero = new JLabel("N\u00FAmero:");
			lblNumero.setOpaque(true);
			lblNumero.setHorizontalAlignment(SwingConstants.CENTER);
			lblNumero.setForeground(Color.BLACK);
			lblNumero.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
			lblNumero.setBackground(Color.WHITE);
			lblNumero.setBounds(23, 79, 72, 22);
			panelContenedor1.add(lblNumero);
			
			spnNumero = new JSpinner();
			spnNumero.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
			spnNumero.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
			spnNumero.setBounds(105, 79, 72, 22);
			panelContenedor1.add(spnNumero);
		}
		
		JPanel panelContenedor2 = new JPanel();
		panelContenedor2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelContenedor2.setBackground(new Color(105, 116, 124, 120));
		panelContenedor2.setBounds(0, 132, 538, 123);
		contentPanel.add(panelContenedor2);
		panelContenedor2.setLayout(null);
		
		JLabel lblBuscar = new JLabel("Buscar:");
		lblBuscar.setOpaque(true);
		lblBuscar.setHorizontalAlignment(SwingConstants.CENTER);
		lblBuscar.setForeground(Color.BLACK);
		lblBuscar.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
		lblBuscar.setBackground(Color.WHITE);
		lblBuscar.setBounds(22, 14, 62, 22);
		panelContenedor2.add(lblBuscar);
		
		txtBuscar = new JTextField();
		txtBuscar.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
		txtBuscar.setColumns(10);
		txtBuscar.setBounds(94, 14, 140, 22);
		panelContenedor2.add(txtBuscar);
		
		JButton btnBuscar = new JButton("");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				pacienteABuscar = Clinica.getInstance().buscarPacienteByCedula(txtBuscar.getText());
				
				if (pacienteABuscar != null) {
					
					txtNombre.setText(pacienteABuscar.getNombre());
					btnAsignar.setEnabled(true);
				}
				
			}
		});
		btnBuscar.setBounds(257, 14, 25, 22);
		panelContenedor2.add(btnBuscar);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setOpaque(true);
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setForeground(Color.BLACK);
		lblNombre.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
		lblNombre.setBackground(Color.WHITE);
		lblNombre.setBounds(22, 52, 62, 22);
		panelContenedor2.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
		txtNombre.setColumns(10);
		txtNombre.setBounds(94, 52, 188, 22);
		panelContenedor2.add(txtNombre);
		
		btnAsignar = new JButton("Asignar residente");
		btnAsignar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				residentesAAgregar.add(pacienteABuscar);
				txtBuscar.setText("");
				txtNombre.setText("");
				btnAsignar.setEnabled(false);
			}
		});
		btnAsignar.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
		btnAsignar.setBounds(94, 85, 140, 22);
		panelContenedor2.add(btnAsignar);
		btnAsignar.setEnabled(false);
		
		JLabel lblNewLabel = new JLabel("Imagen");
		lblNewLabel.setBounds(400, 14, 113, 93);
		panelContenedor2.add(lblNewLabel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnRegistrar = new JButton("Registrar");
				btnRegistrar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						if (vivienda == null) {
							
							Vivienda nuevaVivienda = new Vivienda(txtCalle.getText(), spnNumero.getValue().toString(), txtSector.getText(), txtCiudad.getText(), txtTelefono.getText());
							nuevaVivienda.getResidentes().addAll(residentesAAgregar);
							Clinica.getInstance().insertarVivienda(nuevaVivienda);
							JOptionPane.showMessageDialog(null, "Registrada con �xito", "Registrar Vivienda", JOptionPane.INFORMATION_MESSAGE);
							clean();
							
						}
						
					}
				});
				btnRegistrar.setFont(new Font("Gill Sans MT", Font.PLAIN, 14));
				btnRegistrar.setActionCommand("OK");
				buttonPane.add(btnRegistrar);
				getRootPane().setDefaultButton(btnRegistrar);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setFont(new Font("Gill Sans MT", Font.PLAIN, 14));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	
	public void clean() {
		
		txtCalle.setText("");
		txtSector.setText("");
		spnNumero.setValue(new Integer(1));
		txtCiudad.setText("");
		txtTelefono.setText("");
		txtBuscar.setText("");
		txtNombre.setText("");
	}
	
}

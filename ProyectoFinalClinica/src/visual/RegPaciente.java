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
import javax.swing.JTextArea;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import com.toedter.calendar.JDateChooser;

import logico.Clinica;
import logico.Paciente;
import logico.Vacuna;

public class RegPaciente extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtCodePaciente;
	private JTextField txtNombre;
	private JTextField txtCedula;
	private JTextField txtTelefono;
	private Paciente paciente = null;
	private JDateChooser dateChooserNacim;
	private JRadioButton rdbtnMasculino;
	private JRadioButton rdbtnFemenino;
	private JTextArea txtareaDireccion;
	private char sexoPaciente;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegPaciente dialog = new RegPaciente(null);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegPaciente(Paciente pacienteAModificar) {
		setResizable(false);
		setTitle("Registrar Paciente");
		setBounds(100, 100, 554, 331);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(218, 221, 216));
		contentPanel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panelContenedor1 = new JPanel();
			panelContenedor1.setOpaque(false);
			panelContenedor1.setBackground(new Color(218, 221, 216));
			panelContenedor1.setBounds(0, 11, 538, 116);
			contentPanel.add(panelContenedor1);
			panelContenedor1.setLayout(null);
			
			JLabel lblCodePaciente = new JLabel("C\u00F3digo:");
			lblCodePaciente.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
			lblCodePaciente.setOpaque(true);
			lblCodePaciente.setHorizontalAlignment(SwingConstants.CENTER);
			lblCodePaciente.setForeground(new Color(0, 0, 0));
			lblCodePaciente.setBackground(new Color(255, 255, 255));
			lblCodePaciente.setBounds(23, 19, 72, 22);
			panelContenedor1.add(lblCodePaciente);
			{
				JLabel lblNombre = new JLabel("Nombre:");
				lblNombre.setOpaque(true);
				lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
				lblNombre.setForeground(Color.BLACK);
				lblNombre.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
				lblNombre.setBackground(Color.WHITE);
				lblNombre.setBounds(23, 54, 72, 22);
				panelContenedor1.add(lblNombre);
			}
			
			txtCodePaciente = new JTextField();
			txtCodePaciente.setEditable(false);
			txtCodePaciente.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
			txtCodePaciente.setBounds(105, 19, 62, 22);
			panelContenedor1.add(txtCodePaciente);
			txtCodePaciente.setColumns(10);
			txtCodePaciente.setText("P-"+Clinica.getInstance().getGeneradorCodePaciente());
			
			txtNombre = new JTextField();
			txtNombre.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
			txtNombre.setColumns(10);
			txtNombre.setBounds(105, 54, 140, 22);
			panelContenedor1.add(txtNombre);
			
			JLabel lblCédula = new JLabel("C\u00E9dula:");
			lblCédula.setOpaque(true);
			lblCédula.setHorizontalAlignment(SwingConstants.CENTER);
			lblCédula.setForeground(Color.BLACK);
			lblCédula.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
			lblCédula.setBackground(Color.WHITE);
			lblCédula.setBounds(291, 19, 72, 22);
			panelContenedor1.add(lblCédula);
			
			txtCedula = new JTextField();
			txtCedula.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
			txtCedula.setColumns(10);
			txtCedula.setBounds(373, 19, 140, 22);
			panelContenedor1.add(txtCedula);
			
			JLabel lblFechaNacim = new JLabel("F. de nac:");
			lblFechaNacim.setOpaque(true);
			lblFechaNacim.setHorizontalAlignment(SwingConstants.CENTER);
			lblFechaNacim.setForeground(Color.BLACK);
			lblFechaNacim.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
			lblFechaNacim.setBackground(Color.WHITE);
			lblFechaNacim.setBounds(291, 54, 72, 22);
			panelContenedor1.add(lblFechaNacim);
			
			dateChooserNacim = new JDateChooser();
			dateChooserNacim.setBounds(373, 54, 140, 22);
			panelContenedor1.add(dateChooserNacim);
			
			JLabel lblSexo = new JLabel("Sexo:");
			lblSexo.setBounds(23, 87, 72, 22);
			panelContenedor1.add(lblSexo);
			lblSexo.setOpaque(true);
			lblSexo.setHorizontalAlignment(SwingConstants.CENTER);
			lblSexo.setForeground(Color.BLACK);
			lblSexo.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
			lblSexo.setBackground(Color.WHITE);
			
			rdbtnMasculino = new JRadioButton("M");
			rdbtnMasculino.setBounds(129, 87, 38, 22);
			panelContenedor1.add(rdbtnMasculino);
			rdbtnMasculino.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
			
			rdbtnFemenino = new JRadioButton("F");
			rdbtnFemenino.setBounds(184, 87, 33, 22);
			panelContenedor1.add(rdbtnFemenino);
			rdbtnFemenino.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
			
			JLabel lblTelefono = new JLabel("Telefono:");
			lblTelefono.setBounds(292, 87, 72, 22);
			panelContenedor1.add(lblTelefono);
			lblTelefono.setOpaque(true);
			lblTelefono.setHorizontalAlignment(SwingConstants.CENTER);
			lblTelefono.setForeground(Color.BLACK);
			lblTelefono.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
			lblTelefono.setBackground(Color.WHITE);
			
			txtTelefono = new JTextField();
			txtTelefono.setBounds(374, 87, 140, 22);
			panelContenedor1.add(txtTelefono);
			txtTelefono.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
			txtTelefono.setColumns(10);
		}
		
		JPanel panelVerde = new JPanel();
		panelVerde.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelVerde.setBackground(new Color(107, 170, 117, 60));
		panelVerde.setBounds(0, 21, 538, 114);
		contentPanel.add(panelVerde);
		
		JPanel panelGris = new JPanel();
		panelGris.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelGris.setBackground(new Color(105, 116, 124, 120));
		panelGris.setBounds(0, 145, 538, 77);
		contentPanel.add(panelGris);
		panelGris.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("(Opcional)");
		lblNewLabel.setBounds(106, 43, 58, 14);
		panelGris.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Gill Sans MT", Font.PLAIN, 13));
		
		txtareaDireccion = new JTextArea();
		txtareaDireccion.setBounds(181, 11, 257, 54);
		panelGris.add(txtareaDireccion);
		txtareaDireccion.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
		txtareaDireccion.setLineWrap(true);
		txtareaDireccion.setWrapStyleWord(true);
		
		JLabel lblDireccion = new JLabel("Direcci\u00F3n:");
		lblDireccion.setBounds(97, 18, 74, 22);
		panelGris.add(lblDireccion);
		lblDireccion.setOpaque(true);
		lblDireccion.setHorizontalAlignment(SwingConstants.CENTER);
		lblDireccion.setForeground(Color.BLACK);
		lblDireccion.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
		lblDireccion.setBackground(Color.WHITE);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnSiguiente = new JButton("Siguiente");
				btnSiguiente.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						if (paciente == null) {
							
							if (rdbtnMasculino.isSelected()) {
								
								sexoPaciente = 'M';
							}
							else {
								
								sexoPaciente = 'F';
							}
							
							Paciente nuevoPaciente = new Paciente(txtCedula.getText(), txtNombre.getText(), dateChooserNacim.getDate(),
									 sexoPaciente, txtTelefono.getText(), txtareaDireccion.getText(), txtCodePaciente.getText());
							
							ElegirVacunaPaciente elegirVacunas = new ElegirVacunaPaciente(null);
							elegirVacunas.setModal(true);
							elegirVacunas.setVisible(true);
							nuevoPaciente.getMisVacunas().addAll(elegirVacunas.extraerVacunasElegidas());
							Clinica.getInstance().insertarPaciente(nuevoPaciente);
							clean();
						}
						else {
					
							if (rdbtnMasculino.isSelected()) {
								
								sexoPaciente = 'M';
							}
							else {
								
								sexoPaciente = 'F';
							}
							
							paciente.setTelefono(txtTelefono.getText());
							paciente.setDireccion(txtareaDireccion.getText());
							
							ElegirVacunaPaciente elegirVacunas = new ElegirVacunaPaciente(paciente);
							elegirVacunas.setModal(true);
							elegirVacunas.setVisible(true);
							paciente.getMisVacunas().clear();
							paciente.getMisVacunas().addAll(elegirVacunas.extraerVacunasElegidas());
							
							//Clinica.getInstance().actualizarPaciente(paciente);
							dispose();
						}
						
					}
				});
				btnSiguiente.setFont(new Font("Gill Sans MT", Font.PLAIN, 14));
				btnSiguiente.setActionCommand("OK");
				buttonPane.add(btnSiguiente);
				getRootPane().setDefaultButton(btnSiguiente);
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
		
		loadPaciente();
		
	}
	
	private void loadPaciente() {
		
		if (paciente != null) {
			
			txtCodePaciente.setText(paciente.getCodePaciente());
			txtNombre.setText(paciente.getNombre());
			if (paciente.getSexo() == 'M') {
				
				rdbtnMasculino.setSelected(true);
			}
			else {
				
				rdbtnFemenino.setSelected(true);
			}
			txtCedula.setText(paciente.getCedula());
			dateChooserNacim.setDate(paciente.getFechaDeNacimiento());
			txtTelefono.setText(paciente.getTelefono());
			
		}
		
	}
	
	private void clean() {
		
		txtCodePaciente.setText("P-"+Clinica.getInstance().getGeneradorCodePaciente());
		txtNombre.setText("");
		rdbtnMasculino.setSelected(false);
		rdbtnFemenino.setSelected(false);
		txtCedula.setText("");
		dateChooserNacim.setCalendar(null);
		txtTelefono.setText("");
		txtareaDireccion.setText("");
	}
	
}

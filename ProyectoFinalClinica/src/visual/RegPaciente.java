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
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import com.toedter.calendar.JDateChooser;

public class RegPaciente extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtCodePaciente;
	private JTextField txtSector;
	private JTextField txtCédula;
	private JTextField txtTelefono;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegPaciente dialog = new RegPaciente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegPaciente() {
		setTitle("Registrar paciente");
		setBounds(100, 100, 554, 345);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(218, 221, 216));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panelContenedor1 = new JPanel();
			panelContenedor1.setOpaque(false);
			panelContenedor1.setBackground(new Color(218, 221, 216));
			panelContenedor1.setBounds(0, 11, 538, 93);
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
			txtCodePaciente.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
			txtCodePaciente.setBounds(105, 19, 72, 22);
			panelContenedor1.add(txtCodePaciente);
			txtCodePaciente.setColumns(10);
			
			txtSector = new JTextField();
			txtSector.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
			txtSector.setColumns(10);
			txtSector.setBounds(105, 54, 140, 22);
			panelContenedor1.add(txtSector);
			
			JLabel lblCédula = new JLabel("C\u00E9dula:");
			lblCédula.setOpaque(true);
			lblCédula.setHorizontalAlignment(SwingConstants.CENTER);
			lblCédula.setForeground(Color.BLACK);
			lblCédula.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
			lblCédula.setBackground(Color.WHITE);
			lblCédula.setBounds(291, 19, 72, 22);
			panelContenedor1.add(lblCédula);
			
			txtCédula = new JTextField();
			txtCédula.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
			txtCédula.setColumns(10);
			txtCédula.setBounds(373, 19, 140, 22);
			panelContenedor1.add(txtCédula);
			
			JLabel lblFechaNacim = new JLabel("F. de nac:");
			lblFechaNacim.setOpaque(true);
			lblFechaNacim.setHorizontalAlignment(SwingConstants.CENTER);
			lblFechaNacim.setForeground(Color.BLACK);
			lblFechaNacim.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
			lblFechaNacim.setBackground(Color.WHITE);
			lblFechaNacim.setBounds(291, 54, 72, 22);
			panelContenedor1.add(lblFechaNacim);
			
			JDateChooser dateChooserNacim = new JDateChooser();
			dateChooserNacim.setBounds(373, 54, 140, 22);
			panelContenedor1.add(dateChooserNacim);
		}
		
		JPanel panelVerde = new JPanel();
		panelVerde.setBackground(new Color(107, 170, 117, 60));
		panelVerde.setBounds(0, 21, 538, 50);
		contentPanel.add(panelVerde);
		
		JPanel panelGris = new JPanel();
		panelGris.setBackground(new Color(105, 116, 124, 120));
		panelGris.setBounds(0, 81, 538, 50);
		contentPanel.add(panelGris);
		panelGris.setLayout(null);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(23, 17, 72, 22);
		panelGris.add(lblSexo);
		lblSexo.setOpaque(true);
		lblSexo.setHorizontalAlignment(SwingConstants.CENTER);
		lblSexo.setForeground(Color.BLACK);
		lblSexo.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
		lblSexo.setBackground(Color.WHITE);
		
		JRadioButton rdbtnMasculino = new JRadioButton("M");
		rdbtnMasculino.setBounds(129, 17, 38, 22);
		panelGris.add(rdbtnMasculino);
		rdbtnMasculino.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
		
		JRadioButton rdbtnFemenino = new JRadioButton("F");
		rdbtnFemenino.setBounds(184, 17, 33, 22);
		panelGris.add(rdbtnFemenino);
		rdbtnFemenino.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(292, 17, 72, 22);
		panelGris.add(lblTelefono);
		lblTelefono.setOpaque(true);
		lblTelefono.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelefono.setForeground(Color.BLACK);
		lblTelefono.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
		lblTelefono.setBackground(Color.WHITE);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(374, 17, 140, 22);
		panelGris.add(txtTelefono);
		txtTelefono.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
		txtTelefono.setColumns(10);
		
		JTextArea txtareaDireccion = new JTextArea();
		txtareaDireccion.setBounds(107, 142, 257, 54);
		contentPanel.add(txtareaDireccion);
		txtareaDireccion.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
		txtareaDireccion.setLineWrap(true);
		txtareaDireccion.setWrapStyleWord(true);
		
		JLabel lblDireccion = new JLabel("Direcci\u00F3n:");
		lblDireccion.setBounds(23, 142, 74, 22);
		contentPanel.add(lblDireccion);
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
				JButton btnRegistrar = new JButton("Registrar");
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
}

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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class MostrarVacuna extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			MostrarVacuna dialog = new MostrarVacuna();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public MostrarVacuna() {
		setResizable(false);
		setTitle("Mostrar Vacunas");
		setBounds(100, 100, 857, 443);
		getContentPane().setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		Color backgroundColor = new Color(0xDADDD8);
		Color rayita1 = new Color(0x6BAA75);
		Color rayita2 = new Color(0x69747C);
		int alpha = 60;
		int alpha2 = 120;
		rayita1 = new Color(rayita1.getRed(), rayita1.getGreen(), rayita1.getBlue(), alpha);
		rayita2 = new Color(rayita2.getRed(), rayita2.getGreen(), rayita2.getBlue(), alpha2);
		
		Object[] header = {"Código", "Nombre", "Laboratorio", "Enfermedades Que Trata"};
		
		DefaultTableModel model = new DefaultTableModel() {
			
			public Class getColumnClass(int column) {
				
				if (column == 5) {
					return Boolean.class;
				}
				else {
					return String.class;
				}
			}
			
			public boolean isCellEditable(int row, int column) {       
			       return false;
			}
		};
		model.setColumnIdentifiers(header);
		contentPanel.setBackground(backgroundColor);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel_2 = new JPanel();
			panel_2.setBackground(new Color(255, 255, 255));
			panel_2.setBounds(53, 81, 744, 248);
			contentPanel.add(panel_2);
			panel_2.setLayout(new BorderLayout(0, 0));
			
			JScrollPane scrollPane = new JScrollPane(table);
			panel_2.add(scrollPane, BorderLayout.CENTER);
			
			table = new JTable(model);
			table.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
			table.setFillsViewportHeight(true);
			scrollPane.setViewportView(table);
		}
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(rayita2);
		panel_1.setBounds(0, 128, 851, 91);
		contentPanel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(rayita1);
		panel.setBounds(0, 13, 851, 91);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblBuscarVacuna = new JLabel("Buscar:");
		lblBuscarVacuna.setHorizontalAlignment(SwingConstants.CENTER);
		lblBuscarVacuna.setOpaque(true);
		lblBuscarVacuna.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
		lblBuscarVacuna.setBounds(53, 36, 55, 22);
		panel.add(lblBuscarVacuna);
		
		textField = new JTextField();
		textField.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
		textField.setBounds(118, 36, 273, 22);
		panel.add(textField);
		textField.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				{
					JButton okButton = new JButton("Modificar");
					buttonPane.add(okButton);
					okButton.setActionCommand("OK");
					getRootPane().setDefaultButton(okButton);
				}
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}

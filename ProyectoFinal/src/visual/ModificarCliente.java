package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Canvas;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Label;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import logical.Clientes;
import logical.Empresa;

import javax.swing.border.EtchedBorder;
import javax.swing.JSpinner;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerNumberModel;

public class ModificarCliente extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField txt_nombre;
	private JTextField txt_direccion;
	private JTextField txt_telefono;
	private JTextField txt_cedula;
	private JSpinner sp_limiteCre;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		try {
			NuevoEmpleado dialog = new NuevoEmpleado();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
*/
	/**
	 * Create the dialog.
	 */
	public ModificarCliente(Clientes c, int index) {
		setResizable(false);
		setBounds(100, 100, 640, 530);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(SystemColor.window);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(51, 153, 204));
			panel.setBounds(0, 0, 640, 171);
			contentPanel.add(panel);
			panel.setLayout(null);
			
			JPanel panel_1 = new JPanel();
			panel_1.setBorder(new EmptyBorder(0, 0, 0, 0));
			panel_1.setBounds(244, 10, 151, 151);
			panel.add(panel_1);
			panel_1.setLayout(null);
			{
				JLabel lblNewLabel = new JLabel("");
				lblNewLabel.setBounds(27, 0, 96, 151);
				panel_1.add(lblNewLabel);
				Image img = new ImageIcon(this.getClass().getResource("/usuario-96.png")).getImage();
				lblNewLabel.setIcon(new ImageIcon(img));
			}
			
			JLabel lblEmpleado = new JLabel("Modificar Cliente");
			lblEmpleado.setForeground(new Color(255, 255, 255));
			lblEmpleado.setFont(new Font("Lucida Grande", Font.BOLD, 16));
			lblEmpleado.setBounds(29, 53, 187, 16);
			panel.add(lblEmpleado);
			{
				JLabel lblCdigo = new JLabel("Código:");
				lblCdigo.setForeground(Color.WHITE);
				lblCdigo.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
				lblCdigo.setBounds(29, 81, 67, 16);
				panel.add(lblCdigo);
			}
			
			textField = new JTextField();
			textField.setEnabled(false);
			
				textField.setText((Empresa.getinstance().BuscarClienteCodigo(index)));
				
			textField.setEditable(false);
			textField.setBounds(90, 76, 106, 26);
			panel.add(textField);
			textField.setColumns(10);
		}
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(255, 255, 255));
			panel.setBounds(0, 171, 640, 27);
			contentPanel.add(panel);
			{
				JLabel lblInformacinGeneral = new JLabel("Información General");
				lblInformacinGeneral.setFont(new Font("Lucida Grande", Font.BOLD, 13));
				panel.add(lblInformacinGeneral);
			}
		}
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblNombre.setBounds(33, 215, 61, 16);
		contentPanel.add(lblNombre);
		
		JLabel lblCdula = new JLabel("Telefono:");
		lblCdula.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblCdula.setBounds(337, 264, 72, 16);
		contentPanel.add(lblCdula);
		

		


		txt_nombre = new JTextField();
		txt_nombre.setColumns(10);
		txt_nombre.setBounds(106, 210, 303, 26);
		contentPanel.add(txt_nombre);

		JLabel lblDireccin = new JLabel("Dirección:");
		lblDireccin.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblDireccin.setBounds(33, 265, 79, 16);
		contentPanel.add(lblDireccin);

		txt_direccion = new JTextField();
		txt_direccion.setColumns(10);
		txt_direccion.setBounds(106, 260, 158, 26);
		contentPanel.add(txt_direccion);



		txt_telefono = new JTextField();
		txt_telefono.setColumns(10);
		txt_telefono.setBounds(434, 259, 158, 26);
		contentPanel.add(txt_telefono);

		
		JLabel lblCdula_1 = new JLabel("Cédula:");
		lblCdula_1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblCdula_1.setBounds(33, 319, 79, 16);
		contentPanel.add(lblCdula_1);
		
		

		txt_cedula = new JTextField();
		txt_cedula.setEditable(false);
		txt_cedula.setColumns(10);
		txt_cedula.setBounds(106, 314, 158, 26);
		contentPanel.add(txt_cedula);

		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Cr\u00E9dito", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(292, 292, 300, 145);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Limite de Credito:");
		lblNewLabel_1.setBounds(16, 64, 112, 16);
		panel.add(lblNewLabel_1);
		
		cargardatos(c);
		
		 sp_limiteCre = new JSpinner();
		sp_limiteCre.setModel(new SpinnerNumberModel(new Float(0), null, null, new Float(1)));
		sp_limiteCre.setBounds(140, 59, 138, 26);
		panel.add(sp_limiteCre);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(SystemColor.window);
			buttonPane.setBounds(0, 437, 640, 65);
			contentPanel.add(buttonPane);
			buttonPane.setLayout(null);
			{
				JButton okButton = new JButton("Guardar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						if ((txt_cedula.getText() != null &&  txt_cedula.getText().isEmpty() == false) && (txt_nombre.getText() != null && 
								txt_nombre.getText().isEmpty() == false) && (txt_direccion.getText() != null && txt_direccion.getText().isEmpty()
								== false) && (txt_telefono.getText() != null && txt_telefono.getText().isEmpty() == false) ) {
							String nombre = txt_nombre.getText();
							String cedula = txt_cedula.getText();
							String direccion = txt_direccion.getText();
							String telefono = txt_telefono.getText();
							float limiteCredito = (float) sp_limiteCre.getValue();
							String code = Empresa.getinstance().BuscarClienteCodigo(index);
							Clientes c = new Clientes(nombre, cedula, telefono, direccion, code, limiteCredito);
							Empresa.getinstance().ModificarCliente(c, index);;
							JOptionPane.showMessageDialog(null, "Usted a agregado un cliente",code, JOptionPane.INFORMATION_MESSAGE);
						//	ListaDeClientes.
							ListaDeClientes.CargarTabla();
							dispose();
							}else{
								JOptionPane.showMessageDialog(null, "Debe de llenar todos los campos");
							}
					}
				});
				okButton.setFont(new Font("Lucida Grande", Font.BOLD, 13));
				okButton.setBounds(118, 4, 124, 58);
				Image img0 = new ImageIcon(this.getClass().getResource("/guardar-48.png")).getImage();
				okButton.setIcon(new ImageIcon(img0));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Salir");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setFont(new Font("Lucida Grande", Font.BOLD, 13));
				cancelButton.setBounds(378, 4, 118, 58);
				Image img1 = new ImageIcon(this.getClass().getResource("/salir-48.png")).getImage();
				cancelButton.setIcon(new ImageIcon(img1));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	private void cargardatos(Clientes c) {
		txt_nombre.setText(c.getNombre());
		txt_cedula.setText(c.getCedula());
		txt_direccion.setText(c.getDireccion());
		txt_telefono.setText(c.getTelefono());
		//sp_limiteCre.setValue((Float)c.getLimiteCredito());
	}
}

package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.border.SoftBevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import logical.Empresa;
import logical.Factura;
import logical.HardDrive;
import logical.Motherboard;
import logical.Procesador;
import logical.Productos;
import logical.Ram;
import logical.kits;

import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.CompoundBorder;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class CrearKit extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JButton button_2;
	private JComboBox cbxTipo =  new JComboBox();
	private JTable tbt_productos;
	private static DefaultTableModel tablemodel = new DefaultTableModel();
	private static DefaultTableModel tablemodel1 = new DefaultTableModel();
	private ArrayList<String> columnNames = new ArrayList<String>();
	private static Object[] fila;
	private JTable tbt_kits;
	private ArrayList<Productos>productos = new ArrayList<Productos>();
	private String[] columnNames1 = {"Tipo de Producto", "Marca", "Modelo", "Precio venta", "Cantidad"};
	private int a=0,b=0,c=0,d=0;
	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public CrearKit() {
		setResizable(false);
		setBounds(100, 100, 640, 530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(102, 51, 153));
		panel.setBounds(0, 0, 640, 171);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_1.setBounds(24, 10, 151, 151);
		panel.add(panel_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("/Users/joemorel/Downloads/icons8-estacioÌ�n-de-trabajo-96.png"));
		label.setBounds(26, 29, 104, 96);
		panel_1.add(label);
		
		JLabel lblCrearOfertas = new JLabel("Crear Ofertas ");
		lblCrearOfertas.setForeground(Color.WHITE);
		lblCrearOfertas.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		lblCrearOfertas.setBounds(187, 26, 151, 16);
		panel.add(lblCrearOfertas);
		
		JLabel lblNewLabel = new JLabel("Nombre de la Oferta:");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(187, 54, 151, 16);
		panel.add(lblNewLabel);
		
		JLabel lblCdigo = new JLabel("CÃ³digo:");
		lblCdigo.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblCdigo.setForeground(Color.WHITE);
		lblCdigo.setBounds(187, 120, 57, 29);
		panel.add(lblCdigo);
		
		textField = new JTextField();
		textField.setBounds(187, 82, 151, 26);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(253, 122, 85, 26);
		panel.add(textField_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new CompoundBorder());
		panel_3.setBackground(new Color(211, 211, 211));
		panel_3.setBounds(378, 49, 224, 73);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblTotal = new JLabel("Total:");
		lblTotal.setForeground(new Color(220, 20, 60));
		lblTotal.setFont(new Font("Lucida Grande", Font.BOLD, 24));
		lblTotal.setBounds(16, 19, 74, 36);
		panel_3.add(lblTotal);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(153, 102, 255));
		panel_2.setBounds(0, 170, 640, 27);
		contentPane.add(panel_2);
		
		JLabel lblContenido = new JLabel("Lista de componentes");
		lblContenido.setForeground(new Color(255, 255, 255));
		lblContenido.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		panel_2.add(lblContenido);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 220, 302, 204);
		contentPane.add(scrollPane);
		
		tbt_productos = new JTable();
		scrollPane.setViewportView(tbt_productos);
		//tabla//
		
		cbxTipo.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if ((cbxTipo.getSelectedItem().toString() == "Procesador")) {
					DefaultTableModel model = (DefaultTableModel) tbt_productos.getModel();
					model.setColumnCount(0);
					model.setRowCount(0);
					columnNames.clear();
					
					columnNames.add("Marca");
					columnNames.add("Modelo");
					
					columnNames.add("Precio de Venta");
					columnNames.add("Cantidad");
					columnNames.add("Soket");
					columnNames.add("velocidadBase");
					columnNames.add("velocidadTurbo");
					columnNames.add("Unlock");
					CargarTablaProcesador();
					
				} else if ((cbxTipo.getSelectedItem().toString()) == "RAM" ) {
					DefaultTableModel model = (DefaultTableModel) tbt_productos.getModel();
					model.setColumnCount(0);
					model.setRowCount(0);
					columnNames.clear();
					
					
					columnNames.add("Marca");
					columnNames.add("Modelo");
					
					columnNames.add("Precio de Venta");
					columnNames.add("Cantidad");
					columnNames.add("Cantidad de GB");
					columnNames.add("Tipo");
					columnNames.add("speed");
					CargarTablaRam();
				}else if ((cbxTipo.getSelectedItem().toString()) == "HardDrive") {
					DefaultTableModel model = (DefaultTableModel) tbt_productos.getModel();
					model.setColumnCount(0);
					model.setRowCount(0);
					columnNames.clear();
					
					columnNames.add("Marca");
					columnNames.add("Modelo");
					
					columnNames.add("Precio de Venta");
					columnNames.add("Cantidad");
					columnNames.add("Cantidad de GB");
					columnNames.add("Tipo de conexcion");
					columnNames.add("write Speed");
					columnNames.add("Read Speed");
					CargarTablaHardDrive();
				}else if ((cbxTipo.getSelectedItem().toString()) == "Motherboard") {
					DefaultTableModel model = (DefaultTableModel) tbt_productos.getModel();
					model.setColumnCount(0);
					model.setRowCount(0);
					columnNames.clear();
					
					columnNames.add("Marca");
					columnNames.add("Modelo");
					
					columnNames.add("Precio de Venta");
					columnNames.add("Cantidad");
					columnNames.add("Socket");
					columnNames.add("Tipo RAM");
					columnNames.add("Cantidad Slots RAM");
					columnNames.add("Cantidad IDE");
					columnNames.add("Cantidad Sata");
					CargarTablaMotherboard();
				}
			}
		});
		cbxTipo.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Procesador", "RAM", "HardDrive", "Motherboard"}));
		cbxTipo.setBounds(84, 198, 146, 22);		
		contentPane.add(cbxTipo);
		
		
		
		
		//fin de tabla
		
		JButton btnAgregar = new JButton("Añadir");
		btnAgregar.addActionListener(new ActionListener() {
			@SuppressWarnings("unused")
			public void actionPerformed(ActionEvent e) {
				//Pro
				//tbt_productos.getSelectedRow();
				String modelo = (String)tbt_productos.getValueAt(tbt_productos.getSelectedRow(), tbt_productos.getSelectedColumn());
				Productos p2 = Empresa.getinstance().BuscarProductoModelo(modelo);
				
				int cant = p2.getCant();

				if (p2.getModelo() == modelo) {
					if (p2 instanceof Procesador ) {
						if(a==0) {
							Procesador p = new Procesador((((Procesador)p2).getPrecio()), (((Procesador)p2).getPrecioVenta()), (((Procesador)p2).getCant()), (((Procesador)p2).getCodigo()), (((Procesador)p2).getMarca()), (((Procesador)p2).getModelo()), (((Procesador)p2).getTipoProducto()), (((Procesador)p2).getSocket()), (((Procesador)p2).getVelocidadBase()), (((Procesador)p2).getVelocidadTurbo()), (((Procesador)p2).isUnlock()));
							p.setCant(1);
							Empresa.getinstance().EditProductos(modelo, cant-1);
							System.out.println(cant);
							productos.add(p);
							CargarTablaProcesador();
							a=1;
						}else {
							JOptionPane.showMessageDialog(null, "Para cambiar el procesador debe eliminar el presente.");
						}
					}else if(p2 instanceof Motherboard) {
						if(b==0) {
							Motherboard m = new Motherboard(p2.getPrecio(), p2.getPrecio(), p2.getCant(), p2.getCodigo(), p2.getMarca(), p2.getModelo(), p2.getTipoProducto(), ((Motherboard) p2).getMarcaProcesadores(), ((Motherboard) p2).getSocketProcesador(), ((Motherboard) p2).getTipoRam(), ((Motherboard) p2).getCantIDE(), ((Motherboard) p2).getCantM2(), ((Motherboard) p2).getCantSata(), ((Motherboard) p2).getCantSlotsRam(), ((Motherboard) p2).isMultiCHSUP());
							m.setCant(1);
							Empresa.getinstance().EditProductos(modelo, cant-1);
							productos.add(m);
							CargarTablaMotherboard();
							b=1;
						}else {
							JOptionPane.showMessageDialog(null, "Para cambiar el Motherboard debe eliminar el presente.");
						}
								
					}else if(p2 instanceof HardDrive ) {
						if( c==0) {
							HardDrive h = new HardDrive(p2.getPrecio(), p2.getPrecioVenta(), p2.getCant(), p2.getCodigo(), p2.getMarca(), p2.getModelo(), p2.getTipoProducto(), ((HardDrive) p2).getCantGB(), ((HardDrive) p2).getTipoConexion(), ((HardDrive) p2).getWrSpeed(), ((HardDrive) p2).getRdSpeed());
							h.setCant(1);
							Empresa.getinstance().EditProductos(modelo, cant-1);
							productos.add(h);
							CargarTablaHardDrive();
							c=1;
						}else {
							JOptionPane.showMessageDialog(null, "Para cambiar el HardDrive debe eliminar el presente.");
						}
					}else if(p2 instanceof Ram) {
						if(d==0) {
							Ram r = new Ram(p2.getPrecio(), p2.getPrecioVenta(), p2.getCant(), p2.getCodigo(), p2.getMarca(), p2.getModelo(), p2.getTipoProducto(), ((Ram) p2).getCantGB(), ((Ram) p2).getTipoDDR(), ((Ram) p2).getSpeed(), ((Ram) p2).isMultiCHSUP());
							String[] options = {"1", "2", "3", "4"};
							int seleccion = JOptionPane.showOptionDialog(null, "Es necesario que seleccione una opcion", null, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
							Empresa.getinstance().EditProductos(modelo, (p2.getCant()-(seleccion+1)));
							System.out.println(seleccion+1);
							r.setCant(seleccion+1);
							productos.add(r);
							CargarTablaRam();
							d=1;
						}else {
							JOptionPane.showMessageDialog(null, "Para cambiar la cantidad Ram, o el modelo debe eliminar el presente.");
						}
					}
					
					cargarKits();
				}else if(p2.getModelo() != modelo) {
					JOptionPane.showMessageDialog(null, "Debe de llenar todos los campos de la memoria RAM.");
				}
			}
		});
		Image img1 = new ImageIcon(this.getClass().getResource("/Anadir-48.png")).getImage();
		btnAgregar.setIcon(new ImageIcon(img1));
		btnAgregar.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnAgregar.setActionCommand("OK");
		btnAgregar.setBounds(191, 436, 131, 58);
		contentPane.add(btnAgregar);
		
		JButton button_1 = new JButton("Eliminar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Empresa.getinstance().EditProductos(productos.get(tbt_kits.getSelectedRow()).getModelo(), 
						Empresa.getinstance().BuscarProductoModelo(productos.get(tbt_kits.getSelectedRow()).getModelo()).getCant()+productos.get(tbt_kits.getSelectedRow()).getCant());
				
				if(productos.get(tbt_kits.getSelectedRow()) instanceof HardDrive) {
					productos.remove((tbt_kits.getSelectedRow()));
					cargarKits();
					CargarTablaHardDrive();
				}else if(productos.get(tbt_kits.getSelectedRow()) instanceof Motherboard){
					productos.remove((tbt_kits.getSelectedRow()));
					cargarKits();
					CargarTablaMotherboard();
				}else if(productos.get(tbt_kits.getSelectedRow()) instanceof Procesador) {
					productos.remove((tbt_kits.getSelectedRow()));
					cargarKits();
					CargarTablaProcesador();
				}else if(productos.get(tbt_kits.getSelectedRow()) instanceof Ram) {
					productos.remove((tbt_kits.getSelectedRow()));
					cargarKits();
					CargarTablaRam();
				}
				a=0;
				b=0;
				c=0;
				d=0;
				
				
			}
		});
		Image img2 = new ImageIcon(this.getClass().getResource("/eliminar-64.png")).getImage();
		button_1.setIcon(new ImageIcon(img2));
		button_1.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		button_1.setActionCommand("Cancel");
		button_1.setBounds(344, 436, 118, 58);
		contentPane.add(button_1);
		
		button_2 = new JButton("Salir");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((a==1) || (b==1) || (c==0) || (d==0)) {
					for (Productos p : productos) {
						Empresa.getinstance().EditProductos(p.getModelo(), Empresa.getinstance().BuscarProductoModelo(p.getModelo()).getCant()+p.getCant());
					}
				}
				
				dispose();
				
			}
		});
		Image img3 = new ImageIcon(this.getClass().getResource("/salir-48.png")).getImage();
		button_2.setIcon(new ImageIcon(img3));
		button_2.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		button_2.setActionCommand("Cancel");
		button_2.setBounds(484, 436, 118, 58);
		contentPane.add(button_2);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				a=0;
				b=0;
				c=0;
				d=0;
				float PrecioVenta=0, PrecioTK=0, preciocosto=0;
					if(textField.getText() != null && textField.getText().isEmpty() == false) {
						for ( Productos p : productos) {
							PrecioTK += (p.getPrecioVenta() * p.getCant());
							preciocosto += p.getPrecio();
						}
					PrecioVenta = (float) (PrecioTK*.9);
					String modelo = textField.getText();
					kits k = new kits(preciocosto, PrecioVenta, 1, "", "Computer Store", modelo, "Kit", productos, "", PrecioTK);
					Empresa.getinstance().AddProducto(k);
					JOptionPane.showMessageDialog(null, "Ha registrado un kit");
					dispose();
					}else {
						JOptionPane.showMessageDialog(null, "Debe ponerle un nombre al Kit.");
					}
				tablemodel1.setRowCount(0);
				cargarKits();

			}
		});
		Image img4 = new ImageIcon(this.getClass().getResource("/modificar1-48.png")).getImage();
		btnGuardar.setIcon(new ImageIcon(img4));
		btnGuardar.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnGuardar.setActionCommand("OK");
		btnGuardar.setBounds(38, 436, 131, 58);
		contentPane.add(btnGuardar);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(326, 220, 302, 204);
		contentPane.add(scrollPane_1);
		
		tbt_kits = new JTable();
		scrollPane_1.setViewportView(tbt_kits);
	}
	
	public void CargarTablaProcesador() {
		tablemodel.setRowCount(0);
		tablemodel.setColumnIdentifiers(columnNames.toArray());
		fila = new Object[tablemodel.getColumnCount()];
		for (Productos p : Empresa.getinstance().GetProducto()) {
			if(p instanceof Procesador) {
				fila[0] = p.getMarca();
				fila[1] = p.getModelo();
				
				fila[2] = p.getPrecioVenta();
				fila[3] = p.getCant();
				fila[4] = ((Procesador) p).getSocket();
				fila[5] = ((Procesador) p).getVelocidadBase();
				fila[6] = ((Procesador) p).getVelocidadTurbo();
				if (((Procesador) p).isUnlock() == false) {
					fila[7] = "No";
				}else if(((Procesador) p).isUnlock() == true) {
					fila[7] = "Si";	
				}
				tablemodel.addRow(fila);

			}
		}
	
		// tbt_productos = new JTable();
		tbt_productos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tbt_productos.setModel(tablemodel);
		tbt_productos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		TableColumnModel columnModel = tbt_productos.getColumnModel();
		/*columnModel.getColumn(0).setPreferredWidth(50);
		columnModel.getColumn(1).setPreferredWidth(171);
		columnModel.getColumn(2).setPreferredWidth(110);
		columnModel.getColumn(3).setPreferredWidth(110);
		columnModel.getColumn(4).setPreferredWidth(150);
		columnModel.getColumn(5).setPreferredWidth(60);
		columnModel.getColumn(6).setPreferredWidth(171);
		columnModel.getColumn(7).setPreferredWidth(110);
		columnModel.getColumn(8).setPreferredWidth(110);
		columnModel.getColumn(9).setPreferredWidth(150);
		columnModel.getColumn(10).setPreferredWidth(60);*/
	}
	
	public void CargarTablaRam() {
		tablemodel.setRowCount(0);
		tablemodel.setColumnIdentifiers(columnNames.toArray());
		fila = new Object[tablemodel.getColumnCount()];
		for (Productos p : Empresa.getinstance().GetProducto()) {
			if(p instanceof Ram) {
				
				fila[0] = p.getMarca();
				fila[1] = p.getModelo();
				fila[2] = p.getPrecioVenta();
				fila[3] = p.getCant();
				fila[4] = ((Ram) p).getCantGB();
				fila[5] = ((Ram) p).getTipoDDR();
				fila[6] = ((Ram) p).getSpeed();
				tablemodel.addRow(fila);
			}

				// tablemodel.addRow(fila);
		}
	
		// tbt_productos = new JTable();
		tbt_productos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tbt_productos.setModel(tablemodel);
		tbt_productos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		TableColumnModel columnModel = tbt_productos.getColumnModel();
	}
	
	
	public void CargarTablaHardDrive() {
		tablemodel.setRowCount(0);
		tablemodel.setColumnIdentifiers(columnNames.toArray());
		fila = new Object[tablemodel.getColumnCount()];
		for (Productos p : Empresa.getinstance().GetProducto()) {
			if(p instanceof HardDrive) {
			
				fila[0] = p.getMarca();
				fila[1] = p.getModelo();
				fila[2] = p.getPrecioVenta();
				fila[3] = p.getCant();
				fila[4] = ((HardDrive) p).getCantGB();
				fila[5] = ((HardDrive) p).getWrSpeed();
				fila[6] = ((HardDrive) p).getRdSpeed();
				tablemodel.addRow(fila);

			}
				// tablemodel.addRow(fila);
		}
	
		// tbt_productos = new JTable();
		tbt_productos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tbt_productos.setModel(tablemodel);
		tbt_productos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		TableColumnModel columnModel = tbt_productos.getColumnModel();
		/*columnModel.getColumn(0).setPreferredWidth(50);
		columnModel.getColumn(1).setPreferredWidth(171);
		columnModel.getColumn(2).setPreferredWidth(110);
		columnModel.getColumn(3).setPreferredWidth(110);
		columnModel.getColumn(4).setPreferredWidth(150);
		columnModel.getColumn(5).setPreferredWidth(60);
		columnModel.getColumn(6).setPreferredWidth(171);
		columnModel.getColumn(7).setPreferredWidth(110);
		columnModel.getColumn(8).setPreferredWidth(110);
		columnModel.getColumn(9).setPreferredWidth(150);
		columnModel.getColumn(10).setPreferredWidth(60);*/	
	}
	
	
	
	public void CargarTablaMotherboard() {
		tablemodel.setRowCount(0);
		tablemodel.setColumnIdentifiers(columnNames.toArray());
		fila = new Object[tablemodel.getColumnCount()];
		for (Productos p : Empresa.getinstance().GetProducto()) {
		if(p instanceof Motherboard) {
				
				fila[0] = p.getMarca();
				fila[1] = p.getModelo();
				fila[2] = p.getPrecioVenta();
				fila[3] = p.getCant();
				fila[4] = ((Motherboard) p).getMarcaProcesadores();
				fila[5] = ((Motherboard) p).getSocketProcesador();
				fila[6] = ((Motherboard) p).getTipoRam();
				fila[7] = ((Motherboard) p).getCantSlotsRam();
				fila[8] = ((Motherboard) p).getCantIDE();
				fila[9] = ((Motherboard) p).getCantSata();
				tablemodel.addRow(fila);

			}
		}
	
		//tbt_productos = new JTable();
		tbt_productos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tbt_productos.setModel(tablemodel);
		tbt_productos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		TableColumnModel columnModel = tbt_productos.getColumnModel();
		columnModel.getColumn(0).setPreferredWidth(50);
		columnModel.getColumn(1).setPreferredWidth(171);
		columnModel.getColumn(2).setPreferredWidth(110);
		columnModel.getColumn(3).setPreferredWidth(110);
		
	}
	
	
	
	
	public void cargarKits() {
		tablemodel1.setRowCount(0);
		tablemodel.setRowCount(0);
		tablemodel1.setColumnIdentifiers(columnNames1);
		fila = new Object[tablemodel1.getColumnCount()];
		for (Productos p : productos) {
			if(p instanceof Procesador) {
				fila[0] = p.getTipoProducto();
				fila[1] = p.getMarca();
				fila[2] = p.getModelo();
				fila[3] = p.getPrecioVenta();
				fila[4] = p.getCant();
				tablemodel1.addRow(fila);
			}
			
			if(p instanceof Motherboard) {
				fila[0] = p.getTipoProducto();
				fila[1] = p.getMarca();
				fila[2] = p.getModelo();
				fila[3] = p.getPrecioVenta();
				fila[4] = p.getCant();
				tablemodel1.addRow(fila);

			}
			if(p instanceof HardDrive) {
				fila[0] = p.getTipoProducto();
				fila[1] = p.getMarca();
				fila[2] = p.getModelo();
				fila[3] = p.getPrecioVenta();
				fila[4] = p.getCant();
				tablemodel1.addRow(fila);

			}
			if(p instanceof Ram) {
				fila[0] = p.getTipoProducto();
				fila[1] = p.getMarca();
				fila[2] = p.getModelo();
				fila[3] = p.getPrecioVenta();
				fila[4] = p.getCant();
				tablemodel1.addRow(fila);
			}
			
		}
		tbt_kits.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tbt_kits.setModel(tablemodel1);
		tbt_kits.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		TableColumnModel columnModel = tbt_kits.getColumnModel();
		}
		public void vaciar() {
			tablemodel1.setColumnIdentifiers(columnNames1);
			fila = new Object[tablemodel1.getColumnCount()];
			tbt_kits.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			tbt_kits.setModel(tablemodel1);
			tbt_kits.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			TableColumnModel columnModel = tbt_kits.getColumnModel();
		}
	
	}
	
	
	

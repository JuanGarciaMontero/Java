package intefaz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

import javax.swing.table.DefaultTableModel;

import datos.Conexion;
import negocio.Agenda;

import javax.swing.border.BevelBorder;


public class Frm_principal {

	private JFrame frmAgenda;
	private JTextField text_nombre;
	private JTextField text_telefono;
	private JTextField text_ciudad;
	private JTable tabla;
	protected Container panel;
	
	private javax.swing.JTextField txt_nombre;
	private javax.swing.JTextField txt_telefono;
	private javax.swing.JTextField txt_ciudad;
	protected JLabel jtxt_buscar;
	private JScrollPane desplazamiento;
	protected Object telefono;
	private JTable tabla2;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frm_principal window = new Frm_principal();
					window.frmAgenda.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frm_principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAgenda = new JFrame();
		frmAgenda.setTitle("AGENDA");
		frmAgenda.setBounds(100, 100, 715, 416);
		frmAgenda.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAgenda.getContentPane().setLayout(null);
		  desplazamiento = null;
		  desplazamiento = new JScrollPane(tabla);
		
		text_nombre = new JTextField();
		text_nombre.setBounds(554, 55, 140, 20);
		frmAgenda.getContentPane().add(text_nombre);
		text_nombre.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre: ");
		lblNewLabel_1.setBounds(498, 58, 72, 14);
		frmAgenda.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Telefono:");
		lblNewLabel_2.setBounds(498, 95, 72, 14);
		frmAgenda.getContentPane().add(lblNewLabel_2);
		
		text_telefono = new JTextField();
		text_telefono.setBounds(554, 89, 86, 20);
		frmAgenda.getContentPane().add(text_telefono);
		text_telefono.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Ciudad:");
		lblNewLabel_3.setBounds(498, 120, 72, 14);
		frmAgenda.getContentPane().add(lblNewLabel_3);
		
		text_ciudad = new JTextField();
		text_ciudad.setBounds(551, 120, 115, 20);
		frmAgenda.getContentPane().add(text_ciudad);
		text_ciudad.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("AGENDA");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4.setBounds(300, 11, 86, 26);
		frmAgenda.getContentPane().add(lblNewLabel_4);
		
		
		
		JButton btn_ingresar = new JButton("Ingresar");
		btn_ingresar.addActionListener(new ActionListener() {

			private String n;
			private String t;
			private String c;
		

			public void actionPerformed(ActionEvent e) {
				try {
					n = text_nombre.getText();
					t = text_telefono.getText();
					c = text_ciudad.getText();
					
					Agenda a = new Agenda(this.n, this.t, this.c);
					a.cargarRutCliete();
					if(Conexion.buscarRutCli) {
						System.out.println("Cliente ya existe");
						a.imprimirCliente();
						}
					else {
						a.guardarCliente();
						}
					
					
				
				}
					
				catch (Exception ex){
					System.out.println(ex);
					
				}
				try {
					
					Conexion.buscarRutCli=false;
					String strSql="select * from agenda ORDER BY id DESC;";
					Conexion.conectar();
					Conexion.sentencia=Conexion.conn.prepareStatement(strSql);
					ResultSet objRes = Conexion.sentencia.executeQuery(strSql);
					System.out.println("Consulta mostrar con exito");
					
					DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
					modelo.setRowCount(0);
					
					/*modelo.addColumn("id");
					modelo.addColumn("nombre");
					modelo.addColumn("telefono");
					modelo.addColumn("ciudad");*/
					
					Object [] fila = new Object [4];
					
					while (objRes.next()) {
						for (int i=0; i < 4; i++) {
							fila[i]=objRes.getObject(i+1);
							
						}
						
				        
						modelo.addRow(fila);
						tabla.setModel(modelo);
						
					}
					
					Conexion.desconectar();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
			}
		});
		btn_ingresar.setBounds(551, 160, 89, 23);
		frmAgenda.getContentPane().add(btn_ingresar);
		
		JButton btn_eliminar = new JButton("Eliminar");
		btn_eliminar.addActionListener(new ActionListener() {
			private String n;
			private String t;
			private String c;
			
			public void actionPerformed(ActionEvent e) {
				try {
					n = text_nombre.getText();
					t = text_telefono.getText();
					c = text_ciudad.getText();
					
					Agenda a = new Agenda(this.n, this.t, this.c);
					a.cargarRutCliete();
					if(Conexion.buscarRutCli) {
						a.borrar();
						}
					else {
						System.out.println("El telefono ya existe");}
					}
					
				catch (Exception ex){
					System.out.println(ex);
					
				}
				try {
					
					Conexion.buscarRutCli=false;
					String strSql="select * from agenda ORDER BY id DESC;";
					Conexion.conectar();
					Conexion.sentencia=Conexion.conn.prepareStatement(strSql);
					ResultSet objRes = Conexion.sentencia.executeQuery(strSql);
					System.out.println("Consulta mostrar con exito");
					
					DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
					modelo.setRowCount(0);
					
					/*modelo.addColumn("id");
					modelo.addColumn("nombre");
					modelo.addColumn("telefono");
					modelo.addColumn("ciudad");*/
					
					Object [] fila = new Object [4];
					
					while (objRes.next()) {
						for (int i=0; i < 4; i++) {
							fila[i]=objRes.getObject(i+1);
							
						}
						
				        
						modelo.addRow(fila);
						tabla.setModel(modelo);
						
					}
					
					Conexion.desconectar();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
			
			}
		});
		btn_eliminar.setBounds(551, 202, 89, 23);
		frmAgenda.getContentPane().add(btn_eliminar);
		
		JButton btn_modificar = new JButton("Modificar");
		btn_modificar.addActionListener(new ActionListener() {
			private String n;
			private String t;
			private String c;
			public void actionPerformed(ActionEvent e) {
				try {
				n = text_nombre.getText();
				t = text_telefono.getText();
				c = text_ciudad.getText();
				
				Agenda a = new Agenda(this.n, this.t, this.c);
				
				if(Conexion.buscarRutCli) {System.out.println("El nombre no existe");
					
					}
				else {
					a.actualizar();}
				}
				
			catch (Exception ex){
				System.out.println(e);
				
				}
				try {
					
					Conexion.buscarRutCli=false;
					String strSql="select * from agenda ORDER BY id DESC;";
					Conexion.conectar();
					Conexion.sentencia=Conexion.conn.prepareStatement(strSql);
					ResultSet objRes = Conexion.sentencia.executeQuery(strSql);
					System.out.println("Consulta mostrar con exito");
					
					DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
					modelo.setRowCount(0);
					
					/*modelo.addColumn("id");
					modelo.addColumn("nombre");
					modelo.addColumn("telefono");
					modelo.addColumn("ciudad");*/
					
					Object [] fila = new Object [4];
					
					while (objRes.next()) {
						for (int i=0; i < 4; i++) {
							fila[i]=objRes.getObject(i+1);
							
						}
						
				        
						modelo.addRow(fila);
						tabla.setModel(modelo);
						
					}
					
					Conexion.desconectar();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
			
			}
		});
		btn_modificar.setBounds(551, 250, 89, 23);
		frmAgenda.getContentPane().add(btn_modificar);
		
		JButton btn_todo = new JButton("Ver Todo");
		btn_todo.setBackground(new Color(240, 240, 240));
		btn_todo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
				Conexion.buscarRutCli=false;
				String strSql="select * from agenda ORDER BY id DESC;";
				Conexion.conectar();
				Conexion.sentencia=Conexion.conn.prepareStatement(strSql);
				ResultSet objRes = Conexion.sentencia.executeQuery(strSql);
				System.out.println("Consulta mostrar con exito");
				
				DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
				modelo.setRowCount(0);
				
				/*modelo.addColumn("id");
				modelo.addColumn("nombre");
				modelo.addColumn("telefono");
				modelo.addColumn("ciudad");*/
				
				Object [] fila = new Object [4];
				
				while (objRes.next()) {
					for (int i=0; i < 4; i++) {
						fila[i]=objRes.getObject(i+1);
						
					}
					
			        
					modelo.addRow(fila);
					tabla.setModel(modelo);
					
				}
				
				Conexion.desconectar();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
								
			}
		});
		btn_todo.setBounds(31, 54, 89, 23);
		frmAgenda.getContentPane().add(btn_todo);
		
		JButton btn_salir = new JButton("Salir");
		btn_salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btn_salir.setBounds(600, 343, 89, 23);
		frmAgenda.getContentPane().add(btn_salir);
		desplazamiento = new JScrollPane(tabla);
		tabla = new JTable();
		tabla.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tabla.setDropMode(DropMode.ON_OR_INSERT);
		tabla.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		tabla.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		tabla.setBackground(SystemColor.inactiveCaption);
		
		
		desplazamiento.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        desplazamiento.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		
		tabla.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Nombre", "Tel\u00E9fono", "Ciudad"
			}
		));
		
		tabla.setBounds(43, 104, 445, 262);
		frmAgenda.getContentPane().add(tabla);
		
	
		
		
		JButton btn_buscar = new JButton("<-Buscar->");
	
		btn_buscar.addActionListener(new ActionListener() {
			private String n;
			

			public void actionPerformed(ActionEvent e) {
				
				try {
					n = text_nombre.getText();
				
					Conexion.buscarRutCli=false;
					String strSql="select telefono from agenda where nombre='"+n+"'";
					Conexion.conectar();
					Conexion.sentencia=Conexion.conn.prepareStatement(strSql);
					ResultSet objRes = Conexion.sentencia.executeQuery(strSql);
					System.out.println("Consulta mostrar con exito");
					
					DefaultTableModel modelo = (DefaultTableModel) tabla2.getModel();
					modelo.setRowCount(0);
				
					/*modelo.addColumn("id");
					modelo.addColumn("nombre");
					modelo.addColumn("telefono");
					modelo.addColumn("ciudad");*/
					
					Object [] fila = new Object [1];
					
					while (objRes.next()) {
						for (int i=0; i < 1; i++) {
							fila[i]=objRes.getObject(i+1);
							
						}
						
						
				        
						modelo.addRow(fila);
						tabla2.setModel(modelo);
					
					}
				
				
				}catch (Exception ex){
				System.out.println(ex);
				
			}
				
			}
		});
		
		btn_buscar.setBounds(374, 54, 114, 23);
		frmAgenda.getContentPane().add(btn_buscar);
		
		JButton btn_limpiar = new JButton("Limpiar");
		btn_limpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				text_nombre.setText(null);
				text_telefono.setText(null);
				text_ciudad.setText(null);
				//txt_telefono2.setText(null);
				

			}
		});
		btn_limpiar.setBounds(501, 343, 89, 23);
		frmAgenda.getContentPane().add(btn_limpiar);
		
		tabla2 = new JTable();
		tabla2.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID"
			}
		));
		tabla2.setBounds(249, 55, 115, 20);
		frmAgenda.getContentPane().add(tabla2);
		
		JLabel lblNewLabel = new JLabel("Tel\u00E9fono: ");
		lblNewLabel.setBounds(183, 58, 78, 14);
		frmAgenda.getContentPane().add(lblNewLabel);
		
		JButton btn_down = new JButton("\u02C5");
		btn_down.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					Conexion.buscarRutCli=false;
					String strSql="select * from agenda  WHERE id <= 10 ORDER BY id DESC;";
					Conexion.conectar();
					Conexion.sentencia=Conexion.conn.prepareStatement(strSql);
					ResultSet objRes = Conexion.sentencia.executeQuery(strSql);
					System.out.println("Consulta mostrar con exito");
					
					DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
					modelo.setRowCount(0);
					
					/*modelo.addColumn("id");
					modelo.addColumn("nombre");
					modelo.addColumn("telefono");
					modelo.addColumn("ciudad");*/
					
					Object [] fila = new Object [4];
					
					while (objRes.next()) {
						for (int i=0; i < 4; i++) {
							fila[i]=objRes.getObject(i+1);
							
						}
						
				        
						modelo.addRow(fila);
						tabla.setModel(modelo);
						
					}
					
					Conexion.desconectar();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				
				
			}
		});
		btn_down.setBounds(493, 225, 41, 26);
		frmAgenda.getContentPane().add(btn_down);
		
		JButton btn_up = new JButton("\u02C4");
		btn_up.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
try {
					
					Conexion.buscarRutCli=false;
					String strSql="select * from agenda  WHERE id >= 10 ORDER BY id DESC;";
					Conexion.conectar();
					Conexion.sentencia=Conexion.conn.prepareStatement(strSql);
					ResultSet objRes = Conexion.sentencia.executeQuery(strSql);
					System.out.println("Consulta mostrar con exito");
					
					DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
					modelo.setRowCount(0);
					
					/*modelo.addColumn("id");
					modelo.addColumn("nombre");
					modelo.addColumn("telefono");
					modelo.addColumn("ciudad");*/
					
					Object [] fila = new Object [4];
					
					while (objRes.next()) {
						for (int i=0; i < 4; i++) {
							fila[i]=objRes.getObject(i+1);
							
						}
						
				        
						modelo.addRow(fila);
						tabla.setModel(modelo);
						
					}
					
					Conexion.desconectar();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				
				
			}
		});
		btn_up.setBounds(493, 186, 41, 26);
		frmAgenda.getContentPane().add(btn_up);
		
		JLabel lblNewLabel_5 = new JLabel("Id");
		lblNewLabel_5.setBounds(59, 89, 46, 14);
		frmAgenda.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Nombre");
		lblNewLabel_6.setBounds(169, 89, 46, 14);
		frmAgenda.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Tel\u00E9fono ");
		lblNewLabel_7.setBounds(271, 89, 80, 14);
		frmAgenda.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Ciudad ");
		lblNewLabel_8.setBounds(410, 89, 46, 14);
		frmAgenda.getContentPane().add(lblNewLabel_8);
	}

	public javax.swing.JTextField getTxt_nombre() {
		return txt_nombre;
	}

	public void setTxt_nombre(javax.swing.JTextField txt_nombre) {
		this.txt_nombre = txt_nombre;
	}

	public javax.swing.JTextField getTxt_telefono() {
		return txt_telefono;
	}

	public void setTxt_telefono(javax.swing.JTextField txt_telefono) {
		this.txt_telefono = txt_telefono;
	
	}

	public javax.swing.JTextField getTxt_ciudad() {
		return txt_ciudad;
	}

	public void setTxt_ciudad(javax.swing.JTextField txt_ciudad) {
		this.txt_ciudad = txt_ciudad;
	}
}

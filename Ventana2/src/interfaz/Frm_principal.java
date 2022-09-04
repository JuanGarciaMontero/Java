package interfaz;

import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.*;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.Caret;

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
	private JTextField txt_telefono2;
	private JScrollPane desplazamiento;
	

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
				
				if(Conexion.buscarRutCli) {System.out.println("El telefono ya existe");
					
					}
				else {
					a.actualizar();}
				}
				
			catch (Exception ex){
				System.out.println(e);
				
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
				String strSql="select * from agenda";
				Conexion.conectar();
				Conexion.sentencia=Conexion.conn.prepareStatement(strSql);
				ResultSet objRes = Conexion.sentencia.executeQuery(strSql);
				System.out.println("Consulta mostrar con exito");
				
				DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
				
				
				modelo.addColumn("id");
				modelo.addColumn("nombre");
				modelo.addColumn("telefono");
				modelo.addColumn("ciudad");
				
				Object [] fila = new Object [4];
				
				while (objRes.next()) {
					for (int i=0; i < 4; i++) {
						fila[i]=objRes.getObject(i+1);
						
					}
					
			        
					modelo.addRow(fila);
					tabla.setModel(modelo);
					
				}
				
				
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
		tabla.setDropMode(DropMode.ON_OR_INSERT);
		tabla.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		tabla.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		tabla.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tabla.setBackground(SystemColor.inactiveCaption);
		
		
		desplazamiento.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        desplazamiento.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		
		tabla.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column"
			}
		));
		
		tabla.setBounds(41, 95, 447, 271);
		frmAgenda.getContentPane().add(tabla);
		
		
		
		
		JButton btn_buscar = new JButton("<-Buscar->");
		btn_buscar.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
						
						
						try {
							
							Conexion.buscarRutCli=false;
							String strSql="select telefono from agenda";
							Conexion.conectar();
							Conexion.sentencia=Conexion.conn.prepareStatement(strSql);
							ResultSet objRes = Conexion.sentencia.executeQuery(strSql);
							System.out.println("Consulta mostrar con exito");
							
							txt_telefono2.setCaret((Caret) objRes);
							
							
					}
					
				catch (Exception ex){
					System.out.println(ex);
					
				}
			}
		});
		btn_buscar.setBounds(374, 54, 114, 23);
		frmAgenda.getContentPane().add(btn_buscar);
		
		txt_telefono2 = new JTextField();
		txt_telefono2.setBounds(259, 55, 105, 20);
		frmAgenda.getContentPane().add(txt_telefono2);
		txt_telefono2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Tel\u00E9fono:");
		lblNewLabel.setBounds(205, 58, 78, 14);
		frmAgenda.getContentPane().add(lblNewLabel);
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

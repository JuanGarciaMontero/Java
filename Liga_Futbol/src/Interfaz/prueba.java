package Interfaz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

import Acciones.Acciones;
import Conexion.Conexion;
import Interfaz.prueba;


import javax.swing.border.BevelBorder;
import java.io.*;

public class prueba {

	private JFrame frmAgenda;
	private JTextField text_nombre_equi;
	private JTextField text_presi;
	private JTextField text_nombre_jugador;
	private JTable tabla;
	protected Container panel;
	
	private javax.swing.JTextField txt_nombre;
	private javax.swing.JTextField txt_telefono;
	private javax.swing.JTextField txt_ciudad;
	protected JLabel jtxt_buscar;

	protected Object telefono;
	private JTextField text_apellido_jugador;
	private JTextField text_posicion_jugador;
	private JTextField text_nombre_arbitro;
	private JTextField text_apellido_arbitro;
	private JTextField text_equipo_jugador;
	private JTextField text_posicion_arbitro;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prueba window = new prueba();
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
	
	public prueba() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	public static int factorial (int a) {
		int f =0;
		for (int i=1;i<a;i++) {
			f += i;			
		}
		return f;
		
	}
	private void initialize() {
		
		
		frmAgenda = new JFrame();
		frmAgenda.setTitle("FUTBOL");
		frmAgenda.setBounds(100, 100, 883, 490);
		frmAgenda.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAgenda.getContentPane().setLayout(null);
		

		
		text_nombre_equi = new JTextField();
		text_nombre_equi.setBounds(604, 8, 140, 20);
		frmAgenda.getContentPane().add(text_nombre_equi);
		text_nombre_equi.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre Equipo: ");
		lblNewLabel_1.setBounds(502, 11, 112, 14);
		frmAgenda.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Presidente:");
		lblNewLabel_2.setBounds(522, 36, 72, 14);
		frmAgenda.getContentPane().add(lblNewLabel_2);
		
		text_presi = new JTextField();
		text_presi.setBounds(604, 39, 135, 20);
		frmAgenda.getContentPane().add(text_presi);
		text_presi.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Nombre Jugador:");
		lblNewLabel_3.setBounds(11, 278, 119, 14);
		frmAgenda.getContentPane().add(lblNewLabel_3);
		
		text_nombre_jugador = new JTextField();
		text_nombre_jugador.setBounds(140, 275, 130, 20);
		frmAgenda.getContentPane().add(text_nombre_jugador);
		text_nombre_jugador.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("CARGAR BD:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4.setBounds(31, 11, 115, 26);
		frmAgenda.getContentPane().add(lblNewLabel_4);
		
		
		
		JButton btn_ingresar_equipo = new JButton("Ingresar");
		btn_ingresar_equipo.addActionListener(new ActionListener() {

			private String n;
			private String t;

			public void actionPerformed(ActionEvent e) {
				try {
					n = text_nombre_equi.getText();
					t = text_presi.getText();
					
					Acciones a = new Acciones(this.n, this.t);
					a.cargarRutEquipo();
					if(Conexion.buscarRutCli) {
						System.out.println("Cliente ya existe");
						a.imprimirEquipo();
						}
					else {
						a.guardarEquipo();
						}
					
					
				
				}
					
				catch (Exception ex){
					System.out.println(ex);
					
				}
				try {
					
					Conexion.buscarRutCli=false;
					String strSql="select * from futbol1 ORDER BY id_equi DESC;";
					Conexion.conectar();
					Conexion.sentencia=Conexion.conn.prepareStatement(strSql);
					ResultSet objRes = Conexion.sentencia.executeQuery(strSql);
					System.out.println("Consulta mostrar con exito");
					
					DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
					modelo.setRowCount(0);
					
					
					Object [] fila = new Object [3];
					
					while (objRes.next()) {
						for (int i=0; i < 3; i++) {
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
		btn_ingresar_equipo.setBounds(763, 7, 89, 23);
		frmAgenda.getContentPane().add(btn_ingresar_equipo);
		
		JButton btn_eliminar_equipo = new JButton("Eliminar");
		btn_eliminar_equipo.addActionListener(new ActionListener() {
			private String n;
			private String t;
			
			public void actionPerformed(ActionEvent e) {
				try {
					n = text_nombre_equi.getText();
					t = text_presi.getText();

					
					Acciones a = new Acciones(this.n, this.t);
					a.cargarRutEquipo();
					if(Conexion.buscarRutCli) {
						a.borrar_equipo();
						}
					else {
						System.out.println("El telefono ya existe");}
					}
					
				catch (Exception ex){
					System.out.println(ex);
					
				}
				try {
					
					Conexion.buscarRutCli=false;
					String strSql="select * from futbol1 ORDER BY id_equi DESC;";
					Conexion.conectar();
					Conexion.sentencia=Conexion.conn.prepareStatement(strSql);
					ResultSet objRes = Conexion.sentencia.executeQuery(strSql);
					System.out.println("Consulta mostrar con exito");
					
					DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
					modelo.setRowCount(0);
					
					
					Object [] fila = new Object [3];
					
					while (objRes.next()) {
						for (int i=0; i < 3; i++) {
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
		btn_eliminar_equipo.setBounds(763, 35, 89, 23);
		frmAgenda.getContentPane().add(btn_eliminar_equipo);
		
		JButton btn_modificar_equipo = new JButton("Modificar");
		btn_modificar_equipo.addActionListener(new ActionListener() {
			private String n;
			private String t;

			public void actionPerformed(ActionEvent e) {
				try {
				n = text_nombre_equi.getText();
				t = text_presi.getText();

				
				Acciones a = new Acciones(this.n, this.t);
				
				if(Conexion.buscarRutCli) {System.out.println("El nombre no existe");
					
					}
				else {
					a.actualizar_equipo();}
				}
				
			catch (Exception ex){
				System.out.println(e);
				
				}
				try {
					
					Conexion.buscarRutCli=false;
					String strSql="select * from futbol1 ORDER BY id_equi DESC;";
					Conexion.conectar();
					Conexion.sentencia=Conexion.conn.prepareStatement(strSql);
					ResultSet objRes = Conexion.sentencia.executeQuery(strSql);
					System.out.println("Consulta mostrar con exito");
					
					DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
					modelo.setRowCount(0);
					
					
					Object [] fila = new Object [3];
					
					while (objRes.next()) {
						for (int i=0; i < 3; i++) {
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
		btn_modificar_equipo.setBounds(763, 63, 89, 23);
		frmAgenda.getContentPane().add(btn_modificar_equipo);
		
		JButton btn_equipos = new JButton("Equipos");
		btn_equipos.setBackground(new Color(240, 240, 240));
		btn_equipos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
				Conexion.buscarRutCli=false;
				String strSql="select * from futbol1 ORDER BY id_equi DESC;";
				Conexion.conectar();
				Conexion.sentencia=Conexion.conn.prepareStatement(strSql);
				ResultSet objRes = Conexion.sentencia.executeQuery(strSql);
				System.out.println("Consulta mostrar con exito");
				
				DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
				modelo.setRowCount(0);
				
				
				Object [] fila = new Object [3];
				
				while (objRes.next()) {
					for (int i=0; i < 3; i++) {
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
		btn_equipos.setBounds(31, 54, 89, 23);
		frmAgenda.getContentPane().add(btn_equipos);
		
		JButton btn_salir = new JButton("Salir");
		btn_salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btn_salir.setBounds(763, 417, 89, 23);
		frmAgenda.getContentPane().add(btn_salir);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(41, 88, 811, 176);
		frmAgenda.getContentPane().add(scrollPane);
		
		tabla = new JTable();
		scrollPane.setViewportView(tabla);
		tabla.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tabla.setDropMode(DropMode.ON_OR_INSERT);
		tabla.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		tabla.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		tabla.setBackground(SystemColor.inactiveCaption);
		
		
		
		
		
		tabla.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Id /Jornada", "Nombre", "Presidente / Apellido / Nombre", "Posicion / Arbitro", "Equipo"
			}
		));
		
		JButton btn_limpiar = new JButton("Limpiar");
		btn_limpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				text_nombre_equi.setText(null);
				text_presi.setText(null);
				text_nombre_jugador.setText(null);
				text_apellido_jugador.setText(null);
				text_posicion_jugador.setText(null);
				text_equipo_jugador.setText(null);
				text_nombre_arbitro.setText(null);
				text_apellido_arbitro.setText(null);
				text_posicion_arbitro.setText(null);
				

			}
		});
		btn_limpiar.setBounds(635, 417, 89, 23);
		frmAgenda.getContentPane().add(btn_limpiar);
		
		JButton btn_cargar_bd = new JButton("Pulsar");
		btn_cargar_bd.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				try {
					
					
					Conexion.buscarRutCli=false;
					String strSql="CREATE TABLE futbol.futbol1 (id_equi INTEGER NOT NULL AUTO_INCREMENT, nombre_equi VARCHAR(15), presi VARCHAR(15), PRIMARY KEY (id_equi))";
					Conexion.conectar();
					Conexion.sentencia=Conexion.conn.prepareStatement(strSql);
					Conexion.sentencia.execute(strSql);
					System.out.println("Consulta crear tabla futbol1 realizada con exito");	
					Conexion.desconectar();
					
					
					Conexion.buscarRutCli=false;
					String strSql2="CREATE TABLE futbol.futbol2 (id_jug INTEGER NOT NULL AUTO_INCREMENT, nombre_jug VARCHAR(15), apellido_jug VARCHAR(15), posicion_jug VARCHAR(15), equipo_jug VARCHAR(15), PRIMARY KEY (id_jug))";
					Conexion.conectar();
					Conexion.sentencia=Conexion.conn.prepareStatement(strSql2);
					Conexion.sentencia.execute(strSql2);
					System.out.println("Consulta crear tabla futbol2 realizada con exito");	
					Conexion.desconectar();
					
					
					Conexion.buscarRutCli=false;
					String strSql3="CREATE TABLE futbol.futbol3 (id_arb INTEGER NOT NULL AUTO_INCREMENT, nombre_arb VARCHAR(15), apellido_arb VARCHAR(15), posicion_arb VARCHAR(15),  PRIMARY KEY (id_arb))";
					Conexion.conectar();
					Conexion.sentencia=Conexion.conn.prepareStatement(strSql3);
					Conexion.sentencia.execute(strSql3);
					System.out.println("Consulta crear tabla futbol3 realizada con exito");	
					Conexion.desconectar();
					
					
					Conexion.buscarRutCli=false;
					String strSql4="CREATE TABLE futbol.futbol4 (id_sorteos INTEGER , nombre_equi1 VARCHAR(35),  nombre_arb VARCHAR(15))";
					Conexion.conectar();
					Conexion.sentencia=Conexion.conn.prepareStatement(strSql4);
					Conexion.sentencia.execute(strSql4);
					System.out.println("Consulta crear tabla futbol4 realizada con exito");	
					Conexion.desconectar();
					
					
					
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
									
				}
			});
		btn_cargar_bd.setBounds(146, 11, 89, 23);
		frmAgenda.getContentPane().add(btn_cargar_bd);
		
		JButton btn_jugadores = new JButton("Jugadores");
		btn_jugadores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
				Conexion.buscarRutCli=false;
				String strSql="select * from futbol2 ORDER BY id_jug DESC;";
				Conexion.conectar();
				Conexion.sentencia=Conexion.conn.prepareStatement(strSql);
				ResultSet objRes = Conexion.sentencia.executeQuery(strSql);
				System.out.println("Consulta mostrar con exito");
				
				DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
				modelo.setRowCount(0);
			
				
				Object [] fila = new Object [5];
				
				while (objRes.next()) {
					for (int i=0; i < 5; i++) {
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
		btn_jugadores.setBackground(SystemColor.menu);
		btn_jugadores.setBounds(130, 54, 105, 23);
		frmAgenda.getContentPane().add(btn_jugadores);
		
		JButton btn_arbitros = new JButton("Arbitros");
		btn_arbitros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
				Conexion.buscarRutCli=false;
				String strSql="select * from futbol3 ORDER BY id_arb DESC;";
				Conexion.conectar();
				Conexion.sentencia=Conexion.conn.prepareStatement(strSql);
				ResultSet objRes = Conexion.sentencia.executeQuery(strSql);
				System.out.println("Consulta mostrar con exito");
				
				DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
				modelo.setRowCount(0);
			
				
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
		btn_arbitros.setBackground(SystemColor.menu);
		btn_arbitros.setBounds(245, 54, 89, 23);
		frmAgenda.getContentPane().add(btn_arbitros);
		
		JButton btn_sorteos = new JButton("Sorteos");
		btn_sorteos.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				ArrayList<String> list= new ArrayList<String>();
				ArrayList<String> list1= new ArrayList<String>();
				ArrayList<String> list2= new ArrayList<String>();
				ArrayList<String> list3= new ArrayList<String>();
				ArrayList<String> list4= new ArrayList<String>();
				ArrayList<String> list5= new ArrayList<String>();
				ArrayList<String> list6= new ArrayList<String>();
				ArrayList<String> list7= new ArrayList<String>();
			
				
				
				
					try {
						
						Conexion.buscarRutCli=false;
						String strSql6="select nombre_equi from futbol1;";
						Conexion.conectar();
						Conexion.sentencia=Conexion.conn.prepareStatement(strSql6);
						ResultSet objRes6 = Conexion.sentencia.executeQuery(strSql6);
						System.out.println("Consulta mostrar con exito");
					
						while (objRes6.next()) {

							       list.add(objRes6.getString("nombre_equi"));
							       list2.add(objRes6.getString("nombre_equi"));
							       
							     }
				
						
					Conexion.buscarRutCli=false;
					String strSql="select nombre_arb from futbol3;";
					Conexion.conectar();
					Conexion.sentencia=Conexion.conn.prepareStatement(strSql);
					ResultSet objRes = Conexion.sentencia.executeQuery(strSql);
					System.out.println("Consulta mostrar con exito");
				
					while (objRes.next()) {

					       list4.add(objRes.getString("nombre_arb"));
					     }
					
					
				
					int au=0;
						for(int i=0;i<list.size();i++){						
							au+=1;
						}
						
						
					int ao=0;
						for(int i=0;i<list4.size();i++){						
							ao+=1;
						}
						
						
						
						
					//Jornada 1
						
						int b = (int)(Math.random() * ao);//Sorteo entre uno de los dos arbitros
						
						
						String equipo0=null;
						String equipo1=null;
						String arbitro=null;
						String arbitro1=null;

					
						for(int r=0; r<au; r++) {
							
							for(int s=0; s<au; s++) {
								if (r!=s && r<=s) {
							equipo0 = list.get(r);
							equipo1 = list2.get(s);

							arbitro = list4.get(b);
							
							list3.add(list.get(r)+ " vs "+list2.get(s));
							list7.add(list2.get(s)+ " vs "+list.get(r));
							
									}
						  }
						}
					
						for(int r=prueba.factorial(au)-1; r>=0; r--) {list1.add(list7.get(r));}
					
						for(int r=0; r<prueba.factorial(au); r++) {			
							
						
							list5.add(list3.get(r));
							list6.add(list1.get(r));
						 }
					
						
						
						for(int r=0; r<prueba.factorial(au); r++) {
						
							equipo0 = list5.get(r);
							equipo1 = list6.get(r);
							arbitro = list4.get(b);
							if (b!=0) {
						        arbitro1 = list4.get(0);} else  arbitro1 = list4.get(b+1);
							arbitro = list4.get(b);
					
							System.out.println("Jornada: "+(r+1)+" "+equipo0+": Arbitro: "+arbitro);
							System.out.println("Jornada: "+(r+1)+" "+equipo1+": Arbitro: "+arbitro1);
						 
							String strSql8 = "insert into futbol4 values ("+(r+1)+",'"+equipo0+"','"+arbitro+"')";
							Conexion.conectar();
							Conexion.sentencia = Conexion.conn.prepareStatement(strSql8);
							Conexion.sentencia.execute(strSql8);
							
							String strSql9 = "insert into futbol4 values ("+(r+1)+",'"+equipo1+"','"+arbitro1+"')";
							Conexion.conectar();
							Conexion.sentencia = Conexion.conn.prepareStatement(strSql9);
							Conexion.sentencia.execute(strSql9);
						
						}
						
						
						
						
					Conexion.desconectar();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}

					try {
					
					Conexion.buscarRutCli=false;
					String strSql="select  * from futbol4";
					Conexion.conectar();
					Conexion.sentencia=Conexion.conn.prepareStatement(strSql);
					ResultSet objRes = Conexion.sentencia.executeQuery(strSql);
					System.out.println("Consulta mostrar con exito");
					
					DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
					modelo.setRowCount(0);
					
					
					Object [] fila = new Object [3];
					
					while (objRes.next()) {
						for (int i=0; i < 3; i++) {
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
		btn_sorteos.setBackground(SystemColor.menu);
		btn_sorteos.setBounds(435, 54, 89, 23);
		frmAgenda.getContentPane().add(btn_sorteos);
		
		JLabel lblNewLabel_3_1 = new JLabel("Apellido Jugador:");
		lblNewLabel_3_1.setBounds(11, 303, 109, 14);
		frmAgenda.getContentPane().add(lblNewLabel_3_1);
		
		text_apellido_jugador = new JTextField();
		text_apellido_jugador.setColumns(10);
		text_apellido_jugador.setBounds(140, 300, 130, 20);
		frmAgenda.getContentPane().add(text_apellido_jugador);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Posicion Jugador:");
		lblNewLabel_3_1_1.setBounds(11, 328, 130, 17);
		frmAgenda.getContentPane().add(lblNewLabel_3_1_1);
		
		text_posicion_jugador = new JTextField();
		text_posicion_jugador.setColumns(10);
		text_posicion_jugador.setBounds(140, 328, 130, 20);
		frmAgenda.getContentPane().add(text_posicion_jugador);
		
		JLabel lblNewLabel_3_2 = new JLabel("Nombre Arbitro:");
		lblNewLabel_3_2.setBounds(477, 281, 112, 14);
		frmAgenda.getContentPane().add(lblNewLabel_3_2);
		
		text_nombre_arbitro = new JTextField();
		text_nombre_arbitro.setColumns(10);
		text_nombre_arbitro.setBounds(581, 275, 105, 20);
		frmAgenda.getContentPane().add(text_nombre_arbitro);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("Apellido Arbitro:");
		lblNewLabel_3_1_2.setBounds(477, 303, 117, 14);
		frmAgenda.getContentPane().add(lblNewLabel_3_1_2);
		
		text_apellido_arbitro = new JTextField();
		text_apellido_arbitro.setColumns(10);
		text_apellido_arbitro.setBounds(581, 300, 105, 20);
		frmAgenda.getContentPane().add(text_apellido_arbitro);
		
		JButton btn_limpiar_1 = new JButton("Imprimir Informe");
		btn_limpiar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FileWriter fichero = null;
				PrintWriter pw = null;
				
				
						try {
							
							Conexion.buscarRutCli=false;
							String strSql="select * from futbol4";
							Conexion.conectar();
							Conexion.sentencia=Conexion.conn.prepareStatement(strSql);
							ResultSet objRes = Conexion.sentencia.executeQuery(strSql);
							System.out.println("Consulta mostrar con exito");
							
							DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
							modelo.setRowCount(0);
							
							fichero = new FileWriter("c://Users/Public/informe.txt");
							
							pw = new PrintWriter(fichero);
							Object [] fila = new Object [3];
							
							
							while (objRes.next()) {
								fila[0]=objRes.getObject(1);
								pw.println("Sorteo Liga Futbol Sala Marchamalo (Guadalajara): ");
								fila[2]=objRes.getObject(3);
								pw.println("(JORNADA | EQUIPOS | ARBITRO");
								for (int i=0; i < 3; i++) {
									fila[i]=objRes.getObject(i+1);
									
									pw.println(fila[i]);
									
								}
								
							
								
						        
								modelo.addRow(fila);
								tabla.setModel(modelo);
								
							}
							
							Conexion.desconectar();
							} catch (SQLException | IOException e1) {
								e1.printStackTrace();
							}
						
						 finally {
						try {
						if (null != fichero)
						fichero.close();
						//cierre del fichero
						} catch (Exception e2) {
						e2.printStackTrace();
						}
					}		
				}	
		});
		btn_limpiar_1.setBounds(11, 417, 135, 23);
		frmAgenda.getContentPane().add(btn_limpiar_1);
		
		JLabel lblNewLabel_1_1 = new JLabel(" Equipo Jugador: ");
		lblNewLabel_1_1.setBounds(11, 359, 119, 14);
		frmAgenda.getContentPane().add(lblNewLabel_1_1);
		
		text_equipo_jugador = new JTextField();
		text_equipo_jugador.setColumns(10);
		text_equipo_jugador.setBounds(140, 356, 130, 20);
		frmAgenda.getContentPane().add(text_equipo_jugador);
		
		JButton btn_ingresar_jugador = new JButton("Ingresar");
			btn_ingresar_jugador.addActionListener(new ActionListener() {

				private String n;
				private String t;
				private String l;
				private String m;

				public void actionPerformed(ActionEvent e) {
					try {
						n = text_nombre_jugador.getText();
						t = text_apellido_jugador.getText();
						l = text_posicion_jugador.getText();
						m = text_equipo_jugador.getText();
						
						Acciones a = new Acciones(this.n, this.t, this.l, this.m);
						a.cargarRutJugador();
						if(Conexion.buscarRutCli) {
							System.out.println("Jugador ya existe");
							a.imprimirJugador();
							}
						else {
							a.guardarJugador();
							}
						
						
					
					}
						
					catch (Exception ex){
						System.out.println(ex);
						
					}
					try {
						
						Conexion.buscarRutCli=false;
						String strSql="select * from futbol2 ORDER BY id_jug DESC;";
						Conexion.conectar();
						Conexion.sentencia=Conexion.conn.prepareStatement(strSql);
						ResultSet objRes = Conexion.sentencia.executeQuery(strSql);
						System.out.println("Consulta mostrar con exito");
						
						DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
						modelo.setRowCount(0);
						
						
						Object [] fila = new Object [5];
						
						while (objRes.next()) {
							for (int i=0; i < 5; i++) {
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
			btn_ingresar_equipo.setBounds(763, 7, 89, 23);
			frmAgenda.getContentPane().add(btn_ingresar_equipo);
			
			
			
		btn_ingresar_jugador.setBounds(290, 278, 89, 23);
		frmAgenda.getContentPane().add(btn_ingresar_jugador);
		
		JButton btn_eliminar_jugador = new JButton("Eliminar");
			btn_eliminar_jugador.addActionListener(new ActionListener() {
				private String n;
				private String t;
				private String l;
				private String m;

				public void actionPerformed(ActionEvent e) {
					try {
						n = text_nombre_jugador.getText();
						t = text_apellido_jugador.getText();
						l = text_posicion_jugador.getText();
						m = text_equipo_jugador.getText();
						
						Acciones a = new Acciones(this.n, this.t, this.l, this.m);
						a.cargarRutJugador();
						if(Conexion.buscarRutCli) {
							a.borrar_jugador();
							}
						else {
							System.out.println("El jugador ya existe");}
						}
						
					catch (Exception ex){
						System.out.println(ex);
						
					}
					try {
						
						Conexion.buscarRutCli=false;
						String strSql="select * from futbol2 ORDER BY id_jug DESC;";
						Conexion.conectar();
						Conexion.sentencia=Conexion.conn.prepareStatement(strSql);
						ResultSet objRes = Conexion.sentencia.executeQuery(strSql);
						System.out.println("Consulta mostrar con exito");
						
						DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
						modelo.setRowCount(0);
						
						
						Object [] fila = new Object [5];
						
						while (objRes.next()) {
							for (int i=0; i < 5; i++) {
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
		btn_eliminar_jugador.setBounds(290, 306, 89, 23);
		frmAgenda.getContentPane().add(btn_eliminar_jugador);
		
		JButton btn_modificar_jugador = new JButton("Modificar");
		btn_modificar_jugador.addActionListener(new ActionListener() {
			private String n;
			private String t;
			private String l;
			private String m;

			public void actionPerformed(ActionEvent e) {
				try {
					n = text_nombre_jugador.getText();
					t = text_apellido_jugador.getText();
					l = text_posicion_jugador.getText();
					m = text_equipo_jugador.getText();
					
					Acciones a = new Acciones(this.n, this.t, this.l, this.m);
				
				if(Conexion.buscarRutCli) {System.out.println("El jugador no existe");
					
					}
				else {
					a.actualizar_jugador();}
				}
				
			catch (Exception ex){
				System.out.println(e);
				
				}
				try {
					
					Conexion.buscarRutCli=false;
					String strSql="select * from futbol2 ORDER BY id_jug DESC;";
					Conexion.conectar();
					Conexion.sentencia=Conexion.conn.prepareStatement(strSql);
					ResultSet objRes = Conexion.sentencia.executeQuery(strSql);
					System.out.println("Consulta mostrar con exito");
					
					DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
					modelo.setRowCount(0);
					
					
					Object [] fila = new Object [5];
					
					while (objRes.next()) {
						for (int i=0; i < 5; i++) {
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
		btn_modificar_jugador.setBounds(290, 334, 89, 23);
		frmAgenda.getContentPane().add(btn_modificar_jugador);
		
		JButton btn_ingresar_arbitro = new JButton("Ingresar");
		btn_ingresar_arbitro.addActionListener(new ActionListener() {
			private String n;
			private String t;
			private String m;


			public void actionPerformed(ActionEvent e) {
				try {
					n = text_nombre_arbitro.getText();
					t = text_apellido_arbitro.getText();
					m = text_posicion_arbitro.getText();


					
					Acciones a = new Acciones(this.n, this.t, this.m);
					a.cargarRutArbitro();
					if(Conexion.buscarRutCli) {
						System.out.println("Arbitro ya existe");
						a.imprimirArbitro();
						}
					else {
						a.guardarArbitro();
						}
					
					
				
				}
					
				catch (Exception ex){
					System.out.println(ex);
					
				}
				try {
					
					Conexion.buscarRutCli=false;
					String strSql="select * from futbol3 ORDER BY id_arb DESC;";
					Conexion.conectar();
					Conexion.sentencia=Conexion.conn.prepareStatement(strSql);
					ResultSet objRes = Conexion.sentencia.executeQuery(strSql);
					System.out.println("Consulta mostrar con exito");
					
					DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
					modelo.setRowCount(0);
					
					
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
		btn_ingresar_arbitro.setBounds(696, 269, 89, 23);
		frmAgenda.getContentPane().add(btn_ingresar_arbitro);
		
		JButton btn_eliminar_arbitro = new JButton("Eliminar");
		btn_eliminar_arbitro.addActionListener(new ActionListener() {
			private String n;
			private String t;
			private String m;


			public void actionPerformed(ActionEvent e) {
				try {
					n = text_nombre_arbitro.getText();
					t = text_apellido_arbitro.getText();
					m = text_posicion_arbitro.getText();

					
					Acciones a = new Acciones(this.n, this.t, this.m);
					a.cargarRutArbitro();
					if(Conexion.buscarRutCli) {
						a.borrar_arbitro();
						}
					else {
						System.out.println("El arbitro ya existe");}
					}
					
				catch (Exception ex){
					System.out.println(ex);
					
				}
				try {
					
					Conexion.buscarRutCli=false;
					String strSql="select * from futbol3 ORDER BY id_arb DESC;";
					Conexion.conectar();
					Conexion.sentencia=Conexion.conn.prepareStatement(strSql);
					ResultSet objRes = Conexion.sentencia.executeQuery(strSql);
					System.out.println("Consulta mostrar con exito");
					
					DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
					modelo.setRowCount(0);
					
					
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
		btn_eliminar_arbitro.setBounds(696, 297, 89, 23);
		frmAgenda.getContentPane().add(btn_eliminar_arbitro);
		
		JButton btn_modificar_arbitro = new JButton("Modificar");
		btn_modificar_arbitro.addActionListener(new ActionListener() {
			private String n;
			private String t;
			private String m;


			public void actionPerformed(ActionEvent e) {
				try {
					n = text_nombre_arbitro.getText();
					t = text_apellido_arbitro.getText();
					m = text_posicion_arbitro.getText();

					
					Acciones a = new Acciones(this.n, this.t, this.m);
				
				if(Conexion.buscarRutCli) {System.out.println("El arbitro no existe");
					
					}
				else {
					a.actualizar_arbitro();}
				}
				
			catch (Exception ex){
				System.out.println(e);
				
				}
				try {
					
					Conexion.buscarRutCli=false;
					String strSql="select * from futbol3 ORDER BY id_arb DESC;";
					Conexion.conectar();
					Conexion.sentencia=Conexion.conn.prepareStatement(strSql);
					ResultSet objRes = Conexion.sentencia.executeQuery(strSql);
					System.out.println("Consulta mostrar con exito");
					
					DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
					modelo.setRowCount(0);
					
					
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
		btn_modificar_arbitro.setBounds(696, 325, 89, 23);
		frmAgenda.getContentPane().add(btn_modificar_arbitro);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Posicion Arbitro:");
		lblNewLabel_3_1_1_1.setBounds(477, 328, 130, 17);
		frmAgenda.getContentPane().add(lblNewLabel_3_1_1_1);
		
		text_posicion_arbitro = new JTextField();
		text_posicion_arbitro.setColumns(10);
		text_posicion_arbitro.setBounds(581, 328, 105, 20);
		frmAgenda.getContentPane().add(text_posicion_arbitro);
		
		JLabel lblNewLabel = new JLabel("Antes de Cargar BD.  Crear un BD llamada futbol. Sólo válido para 4 equipos.");
		lblNewLabel.setBounds(62, 36, 450, 14);
		frmAgenda.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_5 = new JLabel("Ubicacion: C:\\Users\\Public\\informe.txt");
		lblNewLabel_5.setBounds(11, 400, 259, 14);
		frmAgenda.getContentPane().add(lblNewLabel_5);
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

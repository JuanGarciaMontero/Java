package Sentencia_Break;

import java.awt.BorderLayout;
import java.util.Scanner;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
//import java.sql.ResultSet;
import java.util.Scanner;
import javax.swing.JTabbedPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/*public class Conexion {
	
	private static Connection con;{

	/*public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

	
		//String sql = "SELECT id, nombre FROM agenda ";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el id:");
		String id = sc.next();
		
		System.out.println("Introduce el nombre:");
		String nombre = sc.next();
		
		System.out.println("Introduce el telefono:");
		String telefono = sc.next();
		
		System.out.println("Introduce el ciudad:");
		String ciudad = sc.next();
		
		System.out.println("La  persona a dar de alta es: " +id + "  " + nombre+ "  " +telefono+ "  " +ciudad);
		
		Statement sentencia = conectarBD();
		
		if(sentencia != null) {
			System.out.println("Conexión correcta");
		}
		
		//String sql = "INSERT INTO agenda (id,name,telefono,ciudad) VALUES ('"+id+ "' , '"+nombre+"', '"+telefono+"', '"+ciudad+"')";
		String sql = "SELECT id, nombre FROM agenda ";
		System.out.println(sql);
		
		
		try {
			/*ResultSet rs = sentencia.executeQuery(sql);
	
			while (rs.next()) {
				System.out.println("");
				
			}
			sentencia.executeUpdate(sql);
			con.close();
		}
		catch (SQLException e ) {e.printStackTrace();}
		
	
	}	
	
	private static Statement conectarBD() {
		String db_ = "agenda" ;
		String login_ = "root" ;
		String password_ = "" ;
		String url_ = "jdbc:mysql://localhost/ " + db_ ;

		Statement sentencia = null ;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver") ;
			con = DriverManager.getConnection (url_,login_,password_);
			if (con != null) {
				sentencia = con.createStatement();
				System.out.println(" Conexion a base de datos (" + db_+ ") es correcta. ");
			}
			else
				System.out.println(" Conexion fallida." );
			} catch ( SQLException e) { e.printStackTrace();}
			catch ( ClassNotFoundException e) { e.printStackTrace();}
			catch ( Exception e) { e.printStackTrace();}
		
			return sentencia;
		}
}*/

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTextField txtnombre;
	private JTextField txttelefono;
	private JTextField txtid;
	private JTextField txtciudad;
	private JTextField txttodos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana() {
		setTitle("AGENDA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 437);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setBounds(109, 52, 46, 14);
		contentPane.add(lblNewLabel);
		
		String nomb;
		Scanner sc = new Scanner(System.in);
		txtnombre = new JTextField();
		txtnombre.setBounds(177, 48, 190, 23);
		contentPane.add(txtnombre);
		txtnombre.setColumns(10);
		nomb = sc.nextLine();
		
		JLabel lblNewLabel_1 = new JLabel("Tel\u00E9fono:");
		lblNewLabel_1.setBounds(109, 91, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txttelefono = new JTextField();
		txttelefono.setText("");
		txttelefono.setBounds(177, 82, 190, 23);
		contentPane.add(txttelefono);
		txttelefono.setColumns(10);
		
		JButton btnlimpiar = new JButton("Limpiar");
		btnlimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("El nombre y apellido es:"+ txtnombre +" "+ txttelefono);
			}
		});
		btnlimpiar.setBounds(200, 355, 65, 23);
		contentPane.add(btnlimpiar);
		
		JButton btnsalir = new JButton("Salir");
		btnsalir.addMouseListener(new MouseAdapter() {
			
			
			
		});
		btnsalir.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnsalir.setBounds(307, 355, 89, 23);
		contentPane.add(btnsalir);
		dispose();
		
		txtid = new JTextField();
		txtid.setBounds(203, 11, 86, 20);
		contentPane.add(txtid);
		txtid.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("ID:");
		lblNewLabel_2.setBounds(166, 14, 27, 14);
		contentPane.add(lblNewLabel_2);
		
		txtciudad = new JTextField();
		txtciudad.setBounds(177, 121, 190, 23);
		contentPane.add(txtciudad);
		txtciudad.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Ciudad:");
		lblNewLabel_3.setBounds(109, 125, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton btninsertar = new JButton("INSERTAR");
		btninsertar.setBounds(85, 166, 89, 23);
		contentPane.add(btninsertar);
		
		JButton btnmodificar = new JButton("MODIFICAR");
		btnmodificar.setBounds(213, 166, 89, 23);
		contentPane.add(btnmodificar);
		
		JButton btneliminar = new JButton("ELIMINAR");
		btneliminar.setBounds(344, 166, 89, 23);
		contentPane.add(btneliminar);
		
		JButton btnver = new JButton("VER TODOS");
		btnver.setBounds(85, 209, 89, 23);
		contentPane.add(btnver);
		
		txttodos = new JTextField();
		txttodos.setBounds(203, 210, 230, 23);
		contentPane.add(txttodos);
		txttodos.setColumns(10);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 243, 551, 101);
		contentPane.add(tabbedPane);
		Connection();
		
	}
	private void Connection() {
		// TODO Apéndice de método generado automáticamente
		
	}
	private static Connection con;{

		/*public static void main(String[] args) {
			// TODO Apéndice de método generado automáticamente

		
			//String sql = "SELECT id, nombre FROM agenda ";
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Introduce el id:");
			String id = sc.next();
			
			System.out.println("Introduce el nombre:");
			String nombre = sc.next();
			
			System.out.println("Introduce el telefono:");
			String telefono = sc.next();
			
			System.out.println("Introduce el ciudad:");
			String ciudad = sc.next();
			
			System.out.println("La  persona a dar de alta es: " +id + "  " + nombre+ "  " +telefono+ "  " +ciudad);
			*/
			Statement sentencia = conectarBD();
			
			if(sentencia != null) {
				System.out.println("Conexión correcta");
			}
			
			//String sql = "INSERT INTO agenda (id,name,telefono,ciudad) VALUES ('"+id+ "' , '"+nombre+"', '"+telefono+"', '"+ciudad+"')";
			String sql = "SELECT id, nombre FROM agenda ";
			System.out.println(sql);
			
			
			try {
				/*ResultSet rs = sentencia.executeQuery(sql);
		
				while (rs.next()) {
					System.out.println("");
					
				}*/
				sentencia.executeUpdate(sql);
				con.close();
			}
			catch (SQLException e ) {e.printStackTrace();}
			
		
		}	
		
		private static Statement conectarBD() {
			String db_ = "agenda" ;
			String login_ = "root" ;
			String password_ = "" ;
			String url_ = "jdbc:mysql://localhost/ " + db_ ;

			Statement sentencia = null ;
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver") ;
				con = DriverManager.getConnection (url_,login_,password_);
				if (con != null) {
					sentencia = con.createStatement();
					System.out.println(" Conexion a base de datos (" + db_+ ") es correcta. ");
				}
				else
					System.out.println(" Conexion fallida." );
				} catch ( SQLException e) { e.printStackTrace();}
				catch ( ClassNotFoundException e) { e.printStackTrace();}
				catch ( Exception e) { e.printStackTrace();}
			
				return sentencia;
			}
}

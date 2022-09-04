package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
//import java.sql.ResultSet;
import java.util.Scanner;


class Conexion {
	
	private static Connection con;

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
	
	
		//String sql = "SELECT REGION_ID, REGION_NAME FROM regions ";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el id de la region:");
		String region_id = sc.next();
		
		System.out.println("Introduce el nombre de la region:");
		String region_name = sc.next();
		
		System.out.println("La region a dar de alta es: " + region_id + "  " + region_name);
		
		Statement sentencia = conectarBD();
		
		if(sentencia != null) {
			System.out.println("Conexión correcta");
		}
		
		String sql = "INSERT INTO regions (REGION_ID,REGION_NAME) VALUES ('"+region_id+ "' , '"+region_name+"')";
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
		String db_ = "hrdb" ;
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


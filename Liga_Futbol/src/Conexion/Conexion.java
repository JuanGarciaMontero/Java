package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
	
	public static String bd="futbol";
	public static String login = "root";
	public static String pass ="";
	
	public static String url = "jdbc:mysql://localhost:3306/"+bd;
	public static Connection conn;
	public static Statement sentencia;
	
	public static boolean buscarRutCli;
	
	public static void conectar (){
		
		try {
		
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, login, pass);
				System.out.println("Conexion establecida con "+bd);
		} catch (Exception e) {
			System.out.println("Problema al conectar");
			
		}
		
	}
	
	public static void desconectar () throws SQLException  {
		
		conn.close();
	}

}
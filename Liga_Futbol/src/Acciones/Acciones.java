package Acciones;

import java.sql.ResultSet;

import Conexion.Conexion;

public class Acciones{

	private int id_equi, id_jug, id_arb;
	private String nombre_equi, presi;
	private String nombre_jug, apellido_jug, posicion_jug, equipo_jug;
	private String nombre_arb, apellido_arb, posicion_arb;
	


	public int getId_equi() {
		return id_equi;
	}

	public void setId_equi(int id_equi) {
		this.id_equi = id_equi;
	}

	public int getId_jug() {
		return id_jug;
	}

	public void setId_jug(int id_jug) {
		this.id_jug = id_jug;
	}

	public int getId_arb() {
		return id_arb;
	}

	public void setId_arb(int id_arb) {
		this.id_arb = id_arb;
	}

	public String getNombre_equi() {
		return nombre_equi;
	}

	public void setNombre_equi(String nombre_equi) {
		this.nombre_equi = nombre_equi;
	}

	public String getPresi() {
		return presi;
	}

	public void setPresi(String presi) {
		this.presi = presi;
	}

	public String getNombre_jug() {
		return nombre_jug;
	}

	public void setNombre_jug(String nombre_jug) {
		this.nombre_jug = nombre_jug;
	}

	public String getApellido_jug() {
		return apellido_jug;
	}

	public void setApellido_jug(String apellido_jug) {
		this.apellido_jug = apellido_jug;
	}

	public String getPosicion_jug() {
		return posicion_jug;
	}

	public void setPosicion_jug(String posicion_jug) {
		this.posicion_jug = posicion_jug;
	}

	public String getEquipo_jug() {
		return equipo_jug;
	}

	public void setEquipo_jug(String equipo_jug) {
		this.equipo_jug = equipo_jug;
	}

	public String getNombre_arb() {
		return nombre_arb;
	}

	public void setNombre_arb(String nombre_arb) {
		this.nombre_arb = nombre_arb;
	}

	public String getApellido_arb() {
		return apellido_arb;
	}

	public void setApellido_arb(String apellido_arb) {
		this.apellido_arb = apellido_arb;
	}
	
	public String getPosicion_arb() {
		return posicion_arb;
	}

	public void setPosicion_arb(String posicion_arb) {
		this.posicion_arb = posicion_arb;
	}

	
	
	public Acciones(String nombre_equi, String presi) {

		this.nombre_equi = nombre_equi;
		this.presi = presi;
	}
	


	public Acciones(String nombre_jug, String apellido_jug, String posicion_jug, String equipo_jug ) {

		this.nombre_jug = nombre_jug;
		this.apellido_jug = apellido_jug;
		this.posicion_jug = posicion_jug;
		this.equipo_jug = equipo_jug;
	}
	
	
	public Acciones(String nombre_arb, String apellido_arb, String posicion_arb ) {

		this.nombre_arb = nombre_arb;
		this.apellido_arb = apellido_arb;
		this.posicion_arb = posicion_arb;

	}


	
	public void imprimirEquipo() {
		System.out.println("ID: "+this.getId_equi());
		System.out.println("Nombre Equipo: "+this.getNombre_equi());
		System.out.println("Presidente: "+this.getPresi());
	}
	
	public void imprimirJugador() {
		System.out.println("ID: "+this.getId_jug());
		System.out.println("Nombre Jugador: "+this.getNombre_jug());
		System.out.println("Apellido Jugador: "+this.getApellido_jug());
		System.out.println("Posicion Jugador: "+this.getPosicion_jug());
		System.out.println("Equipo Jugador: "+this.getEquipo_jug());
	}
	
	public void imprimirArbitro() {
		System.out.println("ID: "+this.getId_arb());
		System.out.println("Nombre Arbitro: "+this.getNombre_arb());
		System.out.println("Apellido Arbitro: "+this.getApellido_arb());
		System.out.println("Posicion Arbitro: "+this.getPosicion_arb());
	}

	
	public void guardarEquipo() {
		
		try {
			String strSql = "insert into futbol1 values ("+id_equi+",'"+nombre_equi+"','"+presi+"')";
			Conexion.conectar();
			Conexion.sentencia = Conexion.conn.prepareStatement(strSql);
			Conexion.sentencia.execute(strSql);
			System.out.println("Datos Almacenados");
			Conexion.desconectar();
			
		}catch (Exception e) {
			System.out.println("Error en el metodo guardar equipo");	
		}
	}
	
	public void guardarJugador() {
		
		try {
			String strSql = "insert into futbol2 values ("+id_jug+",'"+nombre_jug+"','"+apellido_jug+"','"+posicion_jug+"','"+equipo_jug+"')";
			Conexion.conectar();
			Conexion.sentencia = Conexion.conn.prepareStatement(strSql);
			Conexion.sentencia.execute(strSql);
			System.out.println("Datos Almacenados");
			Conexion.desconectar();
			
		}catch (Exception e) {
			System.out.println("Error en el metodo guardar jugador");	
		}
	}
	
	public void guardarArbitro() {
		
		try {
			String strSql = "insert into futbol3 values ("+id_arb+",'"+nombre_arb+"','"+apellido_arb+"','"+posicion_arb+"')";
			Conexion.conectar();
			Conexion.sentencia = Conexion.conn.prepareStatement(strSql);
			Conexion.sentencia.execute(strSql);
			System.out.println("Datos Almacenados");
			Conexion.desconectar();
			
		}catch (Exception e) {
			System.out.println("Error en el metodo guardar arbitro");	
		}
	}
	
	
	
	
	
	public void cargarRutEquipo() {
		
		try {
			Conexion.buscarRutCli=false;
			String strSql = "select * from futbol1 where nombre_equi = '"+nombre_equi+"'";
			Conexion.conectar();
			Conexion.sentencia=Conexion.conn.prepareStatement(strSql);
			ResultSet objRes = Conexion.sentencia.executeQuery(strSql);
			if (objRes.next()) {
				Conexion.buscarRutCli=true;
				nombre_equi = objRes.getString(2);
				presi = objRes.getString(3);

				
			}
			Conexion.desconectar();
			
			
		} catch (Exception e) {
			
			System.out.println("Error al buscar el equipo");
				
		}
		
		
	}
	
public void cargarRutJugador() {
		
		try {
			Conexion.buscarRutCli=false;
			String strSql = "select * from futbol2 where nombre_jug = '"+nombre_jug+"'";
			Conexion.conectar();
			Conexion.sentencia=Conexion.conn.prepareStatement(strSql);
			ResultSet objRes = Conexion.sentencia.executeQuery(strSql);
			if (objRes.next()) {
				Conexion.buscarRutCli=true;
				nombre_jug = objRes.getString(2);
				apellido_jug = objRes.getString(3);
				posicion_jug = objRes.getString(4);
				equipo_jug = objRes.getString(5);

				
			}
			Conexion.desconectar();
			
			
		} catch (Exception e) {
			
			System.out.println("Error al buscar el jugador");
				
		}
		
		
	}

public void cargarRutArbitro() {
	
	try {
		Conexion.buscarRutCli=false;
		String strSql = "select * from futbol3 where nombre_arb = '"+nombre_arb+"'";
		Conexion.conectar();
		Conexion.sentencia=Conexion.conn.prepareStatement(strSql);
		ResultSet objRes = Conexion.sentencia.executeQuery(strSql);
		if (objRes.next()) {
			Conexion.buscarRutCli=true;
			nombre_arb = objRes.getString(2);
			apellido_arb = objRes.getString(3);
			posicion_arb = objRes.getString(4);	
		}
		Conexion.desconectar();
		
		
	} catch (Exception e) {
		
		System.out.println("Error al buscar el arbitro");
			
	}
	
	
}
	

	
	public void actualizar_equipo() {
		
		try {
			String strSql = "update futbol1 set nombre_equi='"+nombre_equi+"',presi='"+presi+"'where nombre_equi='"+nombre_equi+"'"; 
			Conexion.conectar();
			Conexion.sentencia=Conexion.conn.prepareStatement(strSql);
			Conexion.sentencia.execute(strSql);
			System.out.println("Equipo actualizado: "+nombre_equi+presi);
			Conexion.desconectar();
		} catch (Exception e) {
			System.out.println("Error al actualizar el equipo");			
			
		}
		
			
		
	}
	
	public void actualizar_jugador() {
		
		try {
			String strSql = "update futbol2 set  nombre_jug='"+nombre_jug+"',apellido_jug='"+apellido_jug+"',posicion_jug='"+posicion_jug+"',equipo_jug='"+equipo_jug+"'where nombre_jug='"+nombre_jug+"'"; 
			Conexion.conectar();
			Conexion.sentencia=Conexion.conn.prepareStatement(strSql);
			Conexion.sentencia.execute(strSql);
			System.out.println("Jugador actualizado: "+nombre_jug+apellido_jug+posicion_jug+equipo_jug);
			Conexion.desconectar();
		} catch (Exception e) {
			System.out.println("Error al actualizar el jugador");			
			
		}
		
			
		
	}
	
	public void actualizar_arbitro() {
		
		try {
			String strSql = "update futbol3 set nombre_arb='"+nombre_arb+"', apellido_arb='"+apellido_arb+"',posicion_arb='"+posicion_arb+"'where nombre_arb='"+nombre_arb+"'"; 
			Conexion.conectar();
			Conexion.sentencia=Conexion.conn.prepareStatement(strSql);
			Conexion.sentencia.execute(strSql);
			System.out.println("Arbitro actualizado: "+nombre_arb+apellido_arb+posicion_arb);
			Conexion.desconectar();
		} catch (Exception e) {
			System.out.println("Error al actualizar el arbitro");			
			
		}
		
			
		
	}
	
	public void borrar_equipo() {
		
		try {
			String strSql = "delete from futbol1 where nombre_equi='"+nombre_equi+"'"; 
			Conexion.conectar();
			Conexion.sentencia=Conexion.conn.prepareStatement(strSql);
			Conexion.sentencia.execute(strSql);
			System.out.println("Equipo eliminado: " +nombre_equi);
			Conexion.desconectar();
		} catch (Exception e) {
			System.out.println("Error al eliminar el equipo");			
			
		}
		
		
	}
	
	public void borrar_jugador() {
		
		try {
			String strSql = "delete from futbol2 where nombre_jug='"+nombre_jug+"'"; 
			Conexion.conectar();
			Conexion.sentencia=Conexion.conn.prepareStatement(strSql);
			Conexion.sentencia.execute(strSql);
			System.out.println("Jugador eliminado: " +nombre_jug+apellido_jug+posicion_jug+equipo_jug);
			Conexion.desconectar();
		} catch (Exception e) {
			System.out.println("Error al eliminar el jugador");			
			
		}
		
		
	}
	
	public void borrar_arbitro() {
		
		try {
			String strSql = "delete from futbol3 where nombre_arb='"+nombre_arb+"'"; 
			Conexion.conectar();
			Conexion.sentencia=Conexion.conn.prepareStatement(strSql);
			Conexion.sentencia.execute(strSql);
			System.out.println("Arbitro eliminado: " +nombre_arb+apellido_arb);
			Conexion.desconectar();
		} catch (Exception e) {
			System.out.println("Error al eliminar el arbitro");			
			
		}
		
		
	}
	

public void todo_equipo() {
		
		try {
			String strSql = "select * from futbol1"; 
			Conexion.conectar();
			Conexion.sentencia=Conexion.conn.prepareStatement(strSql);
			Conexion.sentencia.execute(strSql);
			System.out.println("Mostrar todo los Equipos");
			Conexion.desconectar();
		} catch (Exception e) {
			System.out.println("Error al mostrar todos los equipos");			
			
		}
		
		
	}

public void todo_jugador() {
	
	try {
		String strSql = "select * from futbol2"; 
		Conexion.conectar();
		Conexion.sentencia=Conexion.conn.prepareStatement(strSql);
		Conexion.sentencia.execute(strSql);
		System.out.println("Mostrar todo los Jugadores");
		Conexion.desconectar();
	} catch (Exception e) {
		System.out.println("Error al mostrar todos los jugadores");			
		
	}
	
	
}

public void todo_arbitros() {
	
	try {
		String strSql = "select * from futbol3"; 
		Conexion.conectar();
		Conexion.sentencia=Conexion.conn.prepareStatement(strSql);
		Conexion.sentencia.execute(strSql);
		System.out.println("Mostrar todo los Arbitros");
		Conexion.desconectar();
	} catch (Exception e) {
		System.out.println("Error al mostrar todos los arbitros");			
		
	}
	
	
}




}

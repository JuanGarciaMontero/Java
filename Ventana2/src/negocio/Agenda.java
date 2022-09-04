package negocio;

import java.sql.ResultSet;

import datos.Conexion;

public class Agenda {
	
	private int id;
	private String nombre;
	private String telefono;
	private String ciudad;
	
	
	public Agenda(String nombre) {

		this.nombre = nombre;


	}
	
	public Agenda(String nombre, String telefono, String ciudad) {

		this.nombre = nombre;
		this.telefono = telefono;
		this.ciudad = ciudad;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre,String telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public void imprimirCliente() {
		System.out.println("ID: "+this.getId());
		System.out.println("Nombre: "+this.getNombre());
		System.out.println("Telefono: "+this.getTelefono());
		System.out.println("Ciudad: "+this.getCiudad());
	}
	public void imprimirCliente2() {

		System.out.println("Nombre: "+this.getNombre());
		System.out.println("Telefono: "+this.getTelefono());
	}
	
	public void guardarCliente() {
		
		try {
			String strSql = "insert into agenda values ('"+id+"','"+nombre+"','"+telefono+"','"+ciudad+"')";
			Conexion.conectar();
			Conexion.sentencia = Conexion.conn.prepareStatement(strSql);
			Conexion.sentencia.execute(strSql);
			System.out.println("Datos Almacenados");
			Conexion.desconectar();
			
		}catch (Exception e) {
			System.out.println("Error en el metodo guardar cliente");	
		}
	}
	
	public void cargarRutCliete() {
		
		try {
			Conexion.buscarRutCli=false;
			String strSql = "select * from agenda where nombre = '"+nombre+"'";
			Conexion.conectar();
			Conexion.sentencia=Conexion.conn.prepareStatement(strSql);
			ResultSet objRes = Conexion.sentencia.executeQuery(strSql);
			if (objRes.next()) {
				Conexion.buscarRutCli=true;
				nombre = objRes.getString(2);
				telefono = objRes.getString(3);
				ciudad = objRes.getString(4);
				
			}
			Conexion.desconectar();
			
			
		} catch (Exception e) {
			
			System.out.println("Error al buscar el cliente");
				
		}
		
		
	}
	
public void cargarRutCliete2() {
		
		try {
			Conexion.buscarRutCli=false;
			String strSql = "select * from agenda where nombre = '"+nombre+"'";
			Conexion.conectar();
			Conexion.sentencia=Conexion.conn.prepareStatement(strSql);
			ResultSet objRes = Conexion.sentencia.executeQuery(strSql);
			if (objRes.next()) {
				Conexion.buscarRutCli=true;
				nombre = objRes.getString(2);
				telefono = objRes.getString(3);
				ciudad = objRes.getString(4);
			}
			Conexion.desconectar();
			
			
		} catch (Exception e) {
			
			System.out.println("Error al buscar el cliente");
				
		}
		
		
	}
	
	public void actualizar() {
		
		try {
			String strSql = "update agenda set nombre='"+nombre+"',telefono='"+telefono+"',ciudad='"+ciudad+"'where nombre='"+nombre+"'"; 
			Conexion.conectar();
			Conexion.sentencia=Conexion.conn.prepareStatement(strSql);
			Conexion.sentencia.execute(strSql);
			System.out.println("Cliente actualizado"+nombre+telefono+ciudad);
			Conexion.desconectar();
		} catch (Exception e) {
			System.out.println("Error al actualizar el cliente");			
			
		}
		
			
		
	}
	
	public void borrar() {
		
		try {
			String strSql = "delete from agenda where nombre='"+nombre+"'"; 
			Conexion.conectar();
			Conexion.sentencia=Conexion.conn.prepareStatement(strSql);
			Conexion.sentencia.execute(strSql);
			System.out.println("Cliente eliminar");
			Conexion.desconectar();
		} catch (Exception e) {
			System.out.println("Error al eliminar el cliente");			
			
		}
		
		
	}
	
public void todo() {
		
		try {
			String strSql = "select * from agenda"; 
			Conexion.conectar();
			Conexion.sentencia=Conexion.conn.prepareStatement(strSql);
			Conexion.sentencia.execute(strSql);
			System.out.println("Mostrar todo los Clientes");
			Conexion.desconectar();
		} catch (Exception e) {
			System.out.println("Error al mostrar todos los clientes");			
			
		}
		
		
	}

}

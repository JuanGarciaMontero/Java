package Persona;

public class ClasePersona {
	
	public String nombre;
	public int edad;
	public String DNI;
	public char sexo;
	public double peso;
	public double altura;
	
	public ClasePersona(String nombre,int edad, char sexo){
	
	this.nombre=nombre;
	this.edad=edad;
	this.sexo=sexo;

	}
	
	public ClasePersona(String nombre,int edad, char sexo, String DNI, double peso, double altura){
		
	this.nombre=nombre;
	this.edad=edad;
	this.sexo=sexo;
	this.DNI=DNI;
	this.peso=peso;
	this.altura=altura;
	
	}
	
	
	public boolean esMayorDeEdad() {
		return this.edad >= 18;
	}
	
	
	
	public boolean comrobarSexo() {
		return this.sexo == 'H';
	}
}
	
	
	

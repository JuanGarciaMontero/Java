package Persona;

class Persona {

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		
		ClasePersona Persona1 = new ClasePersona("Ana",22,'M');
		ClasePersona Persona2 = new ClasePersona("Pedro",16,'H');

		System.out.println(Persona1.nombre+" es hombre: " + Persona1.comrobarSexo());
		System.out.println(Persona2.nombre + " es hombre: " + Persona2.comrobarSexo());
		System.out.println(Persona1.nombre+" es mayor de 18 a�os: " +Persona1.esMayorDeEdad());
		System.out.println(Persona2.nombre+" es mayor de 18 a�os: "+Persona2.esMayorDeEdad());

	}

}

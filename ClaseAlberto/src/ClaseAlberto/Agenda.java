package ClaseAlberto;


import java.util.*;
import java.io.*;

class Ingresar{
	
	String nombre;
	String apellido;
	int telefono;
	
	Ingresar (String nombre, String apellido, int telefono){
		this.nombre=nombre;
		this.apellido=apellido;
		this.telefono=telefono;
	}
	
	String getNombre(){
		return this.nombre;
	}
	
	String getApellido() {
		return this.apellido;
	}
	
	int getTelefono() {
		return this.telefono;
	}
	
	String setNombre(String nombre){
		return this.nombre;
	}
	
	String setApellido(String apellido) {
		return this.apellido;
	}
	
	int setTelefono(int telefono) {
		return this.telefono;
	}
	
	static String datos () {
		
		String nombre;
		String apellido;
		int telefono;

		Scanner sc = new Scanner(System.in);
		System.out.println("Dame el nombre: ");
		nombre=sc.nextLine();
		System.out.println("Dame el apellido: ");
		apellido=sc.nextLine();
		System.out.println("Dame telefono: ");
		telefono=sc.nextInt();
		
		FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("C:/Pruebas_Eclipse/agenda.txt");
            pw = new PrintWriter(fichero);
            for (int a = 0; a < 3; a++)
                pw.println(nombre);
            	pw.println(" " + apellido);
            	pw.println("  " + telefono);
            	pw.println("  ");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           
           if (null != fichero)
               fichero.close();//cierre del fichero
           } catch (Exception e2) {
              e2.printStackTrace();
           }
		
           return nombre;
		
		
	}
	
	
	
}

class Agenda {

	public static void main(String[] args) {

		int num=-1;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Escribe una opcion: ");
		System.out.println("1:Ingresar datos ");
		System.out.println("2: Modificar datos ");
		System.out.println("3: Borrar datos ");
		System.out.println("4: Ver todos la Agenda ");
		System.out.println("5: Buscar en Agenda ");
		System.out.println("0: Finalizar ");
		num=sc.nextInt();

        String dayString;
         
        switch (num)
        {
            case 1:  dayString = "Ingresar";
                     break;
            case 2:  dayString = "Modificar";
                     break;
            case 3:  dayString = "Borrar";
                     break;
            case 4:  dayString = "Todo";
                     break;
            case 5:  dayString = "Buscar";
            		 break;
            default: dayString = "Número NO válido";
                     break;
        }
        if (dayString=="Ingresar") {
        Ingresar.datos();}
        
        
		}while(num==0);
		
		System.out.println("FIN DEL PROGRAMA");

		}
	}

}


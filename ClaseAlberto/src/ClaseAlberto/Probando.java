package ClaseAlberto;
import java.io.*;

public class Probando {
/*
	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
	
		metodo1();
		
	}
		
		static public void metodo1() {
			metodo2();
			try {
				int i,j;
				i=1;
				j=0;
				System.out.println(i/j);
				
			}
			catch(Exception e) {System.out.println("Esta operacio es incorrecta1");
			
			}finally {System.out.println("Programa terminado445542");}	
		
		}
			
		 static public void metodo2() {
			
	
			try {
				int i,j;
				i=1;
				j=0;
				System.out.println(i/j);
				
			}
			catch(Exception e) {System.out.println("Esta operacio es incorrecta2");
			
			}finally {System.out.println("Programa terminado");}
		}
		
	
	}
		



*/
public static void main ( String [] args) {
	double x = 15.0;
	double y = 0;
	try {
	System.out.println("El resultado de la division real de " + x +
					   "  entre " + y + " es " + division_real(x,y));
	}
	catch(Exception mi_excepcion) {
		System.out.println ("Has intentado dividir por 0.0");
		System.out.println("El objeto excepcion lanzado:  " +
							mi_excepcion.toString());
	}
}

public static double division_real( double dividendo, double divisor) throws Exception{
	
	
		double aux;
	if ( divisor !=0) {
		aux= dividendo/divisor;
	}
	else {
		throw new Exception();
	}
	return aux;
	
}
}
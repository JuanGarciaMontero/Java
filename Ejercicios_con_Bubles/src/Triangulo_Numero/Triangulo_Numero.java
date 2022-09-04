package Triangulo_Numero;

import java.util.Scanner;

class Triangulo_Numero {

	/*
	Escribe un programa en Java que muestre un patrón como el 
	que se muestra en el triangulo según el número que introduzca el usuario.

	*/
	
	public static void main(String[] args){
	
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número de filas: ");
		int filas = sc.nextInt();
		
		//Bucles anidados
		
		for(int i=1; i <= filas; i++){
			for(int j=1; j<=i; j++){
			System.out.print(j);}
		System.out.println("");
		}
		
		
			
	}
	
	
	
	
	
}
package Aritmetic;

import java.util.Scanner;

class Aritmetic {
	
	public static int suma (int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
	public static int resta (int num1, int num2, int num3) {
		return num1 - num2 - num3;
	}


	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		
		int primero, segundo, tercero;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un n�mero:");
		primero = sc.nextInt();
		System.out.println("Introduce un otro n�mero:");
		segundo = sc.nextInt();
		System.out.println("Introduce un n�mero m�s:");
		tercero = sc.nextInt();
		System.out.println("Los 3 numeros suman" + suma(primero,segundo,tercero));
		System.out.println(primero + "+" + segundo + "+" + tercero +"=" + suma (primero,segundo,tercero));
		System.out.println(primero + "-" + segundo + "-" + tercero +"=" + resta (primero,segundo,tercero));
		
		
	}

}

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
		// TODO Apéndice de método generado automáticamente
		
		int primero, segundo, tercero;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número:");
		primero = sc.nextInt();
		System.out.println("Introduce un otro número:");
		segundo = sc.nextInt();
		System.out.println("Introduce un número más:");
		tercero = sc.nextInt();
		System.out.println("Los 3 numeros suman" + suma(primero,segundo,tercero));
		System.out.println(primero + "+" + segundo + "+" + tercero +"=" + suma (primero,segundo,tercero));
		System.out.println(primero + "-" + segundo + "-" + tercero +"=" + resta (primero,segundo,tercero));
		
		
	}

}

package Digitos;

	/*
	Escribe un programa en Java que lea un entero positivo y cuente el número de digitos menor de 10 mil

	*/
	import java.util.Scanner;
	class Digitos { 
	
	public static void main(String[] args){
	
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número entero menor que diez mil millones: ");
		
		long numero = sc.nextLong();
		int digitos=0;
		
		if (numero>= 10000000000L){
		
		System.out.println("Error. Debe introducir un número entero menor que diez mil millones.");
		}
		else{
		
			if (numero <= 0) {
				numero *= -1;}
			}
			if (numero > 0 && numero <10){
				digitos = 1;  }
			
			if (numero > 0 && numero <100){
				digitos = 2; }
			if (numero > 0 && numero <1000){
				digitos = 3;	}
			if (numero > 0 && numero <10000){
				digitos = 4;}	
			if (numero > 0 && numero <100000){
				digitos = 5;				
			}
			System.out.println("El número de digitos es: "+ digitos);
			
				
		}
	
	
	}
	
	

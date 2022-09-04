package NumeroPI;

import java.util.Scanner;

class NumeroPI {

	public static void main(String[] args) {
		/* Crea un programa en lenguaje C# que permita hacer el 
		 * c�lculo del n�mero pi a trav�s del sistema que prefieras. 
		 * Aporta el c�digo y las capturas del programa que permitan 
		 * ver el resultado. Comenta el c�digo donde sea necesario.
		 * Pi/4 = +1/1 -1/3 + 1/4 - 1/5.......-1/n
		*/
		Scanner sc = new Scanner(System.in);
		
		System.out.println ("Cuantos decimales quieres del numero PI: ");
		int a = sc.nextInt();
		System.out.println ("El Numero PI: "+numeropi(a));	
		
	}
	public static double numeropi (int a) {
		
		int d=1, s=1;
		double n, b=0;
		
		for (int i=1;i<=a;i++) {
			n=(double)1/d*s;
			b += n;
			d += 2;
			s *= -1;
		}
		return b*4;
		
	}
}

package Factorial;
import java.util.Scanner;
class Factorial {

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		
		/*Realiza un programa que calcule el factorial de un n�mero
		 *dado por el usuario. Aporta el c�digo y capturas del resultado.
		 *n!=n*.....4*3*2*1=m
		 */
			Scanner sc = new Scanner(System.in);
			
			System.out.println ("Escribe un numero entero para darte el factorial: ");
			int a = sc.nextInt();
			System.out.println ("El Factorial de "+a+" es: "+factorial(a));	
			
		}
		public static int factorial (int a) {
			int f =1;
			for (int i=1;i<=a;i++) {
				f *= i;			
			}
			return f;
			
		}
	}


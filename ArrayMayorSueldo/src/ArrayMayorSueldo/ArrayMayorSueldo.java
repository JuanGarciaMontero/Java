/*
 * Crea de forma libre un ejemplo en Java
 *  en el que puedas utilizar matrices en modo de texto.
 *   Se valorar� la originalidad y la eficiencia del programa.
 *   
 *   Leer nombre y sueldo de 5 empleados y mostrar el que m�s gana
 *   
 */
package ArrayMayorSueldo;
import java.util.Scanner;
class ArrayMayorSueldo {

	public static void main(String[] args) {
		
		//Creo un nuevo objeto de la clase Scanner, para
		//recojer los datos introducidos por teclado.
		Scanner sc = new Scanner(System.in);
		
		/*
		 * Creo dos arrays nuevos, uno de numeros y otro de sueldos.
		 * Cada uno tendr� 5 elementos.
		 */
		
		String nombres[] = new String[5];
		Double sueldos[] = new Double[5];
		
		/*
		 * Creo dos variables una cadena de texto String para 
		 * recoger el mayor nombre y
		 * otra numerica con decimales Double para recojer
		 * el mayor sueldo.
		 */
		
		String nombreMayor;
		Double sueldoMayor;
		
		int i=0;
		
		/*
		 * Pido por teclado que me den el nombre y sueldo de 5 empleados
		 */
		
		System.out.println("Dar nombre y sueldo de los 5 empleados: ");
		/*
		 * Pido el nombre y sueldo del primer elemento del array
		 *  e igualo a nombre y sueldo mayor
		 */
		System.out.println("Nombre "+(i+1)+": ");
		nombres[i]=sc.nextLine();
		System.out.println("Sueldo: "+(i+1)+": ");
		sueldos[i]=sc.nextDouble();
		
		nombreMayor=nombres[i];
		sueldoMayor=sueldos[i];
		
		/*
		* Mediante un bucle recorro el array pidiendo primero
		* el nombre y despues el sueldo de los 4 empleados restantes
		*/
		
		for(i=1;i<nombres.length;i++){
			
			sc.nextLine();// Para limpiar el buffer
		
			System.out.println("Nombre "+(i+1)+": ");
				nombres[i]=sc.nextLine();
			System.out.println("Sueldo: ");
				sueldos[i]=sc.nextDouble();
			
			/*
			 * Con este condicional busco el mayor sueldo.
			 */
		
			if(sueldos[i]>=sueldoMayor){	
				sueldoMayor=sueldos[i];
				nombreMayor=nombres[i];		
			}
	
		}
		/*
		 * Imprimo por pantalla el nombre del empleado de mayor sueldo
		 * y el mayor sueldo
		 */
		
		System.out.println("Empleado con mayor sueldo: " + nombreMayor );                                         
	    System.out.println("Sueldo: " + sueldoMayor);

	}

}

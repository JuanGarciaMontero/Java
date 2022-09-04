package ClaseAlberto;
import java.util.Scanner;
public class clase09052022 {
	
	public static void main(String[] args) {
		int miArray[] = new int[8];
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuantas celdas quiere desplazar a la derecha?");
		int desplazamiento = sc.nextInt();
		int miArray2[] = new int[desplazamiento];
		
		
		/*Recorro el array desde la posicion 0 a la última (longuitud de mi array - 1 ó penúltima posición) creciendo
		//miArray se carga, si es array 8 y 2 desplazamientos; comienza en la posición 0 hasta la posicón 7.
		//Si los números introducidos son: 1,2,3,4,5,6,7,8 -> así quedaría miArray	*/
		for (int i = 0; i < miArray.length; i++) {
		    System.out.println("Introduce un número ");
		      miArray[i] = sc.nextInt();
		     }
		
		
		/*Recorro el array desde la última posición menos uno hasta la última posición menos el desplazamiento decreciendo
		//Por tanto, en un array de 8 y 2 desplazamientos; comienzo en la posicion 7 del array hasta la 6.
		//i=7 -> 7-8+2=1; la posicion 7 la guardo en la 1. i=6 -> 6-8+2=0; la posicion 6 la guardo en la 0.
		//Si los números introducidos son: 1,2,3,4,5,6,7,8 -> el numero 7 y 8 pasan  a la posición 0 y 1 del array.
		//miArray2 Quedaría: 7,8,_,_,_,_,_,_ */
		for (int i = miArray.length - 1;      i >= miArray.length - desplazamiento;                       i--) {
					//posicion final			//longuitud array - desplazamiento		              //decreciendo
												//para saber cuantos numeros del final pasan delante
		        miArray2[i - miArray.length + desplazamiento] = miArray[i];
		            /*posicion final - longuitud array (8) + despalzamiento(2)
		        	//para empezara posicionando el último número en la posicion inicial + desplazamiento
		        	//cargo miArray2*/
		        }
		
		
		 /*Recorro el array desde la última posicion menos uno menos el desplazamiento hasta 0 decreciendo
		 //Por tanto, en un array de 8 y 2 desplazamientos; comienzo en la posicion 5 del array hasta la 0.
		 //i=5 -> 5+2=7; la posición 5 la guardo en la 7.
		 //i=4 -> 4+2=6; la posición 4 la guardo en la 6.
		 //i=3 -> 3+2=5; la posición 3 la guardo en la 5.
		 //i=2 -> 2+2=4; la posición 2 la guardo en la 4.
		 //i=1 -> 1+2=3; la posición 1 la guardo en la 3.
		 //i=0 -> 0+2=2; la posición 0 la guardo enn la 2.
		 //Si los números introducidos son: 1,2,3,4,5,6,7,8 -> 
		 //el numero 1 pasa a la posicion 2 o donde esta el 3
		 //el numero 2 pasa a la posicion 3 o donde esta el 4
		 //el numero 3 pasa a la posicion 4 o donde esta el 5
		 //el numero 4 pasa a la posicion 5 o donde esta el 6
		 //el numero 5 pasa a la posicion 6 o donde esta el 7
		 //el numero 6 pasa a la posicion 7 o donde esta el 8
		 //myArray Quedaria: _,_,1,2,3,4,5,6  (en este caso las dos primeras posiciones de myArray
		 // no estaría vacía ya que antes tenía los números 1 y 2; en las posiciones 0 y 1;
		 // no importan porque luego esas posicioes las machaco con miArray2*/
		 for (int i = miArray.length - 1 - desplazamiento;           i >= 0;                    i--) {
			 	/* longuitud array (8) - 1 - desplazamiento(2)		//hasta posicion inicial      //decreciendo
			 	// para saber cual es la posición para comenzar
			    // la posicion comenzar = (longuitud array(8) - 1 ) - el desplazamiento(2) */
		            miArray[i + desplazamiento] = miArray[i];
		            /*posición a comenzar + desplazamiento(2)
		            // la posicion a comenzar la llevo al final del array (8) posicion 7
		            // posición a comenzar 5 + desplazamiento(2) = 7
		            //cargo miArray*/
		        }
		 
		 
		 /*Recorro el array desde la posicion 0 hasta el desplazamiento -1 creciendo
	     //Por tanto, en un array de 8 y 2 desplazamientos; comienzo en la posicion 0 del array hasta la posicion 7 (penúltima)
	     //i=0 de miArray = miArray2 así hasta la posición 7.
	     //Si los númeeros introducidos son: 1,2,3,4,5,6,7,8 ->
	     //miArray quedaría: 7,8,1,2,3,4,5,6	*/ 
		 for (int i = 0;               i <= desplazamiento - 1;                            i++) {
			 //posicion inicial      //hasta desplazamiento - 1                     // creciente
			 						 // posicion final del primer numero desplazado
		            miArray[i] = miArray2[i];
		            //cargo array miArray con todas las posiciones y machaco con las posiciones de miArray2 
		        }
		 
		 
		 //Imprimo miArray
		 for (int j = 0; j < miArray.length; j++) {

		      System.out.print(miArray[j]);
		      
		        }
		    }

		}

package Notas_alumnos;
import java.util.*;
/*
 Leer por teclado la nota de los alumnos de una clase y 
 calcular la nota media del grupo. Mostar los alumnos con
  notas superiores a la media.
 */
class Notas_alumnos {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		int alum, i;
		double suma=0, media, nota;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Numero de alumnos de la clase: ");
			alum = sc.nextInt();
		}while (alum <=0);
		
		
		double[]notas = new double[alum];
	
		for(i=0;i<notas.length;i++) {
		
			System.out.println("El alumno "+(i+1)+" tiene la nota: ");
			notas[i]= sc.nextDouble();
		}
		
		for(i=0;i<notas.length;i++) {
			
			suma += notas[i];
			
		}
		
		media = suma / notas.length;
		
		System.out.printf("%n Nota media del curso: %.2f %n", media);
		
		System.out.println(" ");
		System.out.println("Alumnos con notas superiores a la media: ");
		
		for(i=0;i<notas.length;i++) {
			
			if(notas[i]>media) {
			
				System.out.printf("%n Alumno numero "+(i+1)+" tiene una nota superior a la media de "+notas[i]+"%n");
				
			}
			
		}		
		

	}

}

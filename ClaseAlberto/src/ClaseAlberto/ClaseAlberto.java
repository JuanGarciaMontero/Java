package ClaseAlberto;
import java.util.*;
class ClaseAlberto {
	
	//ORDENAR ARRAY  

	/*public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner sc = new Scanner(System.in);
		int array[]= new int [5];
		for(int i=0;i<array.length;i++) {
			System.out.println("Escribe un numero "+(i+1)+" : ");
			array[i]=sc.nextInt();}
		int mayor=array[0];*/
		
		/*for(int j=1;j<array.length;j++) {
				if(mayor<array[j]) {
					mayor=array[j];}else {
						mayor=array[j];
					}
				}
		
		System.out.println("El mayor numero es  "+mayor);	*//*
		System.out.print("El Array es: (");
		for(int x=0;x<array.length;x++) {
		System.out.print(" "+array[x]+"");}
				
		System.out.print(" )");
		/*
		 * Dos bucles que recorran el array.
		 * 
		 *  - El primero recorre el array desde la primera posición hasta la penúltima.
		 *  - El segundo recorre el array desde la segunda posición hasta la última.
		 *  
		 *  Comparo la posicion primera con la  posicon segunda del array
		 *   y si se cumple entro al if.
		 *   
		 *   Cambio de posicion en el bucle.
		 *   
		 *   Necesito una variable auxiliar. A esta la asigno la posicion del primer blucle.
		 *   La posicion del primer bucle le asigno la posicion del segundo bucle.
		 *   La posicion del segundo bucle le asigno la posicion del auxiliar.
		 *  
		 *//*
		for(int i=0;i<(array.length-1);i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    
                    int aux=array[i];
                    array[i]=array[j];
                    array[j]=aux;
                }
                
                }
		}
		System.out.println(" ");
		System.out.print          ("El Array de menor a mayor es: (");
        for(int h=0;h<array.length;h++) {
        System.out.print(" "+array[h]+" ");
        }
        System.out.println(" )");
		
	}
	
	

}*/


	    public static void main(String[] args) {
	        Scanner scUser = new Scanner(System.in);
	        int[] lista = new int[5];
	        int aux;
	        //boolean contador;
	        System.out.println("Introduce el primer número");
	        lista[0] = scUser.nextInt();
	        for(int i = 1; i < lista.length; i++) {
	            System.out.println("Introduce el número " + (i+1));
	            aux = scUser.nextInt();
	            //boolean contador = true;
	            if(lista[i] == 0 && aux >= lista[0] ) {
	                lista[i] = aux;
	            }
	            for (int j = 0; j < i; j++){
	                if (lista[j] >= aux) {
	                    //contador = false;
	                    for(int k = lista.length-1; k > j; k--) {
	                        lista[k] = lista[k-1];
	                        
	                    }
	                    lista[j] = aux;
	                    
	                    
	                }
	                break;
	            }
	                
	        }
	        scUser.close();
	        for (int a : lista) {
	            System.out.print(a +", ");
	        }
	    }

	}

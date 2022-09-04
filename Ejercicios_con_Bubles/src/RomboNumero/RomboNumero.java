package RomboNumero;

	/*
	*Escribe un programa en Java que muestre un 
	*patrón como el que se muestra en el triangulo 
	*según el número que introduzca el usuariao.
	*/
	import java.util.Scanner;
	class RomboNumero { 
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número de filas: ");
		int filas = sc.nextInt();
		
		//Bucles anidados
		
		for(int i=1; i <= filas; i++){
			int espaciosBlanco = filas -i;
			for (int k=1; k<=espaciosBlanco;k++){
			System.out.print(" ");		
			
			}
		for(int j=1; j<=i; j++){
					System.out.print(j);
					
			}
		for(int l=i; l>1; l--){
				System.out.print(l-1);
			}
			
			System.out.println("");
			
		
		}
		
		for(int i=filas-1; i >= 1; i--){
			int espaciosBlanco2 = filas - i;
			for (int k=1; k <= espaciosBlanco2 ;k++){
			System.out.print(" ");		
			
			}
		for(int j=1; j<=i; j++){
					System.out.print(j);
					
			}
		for(int l=i; l>1; l--){
				System.out.print(l-1);
			}
			
			System.out.println("");
			
		
		}
		
			
	}
	
}	
	
	
	


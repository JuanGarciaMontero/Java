package ArrayOrdena;
class ArrayOrdena {

	public static void main(String[] args) {

		

				int[] numero={20,12,23,17,7,8,10,2,1,0};
				int mayor=0;

					for(int i=0; i < numero.length; i++) {

						if (numero[i]%2==0) {
							
							System.out.println("El numero: " + numero[i] + " es par");}
						else
							{
							System.out.println("El numero: " + numero[i] + " es impar");				
				
							}
						mayor=numero[0];
						for(int j=1;j<numero.length;j++) {
							if(mayor<numero[j]) {
								mayor=numero[j];}else {
									continue;
								}
							}
					
		
			}
					System.out.println(" ");
					System.out.println("El mayor numero es  "+mayor);
					
					for(int i=0;i<(numero.length-1);i++){
			            for(int j=i+1;j<numero.length;j++){
			                if(numero[i]>numero[j]){
			                    
			                    int aux=numero[i];
			                    numero[i]=numero[j];
			                    numero[j]=aux;
			                }
			                
			                }
					}
					System.out.println(" ");
					System.out.print          ("El Array de menor a mayor es: (");
			        for(int h=0;h<numero.length;h++) {
			        System.out.print(" "+numero[h]+" ");
			        }
			        System.out.println(" )");
					
	}	
}
				 
					
					

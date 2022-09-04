package Radio;

public class Radio {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		/*Construir un programa que, dado el radio de una esfera, calcule y devuelva por 
		pantalla el valor de la superficie y el volumen de la esfera correspondiente. */
		
		double radio=10;
		double superficie;

		
		superficie = 4 * Math.PI * Math.pow(radio, radio);
		
		double volumen= 4/3*Math.PI * Math.pow(radio, 3);
		
		System.out.println("La Superficie de la esfera es = " + superficie);
		
		System.out.println("El Volumen de la esfera es = " + volumen);
				
		 

	}

}

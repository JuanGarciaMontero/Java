package Areayperimetrocuadrado;

public class AreayPerimetro {
	
	double lado;

	
	public AreayPerimetro(double lado) {
	
	 this.lado=lado;

	}
	
	 public double area() {
		 
		 return lado*lado;
	 }
	 public double perimetro() {
		 
		 return 4*lado;
	 }
	 
	 
}

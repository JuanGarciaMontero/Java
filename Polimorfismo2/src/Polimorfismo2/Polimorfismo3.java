package Polimorfismo2;

public class Polimorfismo3 extends Polimorfismo2{
    
    private double lado;
    
    public Polimorfismo3(double l){
        super("cuadrado");
        this.lado = l;
    }
    

    
    public double getArea() {
        return this.lado * this.lado;
    }
    
    
    
     public double getPerimetro() {
        return 4 * this.lado;
    }

     
     
    public String toString() {
        return super.toString() + " Cuadrado: {" + " lado = " + lado + " "+"}";
    }
        


	public static void main(String[] args) {
	
		Polimorfismo2 unaFigura = new Polimorfismo2("una figura");
		Polimorfismo3 unCuadrado = new Polimorfismo3(5.0);
	        System.out.println("Area de la figura:  " + unaFigura.getArea());
	        System.out.println("Area del cuadrado: " + unCuadrado.getArea());
	        System.out.println("Perimetro del cuadrado: " + unCuadrado.getPerimetro());
	        unCuadrado.setArea(unCuadrado.getArea());
	        unCuadrado.setPerimetro(unCuadrado.getPerimetro());
	        System.out.println(unaFigura.toString());
	        System.out.println(unCuadrado.toString());
	}

}

package Poligono_Triangulo;

interface calculoPoligono {

	double calcularArea();

	double calcularHipo();

	double calcularPerimetro();

	double calcularDiagonal();

	/*
	 * Añadir una clase más que sea cuadrado, 2 constructores y uno con argumentos,
	 * usar todos los métodos
	 */

}

class Cuadrado implements calculoPoligono{
	
	double lado;
	double hipo2;
	
	Cuadrado (double l){
		
		this.lado=l;
			
	}
	
	Cuadrado (Cuadrado c){
		
		this.lado=c.getlado();
		
	}
	
	double getlado() {
		
		return this.lado;
		
	}
	
	@Override
	public double calcularArea() {
		return (lado*lado);
	}

	@Override
	public double calcularHipo() {
		this.hipo2 = (Math.sqrt(2 * Math.pow(lado, 2)));
		return this.hipo2;
	}
	
	@Override
	public double calcularDiagonal() {
		this.hipo2 = (Math.sqrt(2 * Math.pow(lado, 2)));
		return this.hipo2;
	}

	@Override
	public double calcularPerimetro() {
		return (4*lado);
	}
	
	
}

class Triangulo implements calculoPoligono {

	double base;
	double altura;
	double hipo;

	Triangulo() {
		this.base = 1;
		this.altura = 1;
	}

	Triangulo(double b, double h) {

		this.base = b;
		this.altura = h;
	}

	Triangulo(Triangulo t) {

		this.base = t.getBase();
		this.altura = t.getAltura();
	}

	double getBase() {
		return this.base;
	}

	double getAltura() {
		return this.altura;
	}

	@Override

	public double calcularArea() {
		return (base * altura / 2);

	}

	@Override
	public double calcularHipo() {

		this.hipo = (Math.sqrt(Math.pow(altura, 2) + Math.pow(base, 2)));
		return this.hipo;
	}

	@Override
	public double calcularDiagonal() {
		return 0;
	}

	@Override
	public double calcularPerimetro() {
		return 0;
	}

}

public class Poligono_Triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangulo t1 = new Triangulo(3, 4);
		Triangulo t2 = new Triangulo();
		Triangulo t3 = t1;
		Triangulo t4 = new Triangulo(t1);
		// System.out.println(t1.base);
		// System.out.println(t2.base);
		// System.out.println(t3.base);
		t1.base = t1.base + 1;
		t3.base = t3.base + 1;
		// System.out.println(t1.base);
		// System.out.println(t3.base);

		// System.out.println(t4.base);

		// System.out.println(t1.calcularArea());
		//t4.calcularHipo();
		System.out.println("TRIANGULO: ");
		System.out.println();
		System.out.println("La Hipotenusa del triangulo despues de sumar a la base 1  y");
		System.out.println("luego 1, es decir con una base de 5 : "+t4.calcularHipo());
		Cuadrado c1 = new Cuadrado (5);
		Cuadrado c2= new Cuadrado (c1);
		System.out.println();
		System.out.println("CUADRADO: ");
		System.out.println();
		System.out.println("Area del Cuadrado con primer constuctor: "+c1.calcularArea());
		System.out.println("Area del Cuadrado con segundo constuctor: "+c2.calcularArea());
		System.out.println("Hipotenusa del Cuadrado con primer constuctor: "+c1.calcularHipo());
		System.out.println("Diagonal del Cuadrado con primer constuctor: "+c1.calcularDiagonal());
		System.out.println("Perimetro del Cuadrado con primer constuctor: "+c1.calcularPerimetro());
		
	}

}

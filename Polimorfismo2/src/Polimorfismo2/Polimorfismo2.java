package Polimorfismo2;

/* Polimorfismo din�mico.
 * 	
 * Los m�todos (de Polimorfismo3) de la clase que hereda 
 * (Polimorfismo3 hereda de Polimorfismo2),
 * y m�todos heredados de Polimorfismo2
 * son recogidos 
 * pero se desarrollan los m�todos de la clase que hereda;
 * es decir se desarrollan los m�todos de Polimorfismo3 
 * 
 * Los m�todos Polimorfismo2 y Polimorfismo3 se llaman igual
 * y tienen los mismos par�metros.
 * 
 */

public class Polimorfismo2 {
    private String nombreFigura;
    private double area;
    private double perimetro;
    
    public Polimorfismo2(String nombre){
        this.nombreFigura = nombre;
    }
    public String getNombreFigura() {
        return nombreFigura;
    }
    public void setNombreFigura(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }
    
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public double getPerimetro() {
        return perimetro;
    }
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    
    public String toString() {
        return "Polimorfismo2{" + "nombreFigura = " + nombreFigura + ", area = " + area + ", perimetro = " + perimetro + "}";
    }

}

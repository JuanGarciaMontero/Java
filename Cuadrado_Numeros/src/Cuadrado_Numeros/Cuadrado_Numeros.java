package Cuadrado_Numeros;

import java.util.Scanner;


 class Poligono {
		int numero_lados;
		int long_base;
		int longitud_lados;
		int area;

		Poligono(int lados,int longitud) {
		numero_lados=lados;
		longitud_lados=longitud;
		}

		Poligono() {
		numero_lados=4;
		long_base=7;
		}

		public int calcular_area () {
		area=longitud_lados*longitud_lados;
		return area;
		}

		}

		public class Cuadrado_Numeros {



		/**
		* @param args the command line arguments
		*/
		public static void main(String[] args) {
		// TODO code application logic here
		Poligono p1=new Poligono();
		System.out.println(p1.numero_lados);

		Poligono p2=new Poligono();
		p2.long_base=p2.long_base*10;
		System.out.println(p1.long_base);
		System.out.println(p2.long_base);

		Poligono p3=new Poligono (13,20);

		p2.long_base=p2.long_base*10;
		System.out.println(p3.calcular_area());
		}

		}
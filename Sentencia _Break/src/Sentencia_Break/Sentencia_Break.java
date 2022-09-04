package Sentencia_Break;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
class Sentencia_Break {

	public static void main(String[] args) throws IOException {
		// TODO Apéndice de método generado automáticamente
	/*	
		//Sentencia_Break
		for (int j = 1; j <= 10; j++) {
			if (j == 8) {
			break;
			}
			System.out.println("Soy: "+j);
			}
		
		//Sentencia_Continue
		int a;
		for(a=0; a<=5;a++) {
		if (a == 3) {
		continue;
		}
		System.out.println(a);
		}
		*/
		/*System.out.printf("El número %d no tiene decimales.\n", 21);
		System.out.printf("El número %f sale con decimales.\n", 21.0); 
		System.out.printf("El %.3f sale exactamente con 3 decimales.\n", 21.0);
		System.out.println(" Artículo      Precio/caja Nº cajas"); System.out.println("	");
		System.out.printf("%-10s	%8.2f	%6d\n", "manzanas", 4.5, 10);
		System.out.printf("%-10s	%8.2f	%6d\n", "peras", 2.75, 120);
		System.out.printf("%-10s	%8.2f	%6d\n", "aguacates", 10.0, 6);
		System.out.println("	");
		System.out.printf("%-1s	 %5.3f  %2d\n", "prueba", 77.0, 15);
		int x; x = 100;

		System.out.println(x + " " + (x + 5) + " " + (x - 5));
		System.out.println((x * 5) + " " + (x / 5) + " " + (x % 5));
		

		Scanner sc = new Scanner(System.in);
		System.out.print("Por favor, dime cómo te llamas: "); String nombre = sc.nextLine();
		System.out.println("Hola " + nombre + ", ¡encantado de conocerte!");
		
		System.out.print("Introduce tu nombre: "); String nombre2 = sc.nextLine();

		System.out.print("Introduce tu edad: ");
		//int edad = Integer.parseInt(sc.nextLine());
		int edad = sc.nextInt();

		System.out.println("Tu nombre es " + nombre2 + " y tu edad es " + edad);*/
		
		

		/*

		double positivos = 0.0;
		double negativos = 0.0;
		int ceros = 0;
		double media_positivos;
		double media_negativos;
		int sum1 = 0;
		int sum2 = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("introduce 10 numeros");

		for (int i = 0; i < 10; i++) {
			int usuario = sc.nextInt();

			if (usuario > 0) {
				positivos++;
				sum1 += usuario;

			} else if (usuario < 0) {
				negativos++;
				sum2 += usuario;
			} else
				ceros++;

		}
		
	
		media_positivos = sum1/positivos;
		media_negativos = sum2/negativos;
		
		System.out.println("La media de positivos es " + ": " + media_positivos);
		System.out.println("La media de negativos es " + ": " + media_negativos);
		System.out.println("Los ceros han sido " + ": " + ceros);*/
		
		
		/*
		boolean a = true; 
		boolean b = false;
		System.out.println("a = " + a); 
		System.out.println("b = " + b); 
		System.out.println("a && b = " + (a && b)); 
		System.out.println("a || b = " + (a || b)); 
		System.out.println("!a = " + !a);
		System.out.println("a || (6 > 10) = " + (a || (6 > 10)));
		System.out.println("((4 <= 4) || false) && (!a) = " + (((4 <= 4) || false) && (!a)));
		 */
		
		/*Escribe un programa que diga cuál es la última cifra de un número entero introducido por teclado.

		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe un numero entero por teclado: ");
		int num = sc.nextInt();
		

			System.out.print("El último dígito es: "+ (num % 10));
		*/		
		
		/*Escribe un programa que muestre la tirada de tres dados. 
		 * Se debe mostrar también la suma total (los puntos que suman entre los tres dados).
		
		System.out.println("Muestra la tirada de tres dados al azar de 6 caras:");
		int dado1 = (int)(Math.random()*6) + 1;
		int dado2 = (int)(Math.random()*6) + 1;
		int dado3 = (int)(Math.random()*6) + 1;
		int suma=dado1+dado2+dado3;
		
		for (int i=1; i<=3; i++) {
		
		switch(i) {
		case 1: System.out.println(dado1); break;
		case 2: System.out.println(dado2); break;
		case 3:System.out.println(dado3); break;
		default:
				}
		
			}
		
		System.out.println("Muestra la suma total de los tres dados: "+suma);*/
		
		
		/*Realiza un programa que muestre al azar el nombre de una carta de la baraja 
		 * francesa. Esta baraja está dividida en cuatro palos: picas, corazones, diamantes y tréboles. 
		 * Cada palo está formado por 13 cartas, de las cuales 9 cartas son numerales y 4 literales:
		 *  2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el 1). Para convertir un número en una
		 *   cadena de caracteres podemos usar String.valueOf(n).
		 
		System.out.println("Muestra al azar el nombre de una carta de la baraja francesa:");
		int palo = (int)(Math.random()*4) + 1;

		int i = (int)(Math.random()*13) + 1;
		
		
		if (i!=1 || i!=11|| i!=12|| i!=13){
			switch(palo) {
				case 1: System.out.println(i+" picas"); break;
				case 2: System.out.println(i+" corazones"); break;
				case 3: System.out.println(i+" diamantes"); break;
				case 4: System.out.println(i+" tréboles"); break;
				default:
						}
		
				}
		
		
		if (i==1) {
				char ch1 = 'A';
		        String str_x =String.valueOf(ch1);
        			switch(palo) {
        				case 1: System.out.println(str_x+" picas"); break;
        				case 2: System.out.println(str_x+" corazones"); break;
        				case 3: System.out.println(str_x+" diamantes"); break;
        				case 4: System.out.println(str_x+" tréboles"); break;
        				default:
    							}
		}
		if (i==11) {
			char ch11 = 'J';
	        String str_x =String.valueOf(ch11);
    			switch(palo) {
    				case 1: System.out.println(str_x+" picas"); break;
    				case 2: System.out.println(str_x+" corazones"); break;
    				case 3: System.out.println(str_x+" diamantes"); break;
    				case 4: System.out.println(str_x+" tréboles"); break;
    				default:
							}	
		}
		if (i==12) {
			char ch12 = 'Q';
	        String str_x =String.valueOf(ch12);
        		switch(palo) {
        			case 1: System.out.println(str_x+" picas"); break;
        			case 2: System.out.println(str_x+" corazones"); break;
        			case 3: System.out.println(str_x+" diamantes"); break;
        			case 4: System.out.println(str_x+" tréboles"); break;
        			default:
        					}
	
		}

		if (i==13) {
			char ch13 = 'K';
	        String str_x =String.valueOf(ch13);
	        	switch(palo) {
	        		case 1: System.out.println(str_x+" picas"); break;
	        		case 2: System.out.println(str_x+" corazones"); break;
	        		case 3: System.out.println(str_x+" diamantes"); break;
	        		case 4: System.out.println(str_x+" tréboles"); break;
	        		default:
	        				}
					}
		*/
	
		/*
		String[] color = {"rojo", "amarillo", "verde", "blanco", "azul", "negro"}; 
		System.out.println("Generador aleatorio de banderas");
		Scanner s = new Scanner(System.in);

		System.out.print("¿Cuántas franjas quiere para la bandera? ");
		int franjas = Integer.parseInt(s.nextLine());

		System.out.println("	");
		for (int i = 0; i < franjas; i++) { System.out.println(color[(int)(Math.random() * 6)]);
		System.out.println("	");
		*/
		
		/*Arrays bidimensionales
		int[][] n = new int[3][2]; // array de 3 filas por 2 columnas

		n[0][0]=20;
		n[1][0]=67;
		n[1][1]=33;
		n[2][1]=7;

		int fila, columna;
		for(fila = 0; fila < 3; fila++)
			{ System.out.print("Fila: " + fila);
		
		for(columna = 0; columna < 2; columna++) {
			System.out.printf("%10d ", n[fila][columna]);
				}
		System.out.println();
		}*/

		//JUEGO DE LAS MINAS
		
		// se definen constantes para representar el
		// contenido de las celdas final int VACIO = 0; final int MINA = 1;
		/*
		final int VACIO = 0; 
		final int MINA = 1;
		final int TESORO = 2;
		final int INTENTO = 3;



		int x;
		int y;
		int[][] cuadrante = new int[5][4];

		// inicializa el array
		for(x = 0; x < 4; x++) {
			for(y = 0; y < 3; y++) 
			{ cuadrante[x][y] = VACIO;
				}
			}
		// coloca la mina
		int minaX = (int)(Math.random() * 5); 
		int minaY = (int)(Math.random() * 4); 
		cuadrante[minaX][minaY] = MINA;

		// coloca el tesoro
		int tesoroX; 
		int tesoroY; 
		do {
			tesoroX = (int)(Math.random() * 5);
			tesoroY = (int)(Math.random() * 4);
			} while ((minaX == tesoroX) && (minaY == tesoroY)); 
				cuadrante[tesoroX][tesoroY] = TESORO;

		// juego
		System.out.println("¡BUSCA EL TESORO!");
		 


		boolean salir = false; 
		String c = "";
	do {
		// pinta el cuadrante
			for(y = 3; y >= 0; y--)
				{ System.out.print(y + "|");
					for(x = 0; x < 5; x++) {
						if (cuadrante[x][y] == INTENTO)
							{ System.out.print("X ");
							} 
						else { System.out.print(" ");
							}
					}
					System.out.println();
				}
		System.out.println(" ----------\n 0 1 2 3 4\n");
		Scanner sc = new Scanner(System.in);
		// pide las coordenadas
		System.out.print("Coordenada x: ");
		x = sc.nextInt();
		System.out.print("Coordenada y: ");
		y = sc.nextInt();

		// mira lo que hay en las coordenadas indicadas por el usuario
				switch(cuadrante[x][y]) {
					case VACIO:
							cuadrante[x][y] = INTENTO;
							break; 
					case MINA:
						System.out.println("Lo siento, has perdido."); salir = true;
						break; 
					case TESORO:
						System.out.println("¡Enhorabuena! ¡Has encontrado el tesoro!"); salir = true;
						break; 
					default:
				}
	} while (!salir);

		// pinta el cuadrante
			for(y = 3; y >= 0; y--) {
				System.out.print(y + " ");
				for(x = 0; x < 5; x++) {
					switch(cuadrante[x][y]) {
						case VACIO:
							c = " ";
							break; 
						case MINA:
							c = "* ";
							break;
						case TESORO:
							c = "€ ";
							break; 
						case INTENTO:
							c = "X ";
							break; 
							default:
							}
					System.out.print(c);
				}
				System.out.println();
			}
		System.out.println(" ----------\n 0 1 2 3 4\n");
		*/
		/* PAR O IMPAR EN PRINTLN
		int A = 14;
        System.out.println(A + (A%2==0 ? " es par " : " es impar "));                                             
		*/
		/*
		 Scanner sc = new Scanner(System.in);
	        int N;
	        System.out.print("Introduzca valor de N: ");
	        N = sc.nextInt();  //supondremos que el número introducido tiene 5 cifras                                 
	        System.out.println(N%10);
	        System.out.printf("%02d %n",N%100);
	        System.out.printf("%03d %n",N%1000);
	        System.out.printf("%04d %n",N%10000);
	        System.out.printf("%05d %n",N);
		
	        double q = 1.0/3.0;
	        System.out.printf ("1.0/3.0 = %5.3f %n", q);
	        System.out.printf ("1.0/3.0 = %7.5f %n", q);
	        q = 1.0/2.0;
	        System.out.printf ("1.0/2.0 = %09.3f %n", q);
	        q = 1000.0/3.0;
	        System.out.printf ("1000/3.0 = %7.1e h%n", q);
	        q = 3.0/4567.0;
	        System.out.printf ("3.0/4567.0 = %7.3e %n", q);
	        q = -1.0/0.0;
	        System.out.printf ("-1.0/0.0 = %7.2e %n", q);
	        q = 0.0/0.0;
	        System.out.printf ("0.0/0.0 = %5.2e %n", q);
	        System.out.printf ("pi = %5.3f, e = %10.4f %n", Math.PI, Math.E);
	        double r = 1.1;
	        System.out.printf
	               ("C = 2 * %1$5.5f * %2$4.1f, "+"A = %2$4.1f * %2$4.1f * %1$5.5f %n",Math.PI, r);
	   */
		
		/* SABER CARACTER MAYUSCULA CON SYSTEM.IN.READ Y CON CHARACTER,ISUPPERCASE()
		char car;
		System.out.print("Introduzca un carácter: ");
        car = (char) System.in.read(); //lee un solo caracter

        if (Character.isUpperCase(car)) //utilizamos el método isUpperCase de la clase Character        
        {
            System.out.println("Es una letra mayúscula");
        } else {
            System.out.println("No es una letra mayúscula");
        }
        */
		/* Ejemplo contador de cifras con bucle do while para continuar o no el programa
		Scanner sc = new Scanner(System.in);
        int n, cifras;
        char car;
        do{
            System.out.print("Introduce un número entero: ");
            n = sc.nextInt();
            cifras= 0;    //esta variable es el contador de cifras
            while(n!=0){             //mientras a n le queden cifras
                    n = n/10;         //le quitamos el último dígito
                   cifras++;          //sumamos 1 al contador de cifras
            }
            System.out.println("El número tiene " + cifras+ " cifras");
            System.out.print("Continuar? ");
            car = (char)System.in.read();
        }while(car!='n' && car != 'N'); 
		*/
		//Pasar numero decimal a binario
		/* int numero, exp, digito;
	        double binario;
	        Scanner sc = new Scanner(System.in);

	        do{ 
	            System.out.print("Introduce un numero entero >= 0: ");                                                
	            numero = sc.nextInt();
	        }while(numero < 0);

	        exp=0;
	        binario=0;
	        while(numero!=0){
	                digito = numero % 2;           
	                binario = binario + digito * Math.pow(10, exp);                                                   
	                exp++;
	                numero = numero/2;
	        }
	        System.out.printf("Binario: %.0f %n", binario);
		*/
		/* Muestra por pantalla el valor de un String pasando de cadena a float
		String cadenaPI = "3.1416";
		System.out.println(Float.valueOf(cadenaPI));
		*/
		
		//Escritura de un fichero de texto
		
		      /*    FileWriter fichero = null;
		         PrintWriter pw = null;
		         try
		         {
		              fichero = new FileWriter("C:/Pruebas_Eclipse/prueba.txt");
		             pw = new PrintWriter(fichero);
		             for (int a = 0; a < 5; a++)
		                 pw.println("Escribe Línea " + a);
		         } catch (Exception e) {
		             e.printStackTrace();
		         } finally {
		            try {
		            
		            if (null != fichero)
		                fichero.close();//cierre del fichero
		            } catch (Exception e2) {
		               e2.printStackTrace();
		            }
		
		         }*/
		         /* Lee y escribe por pantalla un archivo*/
		        /* File fichero2 = new File ("C:/Pruebas_Eclipse/prueba.txt");
		         FileReader fr = new FileReader (fichero2);
		         BufferedReader br = new BufferedReader(fr);
		         String linea = br.readLine();
		         // Solo imprimimos la primera linea de texto del archivo
		         System.out.println("Lee y escribe en pantalla el archivo prueba.txt: " + linea);*/
		      
		// Creacion de archivos
			/*try {
			  // Creamos el objeto que encapsula el fichero
			  File fichero = new File("C:/Pruebas_Eclipse/prueba2.txt");
			  // A partir del objeto File creamos el fichero físicamente
			  if (fichero.createNewFile())
			        System.out.println("El fichero se ha creado correctamente");
			 else
			       System.out.println("No se ha podido crear el fichero");
			} catch (Exception ioe) {
			      ioe.getMessage();
			}*/
			
		// Eliminacion de archivos
			
			/*File fichero = new File("C:/Pruebas_Eclipse/prueba2.txt");
			if (fichero.exists())
			    fichero.delete();
			*/
		
		// Crear un directorio
		
			/*try {
			// Declaración de variables
			       String directorio = "C:\\pruebas";
			       String varios = "C://carpeta11/carpeta12/carpeta13";
			// Crear un directorio
			       boolean exito = (new File(directorio)).mkdir();
			       if (exito)
			       System.out.println("Directorio: " + directorio + " creado");
			// Crear varios directorios
			      exito = (new File(varios)).mkdirs();
			      if (exito)
			          System.out.println("Directorios: " + varios + " creados");
			}catch (Exception e){
			      System.err.println("Error: " + e.getMessage());
			}*/
		
		// Cadena más larga contenida en un ArrayList de Strings.
		/*
		ArrayList<String> cadenas = new ArrayList();
		pedircadenas(cadenas);
		System.out.println("La cadena de caracteres mayor es: " + mayorcadena(cadenas));
	}
		public static void pedircadenas(ArrayList<String> cadenas){
			
			Scanner sc = new Scanner(System.in);
			String s;
			boolean masCadenas;
			
			do {
				masCadenas=true;
				System.out.println("Introduce una cadena de caracteres, FIN(terminar): ");
				s = sc.nextLine();
				if (s.equalsIgnoreCase("FIN")) {
					masCadenas=false;	
				}
				else {
					cadenas.add(s);		
				}
			}while (masCadenas);
			
		}
		
		public static String mayorcadena (ArrayList<String> cadenas) {
			
			String mayor = cadenas.get(0);
			for(int i=1;i<cadenas.size();i++) {
				
				mayor = cadenas.get(i);
			}		
			return mayor;
		}
	}
			
		*/
		
		
		//DIVIDIR DOS NUMEROS ENTEROS POSITIVOS DE FORMA RECUSIVA
		
		/*
		   Scanner sc = new Scanner(System.in);
	        int n1, n2;
	        System.out.print("Introducir dividendo: ");
	        n1 = sc.nextInt();
	        do {
	            System.out.print("Introducir divisor (>0): ");
	            n2 = sc.nextInt();
	        } while (n1 <= 0);
	        System.out.printf("%d/%d = %d %n", n1, n2, cociente(n1, n2));
	    }

	    public static int cociente(int a, int b) {
	        if (a < b)
	            return 0;
	        else
	            return 1 + cociente(a - b, b);
		*/
		
		
		
		
	        }
}
	    


	

	




package String_ArrayList;
import java.util.*;
class String_ArrayList {

	public static void main(String[] args) {

		// Cadena m�s larga contenida en un ArrayList de Strings.
				
				ArrayList<String> cadenas = new ArrayList<String> ();
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
						if(valueof(cadenas.get(0)) > valueof(cadenas.get(i))){
						mayor = cadenas.get(i);}
						else {mayor = cadenas.get(0);}
					}		
					return mayor;
				}
	private static int valueof(String string) {
		// TODO Auto-generated method stub
		return 0;
	}
		

	}

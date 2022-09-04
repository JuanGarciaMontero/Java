package Agenda;

import java.util.*;
import java.io.*;


class Ingresar{
	
	String nombre;
	String apellido;
	int telefono;
	
	Ingresar (String nombre, String apellido, int telefono){
		this.nombre=nombre;
		this.apellido=apellido;
		this.telefono=telefono;
	}
	
	String getNombre(){
		return this.nombre;
	}
	
	String getApellido() {
		return this.apellido;
	}
	
	int getTelefono() {
		return this.telefono;
	}
	
	String setNombre(String nombre){
		return this.nombre;
	}
	
	String setApellido(String apellido) {
		return this.apellido;
	}
	
	int setTelefono(int telefono) {
		return this.telefono;
	}
	
	static int datos () {
		
		String nombre;
		String apellido;
		int telefono;
		int num=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame el nombre: ");
		nombre=sc.nextLine();
		System.out.println("Dame el apellido: ");
		apellido=sc.nextLine();
		System.out.println("Dame telefono: ");
		telefono=sc.nextInt();
		
		FileWriter fichero = null;
        PrintWriter pw = null;
        PrintWriter pw1 = null;
        try
        {	
        	if(fichero!=null) {
            fichero = new FileWriter("C:/Pruebas_Eclipse/agenda.txt");
            pw = new PrintWriter(fichero);
            pw.println(nombre +" "+ apellido+"  "+ telefono);
            
            
        	}
        	else {
        		
        		File file = new File("C:/Pruebas_Eclipse/agenda.txt");
        		fichero = new FileWriter(file.getAbsoluteFile(), true);
        		pw1 = new PrintWriter(fichero);
        		
                pw1.println(nombre +" "+ apellido +"  " + telefono);
                
        			}
        } catch (Exception e) {
            e.printStackTrace();
        } 
           try {
           
           if (null != fichero)
               fichero.close();//cierre del fichero
           } catch (Exception e2) {
              e2.printStackTrace();
           }
		
           return num;
		
		
	}
        
        public static void GuardarArchivo(){
        	try
        	        {
        		FileWriter fichero = new FileWriter("C:/Pruebas_Eclipse/agenda.txt");
        		PrintWriter     escrive = new PrintWriter(fichero);
        	            for(int i=0;i<lineas.size();i++){
        	            escrive.println(lineas.elementAt(i));
        	            }
        	            fichero.close();
        	        } catch (Exception e) {
        	            e.printStackTrace();
        	        } 
        	}
      public static void GuardarArchivo(Vector<String> ln){
        	try
        	        {
        	           FileWriter fichero = new FileWriter("C:/Pruebas_Eclipse/agenda.txt");
        	           PrintWriter escrive = new PrintWriter(fichero);
        	            for(int i=0;i<ln.size();i++){
        	            escrive.println(ln.elementAt(i));
        	            }
        	            fichero.close();
        	        } catch (Exception e) {
        	            e.printStackTrace();
        	        } 
        	}
        	private static Vector <Object>lineas=new Vector<Object>();
			private static Scanner sc;
        	public static void LeerArchivo(){
        	System.out.println("Leyendo archivo");
        	try { 
        		File archivo = new File ("C:\\Pruebas_Eclipse\\agenda.txt");
        		FileReader  fr = new FileReader (archivo);
        		BufferedReader br = new BufferedReader(fr);
        	        String linea;
        	        while((linea=br.readLine())!=null){
        	        System.out.println(linea);
        	        }
        	        br.close(); 
        	        fr.close();
        	       } catch (Exception e) { 
        	           System.out.println(e); 
        	       } 
        	}
        	
        	
        	public static void BorrarLinea(int n){
        		Vector<String>lineas=new Vector<String>();
        		try { 
        		File archivo = new File ("C:\\Pruebas_Eclipse\\agenda.txt");
        		       FileReader fr = new FileReader (archivo);
        		       BufferedReader br = new BufferedReader(fr);
        		        String linea; int cont=0;
        		        while((linea=br.readLine())!=null){
        		        cont++;
        		        if(cont!=n){
        		        lineas.addElement(linea);//AGREGAR LINEAS A UN VECTOR
        		        }
        		        }
        		        br.close(); 
        		        fr.close();
        		        //Se guarda de nuevo el archivo
        		        GuardarArchivo(lineas);
        		        lineas.clear();
        		      } catch (Exception e) { 
        		          System.out.println(e); 
        		      } 
        		}
        	
        	public static void ModificarLinea(int n){
        		Vector<String>lineas=new Vector<String>();
        		try { 
        		File archivo = new File ("C:\\Pruebas_Eclipse\\agenda.txt");
        		       FileReader fr = new FileReader (archivo);
        		       BufferedReader br = new BufferedReader(fr);
        		        String linea; int cont=0;
        		        while((linea=br.readLine())!=null){
        		        cont++;
        		        if(cont==n) {Ingresar.datos();}
        		        if(cont!=n){
        		        lineas.addElement(linea);//AGREGAR LINEAS A UN VECTOR
        		        }
        		        }
        		        br.close(); 
        		        fr.close();
        		        //Se guarda de nuevo el archivo
        		        GuardarArchivo(lineas);
        		        lineas.clear();
        		      } catch (Exception e) { 
        		          System.out.println(e); 
        		      } 
        		}
        	
        	public static void BuscarLinea(String linea){
        		try { 
            		File archivo = new File ("C:\\Pruebas_Eclipse\\agenda.txt");
            		FileReader  fr = new FileReader (archivo);
            		BufferedReader br = new BufferedReader(fr);
            	  
            	        linea=br.readLine();
            	        System.out.println(br.readLine());
            	        
            	        br.close(); 
            	        fr.close();
            	       } catch (Exception e) { 
            	           System.out.println(e); 
            	       } 
        		
        		}
        			
	
	
}

class Agenda {
	
	private static BufferedReader lee=new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args)throws IOException {

		int num=-1;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Escribe una opcion: ");
		System.out.println("1: Ingresar datos ");
		System.out.println("2: Modificar datos ");
		System.out.println("3: Borrar datos ");
		System.out.println("4: Ver toda la Agenda ");
		System.out.println("5: Buscar en Agenda ");
		System.out.println("0: Finalizar ");
		num=sc.nextInt();

        String dayString;

        switch (num)
        {
            case 1:  dayString = "Ingresar";
                     break;
            case 2:  dayString = "Modificar";
                     break;
            case 3:  dayString = "Borrar";
                     break;
            case 4:  dayString = "Todo";
                     break;
            case 5:  dayString = "Buscar";
            		 break;
            default: dayString = "Número NO válido";
                     break;
        }
        if (dayString=="Ingresar") {
        Ingresar.datos(); num=1;
       
        }
        
        if (dayString=="Todo") {
        	File doc = new File("C:\\Pruebas_Eclipse\\agenda.txt");

        	  BufferedReader obj = new BufferedReader(new FileReader(doc));

        	  String strng;
        	  while ((strng = obj.readLine()) != null)
        	    System.out.println(strng);
            
            num=4;

	        obj.close();
	        System.out.println(" ");
    		System.out.println("Pulsa 4 para continuar: ");
            num=sc.nextInt();
            
        	}
        
        	if (dayString=="Borrar") {
        		
        		System.out.println("Inserta el numero de linea a eliminar: ");
        		int n=Integer.parseInt(lee.readLine());
        		Ingresar.BorrarLinea(n);
        	}
        	
        	if (dayString=="Modificar") {
        		
        		System.out.println("Inserta el numero de linea a modificar: ");
        		int n=Integer.parseInt(lee.readLine());
        		Ingresar.ModificarLinea(n);
        	}
        	
        	if (dayString=="Buscar") {
        		
        		System.out.println("Inserta el nombre a buscar: ");
        		String linea = sc.next();
        		Ingresar.BuscarLinea(linea);
        		
        		  num=4;

      	        
      	        System.out.println(" ");
          		System.out.println("Pulsa 4 para continuar: ");
                  num=sc.nextInt();
        		
        	}
        	
        	
        	
        }
		while(num>=0 && num<5);
		
		System.out.println("FIN DEL PROGRAMA");
		
	}

}

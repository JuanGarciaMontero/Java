package Agenda;

import java.io.*;
import java.util.*;
public class Agenda2{
private static File archivo = null;
private static FileWriter fichero =null;
private static FileReader fr = null;
private static BufferedReader br = null;
private static PrintWriter escrive =null;
private static BufferedReader lee=new BufferedReader(new InputStreamReader(System.in));
public static void main(String []args) throws IOException{
int op=0;
while(true){
System.out.println("****SELECCIONE UNA OPCION****");
System.out.println("1.-Mostrar informacion del archivo. ");
System.out.println("2.-Eliminar una linea");
System.out.println("3.-Insertar una nueva linea");
System.out.println("4.-Salir");
op=Integer.parseInt(lee.readLine());//LEER LA OPCION
switch(op){
case 1:
LeerArchivo(true);
break;
case 2:
System.out.println("Inserta el numero de linea a eliminar");
int n=Integer.parseInt(lee.readLine());
BorrarLinea(n);
break;
case 3:
System.out.println("Inserta el texto de la linea a insertar");
String r=lee.readLine();
AgregarLinea(r);
break;
case 4:
return;
}
}
    }
public static void AgregarLinea(String r){
Vector LineasAux=new Vector();
LineasAux.addElement(r);
System.out.println("LEYENDO EL ARCHIVO...");
LeerArchivo(false);
for(int i=0;i<LineasNuevas.size();i++){
LineasAux.addElement(LineasNuevas.elementAt(i));//PASA LOS ELEMENTOS DEL ARCHIVO
}
GuardarArchivo(LineasAux);
}
public static void GuardarArchivo(Vector ln){
try
        {
            fichero = new FileWriter("c:/prueba.txt");
            escrive = new PrintWriter(fichero);
            for(int i=0;i<ln.size();i++){
            escrive.println(ln.elementAt(i));
            }
            fichero.close();
        } catch (Exception e) {
            e.printStackTrace();
        } 
}
public Vector LineasNuevas=new Vector();
public static void LeerArchivo(boolean b){
System.out.println("");
LineasNuevas.clear();
try { 
archivo = new File ("C:\\prueba.txt");
        fr = new FileReader (archivo);
        br = new BufferedReader(fr);
        String linea;
        while((linea=br.readLine())!=null){
        LineasNuevas.addElement(linea);
        if(b){
        System.out.println(linea);
        }
        }
        br.close(); 
        fr.close();
       } catch (Exception e) { 
           System.out.println(e); 
       } 
}
public static void BorrarLinea(int n){
Vector lineas=new Vector();
try { 
archivo = new File ("C:\\prueba.txt");
        fr = new FileReader (archivo);
        br = new BufferedReader(fr);
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
}

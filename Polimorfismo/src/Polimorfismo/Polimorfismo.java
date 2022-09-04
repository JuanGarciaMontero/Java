package Polimorfismo;
// Polimorfismo estático
//   Dos métodos llamados iguales que pasan
//   distinta cantidad de parametros o distintos 
//   parametros; pueden usarse indistintamente
//   en funcion de la peticion de parametros.

class Polimorfismo {
	
	
	public int sumar(int a, int b){
	        return a+b;
	    }
	    
	public int sumar(int a, int b, int c){
	        return a+b+c;
	    }

	
	public static void main(String[] args) {
		
		Polimorfismo objeto = new Polimorfismo();
        System.out.println("Resultado del llamado a sumar: " + objeto.sumar(1,2));
        System.out.println("Resultado del llamado a sumar: " + objeto.sumar(1,2,3));
	}

}

package CuentaCorriente;

import java.util.Scanner;

class CuentaCorriente {

	public static int DNI (int DNIentrada, int DNIsalida) {return DNIsalida;}
	public static char Nombre (char Nombreentrada, char Nombresalida) {return Nombresalida;}
	public static int Saldo(int Saldoentrada, int Saldosalida) {return Saldosalida;}
	String CrearCuenta, char SacarDinero, char IngresarDinero, char MostrarSaldo;
	

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		
		/*Dise�arlaclaseCuentaCorriente,quealmacenalosdatos:DNIynombredeltitular,as�comoelsaldo
		 * .Lasoperacionest�picasdeunacuentacorrienteson:
		 * 		�Crearunacuenta:senecesitaelDNIyelnombredeltitular.Elsaldoinicialser�0.
		 * 		�Sacardinero:elm�tododebeindicarsihasidoposiblellevaracabolaoperaci�n,siexistesaldosuficiente.
		 * 		�Ingresardinero:seincrementaelsaldo.
		 * 		�Mostrarinformaci�n:muestralainformaci�ndisponibledelacuentacorriente.
		 */
		
		int numero=0;
			Scanner sc = new Scanner(System.in);
		System.out.println("Cuenta corriente. Selecciona una de las siguiente operaciones:");
		System.out.println("Seleciona: 1->Crear Cuenta, 2->Sacar Dinero, 3->Ingresar Dinero, 4->Mostrar Saldo.");
			numero = sc.nextInt();
			 switch (numero) 
		        {
		        	case 1: numero=1; (CrearCuenta) ;
		        			break;;
		        	/*case 2: numero=2; char[] String = (SacarDinero) ;
        					break;;
		        	case 3: numero=1; char[] String = (IngresarDinero) ;
        					break;
		        	case 4: numero=1; char[] String= (ConsultarSaldo) ;
		        			break;*/
		        }
		
	}

}


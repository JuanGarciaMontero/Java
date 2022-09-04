package BankAccount;

import java.util.UUID;
/*Dise�arlaclaseCuentaCorriente,quealmacenalosdatos:DNIynombredeltitular,as�comoelsaldo
 * .Lasoperacionest�picasdeunacuentacorrienteson:
 * 		�Crearunacuenta:senecesitaelDNIyelnombredeltitular.Elsaldoinicialser�0.
 * 		�Sacardinero:elm�tododebeindicarsihasidoposiblellevaracabolaoperaci�n,siexistesaldosuficiente.
 * 		�Ingresardinero:seincrementaelsaldo.
 * 		�Mostrarinformaci�n:muestralainformaci�ndisponibledelacuentacorriente.
 */

public class BankAccount {

	//Atributos: DNI, nombre del titular, saldo
		private String cuentaID;
		private String documentoID;
		private String nombreTitular;
		private double saldo;

	//M�todo
		public void BankAccount (String documentoID, String nombreTitular)
		{
			this.cuentaID = UUID.randomUUID().toString();
			this.documentoID = documentoID;
			this.nombreTitular = nombreTitular;
			this.saldo = 0;
		}

		public boolean SacarDinero(double dinero){
	//Sacar dinero:
			if (dinero <= this.saldo) {
				return true;
			}
			else 
				return false;	
			}

	//Ingresar dinero

		public void IngresarDinero(double dinero){
		this.saldo = this.saldo + dinero;
		}
	//Mostrar informaci�n

		public void MostrarInformacion(){
			String mensaje ="Esta cuenta es de " + this.nombreTitular + "y tiene " + this.saldo + "euros.";

			System.out.println(mensaje);
		} 

}

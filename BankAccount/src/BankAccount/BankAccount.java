package BankAccount;

import java.util.UUID;
/*DiseñarlaclaseCuentaCorriente,quealmacenalosdatos:DNIynombredeltitular,asícomoelsaldo
 * .Lasoperacionestípicasdeunacuentacorrienteson:
 * 		•Crearunacuenta:senecesitaelDNIyelnombredeltitular.Elsaldoinicialserá0.
 * 		•Sacardinero:elmétododebeindicarsihasidoposiblellevaracabolaoperación,siexistesaldosuficiente.
 * 		•Ingresardinero:seincrementaelsaldo.
 * 		•Mostrarinformación:muestralainformacióndisponibledelacuentacorriente.
 */

public class BankAccount {

	//Atributos: DNI, nombre del titular, saldo
		private String cuentaID;
		private String documentoID;
		private String nombreTitular;
		private double saldo;

	//Método
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
	//Mostrar información

		public void MostrarInformacion(){
			String mensaje ="Esta cuenta es de " + this.nombreTitular + "y tiene " + this.saldo + "euros.";

			System.out.println(mensaje);
		} 

}

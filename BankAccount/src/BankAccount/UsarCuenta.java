package BankAccount;

class UsarCuenta {

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		BankAccount c;
		c = new BankAccount("324034B", "Gloria");
		
		if(c.SacarDinero(50.10)){
			System.out.println("Hay saldo");			
			}
			else
				
			System.out.println("No hay saldo");
		  c.IngresarDinero(505.45);
		  c.MostrarInformacion();
		  
		  if(c.SacarDinero(25.50)) {
			  
			 System.out.print("Hay saldo");
		  }

	}
		    

}

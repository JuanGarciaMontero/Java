package Aritmetic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AritmeticTest {

	@Test
	public void testSuma() {
			int resultado = Aritmetic.suma(5, 3, 2);
			int esperado = 10;
			assertEquals(esperado,resultado);
	}
	
	@Test		
	public void testResta() {
			int resultado = Aritmetic.resta(7, 3, 2);
			int esperado = 2;
				assertEquals(esperado,resultado);
	}

}

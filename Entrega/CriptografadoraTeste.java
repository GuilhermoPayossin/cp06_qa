import static org.junit.Assert.*;

import org.junit.Test;

public class CriptografadoraTeste {

	@Test
	public void testCaracterNaoMaiusculo() {
		Criptografadora cripta = new Criptografadora();
		int retornoEsperado = 0;
		int retornoReal = cripta.criptografa('x');
		assertEquals(retornoEsperado, retornoReal);
	}
	
	@Test
	public void testCaracterM() {
		Criptografadora cripta = new Criptografadora();
		int retornoEsperado = 14;
		int retornoReal = cripta.criptografa('M');
		assertEquals(retornoEsperado, retornoReal);
	}
	
	@Test
	public void testCaracterC() {
		Criptografadora cripta = new Criptografadora();
		int retornoEsperado = 71;
		int retornoReal = cripta.criptografa('C');
		assertEquals(retornoEsperado, retornoReal);
	}
}

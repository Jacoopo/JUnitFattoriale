import static org.junit.Assert.*;

import org.junit.Test;

public class Test1 {

	@Test
	public void testFattoriale1() {
		// fail("Not yet implemented");
		Fattoriale f = new Fattoriale();
		int n = 0;
		int risAtteso = 1;
		float risOttenuto = f.fattoriale(n);
		assertEquals(risAtteso, risOttenuto, 0.1);
		// diciamo quante cifre deve conrontare. In questo caso confronta solo la cifra
		// intera.
		// assertEquals(1, f.fattoriale(n));
	}

	@Test
	public void testFattoriale2() {
		// fail("Not yet implemented");
		Fattoriale f = new Fattoriale();
		int n = 1;
		int risAtteso = 1;
		float risOttenuto = f.fattoriale(n);
		assertEquals(risAtteso, risOttenuto, 0.1);
		// assertEquals(1, f.fattoriale(n));
	}

	@Test
	public void testFattoriale3() {
		// fail("Not yet implemented");
		Fattoriale f = new Fattoriale();
		int n = 4;
		int risAtteso = 24;
		float risOttenuto = f.fattoriale(n);
		assertEquals(risAtteso, risOttenuto, 0.1);
		// assertEquals(1, f.fattoriale(n));
	}
}

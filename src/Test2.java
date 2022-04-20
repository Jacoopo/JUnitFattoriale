import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Test2 {

	private Fattoriale f;
	private int n, risAtteso; 
	private float risOttenuto; 
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("@BeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("@AfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("@Before");
		f = new Fattoriale(); 
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("@After");
		assertEquals(risAtteso, risOttenuto, 0.1); //perché il risultato, ovviamente, viene dopo (after), poiché è il risultato finale.
	}

	@Test
	public void testFattoriale1() {
		// fail("Not yet implemented");
		//Fattoriale f = new Fattoriale();
		n = 0;
		risAtteso = 1;
		risOttenuto = f.fattoriale(n);
		//assertEquals(risAtteso, risOttenuto, 0.1);
		// diciamo quante cifre deve conrontare. In questo caso confronta solo la cifra
		// intera.
		// assertEquals(1, f.fattoriale(n));
	}

	@Test
	public void testFattoriale2() {
		// fail("Not yet implemented");
		//Fattoriale f = new Fattoriale();
		n = 1;
		risAtteso = 1;
		risOttenuto = f.fattoriale(n);
		//assertEquals(risAtteso, risOttenuto, 0.1);
		// assertEquals(1, f.fattoriale(n));
	}

	@Test
	public void testFattoriale3() {
		// fail("Not yet implemented");
		//Fattoriale f = new Fattoriale();
		n = 4;
		risAtteso = 24;
		risOttenuto = f.fattoriale(n);
		//assertEquals(risAtteso, risOttenuto, 0.1);
		// assertEquals(1, f.fattoriale(n));
	}

}

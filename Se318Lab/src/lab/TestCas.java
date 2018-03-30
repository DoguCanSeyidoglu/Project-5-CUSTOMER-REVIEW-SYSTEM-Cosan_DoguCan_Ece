package lab;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCas {

	@Test
	public void testFac() {
		assertEquals(120, LabTest.fac(5));
		assertEquals(1, LabTest.fac(0));
		assertNotSame(120, LabTest.fac(4));
		
		
	}
	
	@Test
	public void testSumOdds() {
		assertNotSame(0, LabTest.addOddUntil(5));
		assertEquals(9, LabTest.addOddUntil(5));
		
		
		//System.out.println(5);
	}
	
	@Test
	public void testConcat() {
		assertEquals("ahmetali", LabTest.testConcateText("ahmet","ali"));
		assertNotSame("ahmetburk", LabTest.testConcateText("ahmet","bur"));
		
		
		//System.out.println(5);
	}

}

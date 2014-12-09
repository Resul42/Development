import static org.junit.Assert.*;

import org.junit.Test;


public class TestAll {
	ApplicationDev methode = new ApplicationDev();
	@Test
	public void testString() {
		
		String resultString = methode.addStrings("ik", "heet", "Resul");
		assertEquals("ikheetResul", resultString);
	}
	@Test
	public void testDevide(){
		int resultDevide = methode.devide(60, 10);
		assertEquals(6, resultDevide);
	}
	@Test
	public void testCount(){
		int resultCount = methode.count(66, 77, 4, 6);
		assertEquals(153, resultCount);	
	}
	@Test
	public void testCalculate(){
		int resultCalculate = methode.calculate(8, 6);
		assertEquals(48, resultCalculate);
	}
}

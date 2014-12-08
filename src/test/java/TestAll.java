import static org.junit.Assert.*;

import org.junit.Test;


public class TestAll {

	@Test
	public void test() {
		Meth56 methode = new Meth56();
		String resultString = methode.addStrings("ik", "heet", "Resul");
		assertEquals("ikheetResul", resultString);
		int resultDevide = methode.devide(60, 10);
		assertEquals(6, resultDevide);
		int resultCount = methode.count(66, 77, 4, 6);
		assertEquals(153, resultCount);
		int resultCalculate = methode.calculate(8, 6);
		assertEquals(47, resultCalculate);
	}
}

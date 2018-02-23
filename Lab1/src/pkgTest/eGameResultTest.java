package pkgTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCore.eGameResult;

public class eGameResultTest {

	@Test
	public void test() {
		eGameResult a = eGameResult.NATURAL;
		assertTrue(a.toString() == "NATURAL");
		
		eGameResult b = eGameResult.SEVEN_OUT;
		assertTrue(b.toString() == "SEVEN_OUT");
		
		eGameResult c = eGameResult.CRAPS;
		assertTrue(c.toString() == "CRAPS");
		
		eGameResult d = eGameResult.POINT;
		assertTrue(d.toString() == "POINT");
		
		
	}

}

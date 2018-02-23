package pkgTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCore.Die;

public class DieTest {

	@Test
	public void TestDie() {

		for (int a = 0; a < 10000; a++) {
			Die d = new Die();
			assertTrue(d.getDieValue() >= 1);
			assertTrue(d.getDieValue() <= 6);
		}

	}
	
	@Test
	public void TestRandomDie() {
		
		int iTotalTrials = 10000;
		int[] arrayInt = {0,0,0,0,0,0};
		for (int a = 0; a < iTotalTrials; a++) {
			Die d = new Die();
			
			arrayInt[d.getDieValue()-1]++;
			
		}
		for (int i:arrayInt) {
		//	assertEquals(iTotalTrials / 6, i, 5);
			
		}
		
	}
}





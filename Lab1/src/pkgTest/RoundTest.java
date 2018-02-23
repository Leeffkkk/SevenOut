package pkgTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCore.Roll;

import pkgCore.Round;
import pkgCore.eGameResult;


public class RoundTest {

	@Test
	public void TestRound() {
		
		
		for (int a = 0; a<10000; a++) {
			Round r = new Round();
		//	System.out.println(r.ListRolls());
			
			if (Round.isNatural(r.GetFirstRoll())) {
				assertEquals(eGameResult.NATURAL, r.geteGameResult());
			}
			if (Round.isCraps(r.GetFirstRoll())) {
				assertEquals(eGameResult.CRAPS, r.geteGameResult());
			}
			if (r.RollCount() > 1) {
				if (r.GetFirstRoll() == r.GetLastRoll()) {
					assertEquals(eGameResult.POINT, r.geteGameResult());
				}
				else if (r.GetLastRoll() == 7) {
					assertEquals(eGameResult.SEVEN_OUT, r.geteGameResult());
				}
			}
		}
		
	}

}

package pkgCore;

import java.util.LinkedList;

public class Round {

	private eGameResult eGameResult;
	private LinkedList<Roll> rolls = new LinkedList<Roll>();
	
	public Round() {

		rolls.add(new Roll());
		
		if (isNatural(rolls.getLast().getScore())) {
			eGameResult = pkgCore.eGameResult.NATURAL;
		}
		else if (isCraps(rolls.getLast().getScore())) {
			eGameResult = pkgCore.eGameResult.CRAPS;
		}
		else {
			do {
				rolls.add(new Roll());
				
			} while (rolls.getLast().getScore() != 7 && rolls.getLast().getScore() != rolls.getFirst().getScore());
			
			if (rolls.getLast().getScore() == 7) {
				eGameResult = pkgCore.eGameResult.SEVEN_OUT;
			}
			else if (rolls.getLast().getScore() == rolls.getFirst().getScore())
			{
				eGameResult = pkgCore.eGameResult.POINT;
			}
		}
		}
		
	public int RollCount() {
		return rolls.size();
	}
	public eGameResult geteGameResult() {
		return eGameResult;
	}

	public int GetFirstRoll() {
		return rolls.getFirst().getScore();
	}
	public int GetLastRoll() {
		return rolls.getLast().getScore();
	}
	public static boolean isCraps(int a) {
		return (a == 2 || a == 3 || a == 12);
		}
	public static boolean isNatural(int a) {
		return (a == 7 || a == 11);
	}
	public static void main(String[] args)
	{
		Round round = new Round();
		System.out.print(round.eGameResult + "\n" + round.RollCount());
		
	}
}

package pkgCore;

public class Die {

	private int DieValue;

	public Die() {
		DieValue = 1 + (int)(Math.random()*6);
	}

	public int getDieValue() {
		return DieValue;
	}
}

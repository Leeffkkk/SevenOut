package pkgCore;

public enum eGameResult {

	NATURAL("NATURAL"), CRAPS("CRAPS"), POINT("POINT"), SEVEN_OUT("SEVEN_OUT");
	private String name;
	private eGameResult(String a) {
		this.name = a;
	}
	public String toString() {
		return name;
	}
}
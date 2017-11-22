package Model;

public class GradingCriteria {
	private int id;
	private int A, Bp, B, Cp, C, Dp, D;

	public GradingCriteria(int id, int a, int bp, int b, int cp, int c, int dp, int d) {
		this.id = id;
		A = a;
		Bp = bp;
		B = b;
		Cp = cp;
		C = c;
		Dp = dp;
		D = d;
	}

	public int getA() {
		return A;
	}

	public int getBp() {
		return Bp;
	}

	public int getB() {
		return B;
	}

	public int getCp() {
		return Cp;
	}

	public int getC() {
		return C;
	}

	public int getDp() {
		return Dp;
	}

	public int getD() {
		return D;
	}

	@Override
	public String toString() {
		return A + "," + Bp + "," + B + "," + Cp + "," + C + "," + Dp + "," + D;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}

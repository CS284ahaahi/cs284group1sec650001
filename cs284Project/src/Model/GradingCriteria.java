package Model;

public class GradingCriteria {
	private int id;
	private int A, Bp, B, Cp, C, Dp, D;

	public GradingCriteria(int id, int a, int bp, int b, int cp, int c, int dp, int d) throws Exception {
		this.id = id;
		if (a < 0 && bp < 0 && b < 0 && cp < 0 && c < 0 && dp < 0 && d < 0) {
			throw new Exception("Error grade must > 0");
		} else if (a > 100 && bp > 100 && b > 100 && cp > 100 && c > 100 && dp > 100 && d > 100) {
			throw new Exception("Error grade must < 100");
		} else if (a > bp && bp > b && b > cp && cp > c && c > dp && dp > d) {
			A = a;
			Bp = bp;
			B = b;
			Cp = cp;
			C = c;
			Dp = dp;
			D = d;
		} else {
			throw new Exception("error grade ");
		}
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

package Model;

import java.util.StringTokenizer;

public class GradingCriteria {

	private int A, Bp, B, Cp, C, Dp, D;

	public GradingCriteria(int a, int bp, int b, int cp, int c, int dp, int d) {
		A = a;
		Bp = bp;
		B = b;
		Cp = cp;
		C = c;
		Dp = dp;
		D = d;
	}

	public GradingCriteria(String gradeTxt) {
		StringTokenizer stk = new StringTokenizer(gradeTxt, ",");
		A = Integer.parseInt(stk.nextToken());
		Bp = Integer.parseInt(stk.nextToken());
		B = Integer.parseInt(stk.nextToken());
		Cp = Integer.parseInt(stk.nextToken());
		C = Integer.parseInt(stk.nextToken());
		Dp = Integer.parseInt(stk.nextToken());
		D = Integer.parseInt(stk.nextToken());
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

}

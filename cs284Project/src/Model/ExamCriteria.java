package Model;

public class ExamCriteria {
	private double midFull, midPer, finalFull, finalPer;
	private double score[];
	private double scorePer[];

	public ExamCriteria(String ec) {
		
	}

	public double getMidFull() {
		return midFull;
	}

	public void setMidFull(double midFull) {
		this.midFull = midFull;
	}

	public double getMidPer() {
		return midPer;
	}

	public void setMidPer(double midPer) {
		this.midPer = midPer;
	}

	public double getFinalFull() {
		return finalFull;
	}

	public void setFinalFull(double finalFull) {
		this.finalFull = finalFull;
	}

	public double getFinalPer() {
		return finalPer;
	}

	public void setFinalPer(double finalPer) {
		this.finalPer = finalPer;
	}

	public double[] getScore() {
		return score;
	}

	public void setScore(double[] score) {
		this.score = score;
	}

	public double[] getScorePer() {
		return scorePer;
	}

	public void setScorePer(double[] scorePer) {
		this.scorePer = scorePer;
	}

	public int getScoreAmount() {
		return score.length;
	}
}

package Model;

import java.util.StringTokenizer;

public class ExamCriteria {
	private double midFull, midPer, finalFull, finalPer;
	private double score[];
	private double scorePer[];

	public ExamCriteria(String ec) {
		StringTokenizer stk = new StringTokenizer(ec, "_");
		String midFinalTxt = stk.nextToken();
		String scoreTxt = stk.nextToken();
		StringTokenizer stkMidFi = new StringTokenizer(midFinalTxt, ",");
		StringTokenizer stkScore = new StringTokenizer(scoreTxt, ",");
		midFull = Double.parseDouble(stkMidFi.nextToken());
		midPer = Double.parseDouble(stkMidFi.nextToken());
		finalFull = Double.parseDouble(stkMidFi.nextToken());
		finalPer = Double.parseDouble(stkMidFi.nextToken());
		int scoreAmo = Integer.parseInt(stkScore.nextToken());
		score = new double[scoreAmo];
		scorePer = new double[scoreAmo];
		for (int i = 0; i < score.length; i++) {
			score[i] = Double.parseDouble(stkScore.nextToken());
			scorePer[i] = Double.parseDouble(stkScore.nextToken());
		}
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

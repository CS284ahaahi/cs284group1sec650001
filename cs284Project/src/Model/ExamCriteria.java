package Model;

import java.util.Arrays;

public class ExamCriteria {
	private int id;
	private int scoreAmount;
	private int midFull, midPer, finalFull, finalPer;
	private int score[];
	private int scorePer[];

	public ExamCriteria(int id, int scoreAmount) {
		this.id = id;
		this.scoreAmount = scoreAmount;
	}

	public int getMidFull() {
		return midFull;
	}

	public void setMidFull(int midFull) {
		this.midFull = midFull;
	}

	public int getMidPer() {
		return midPer;
	}

	public void setMidPer(int midPer) {
		this.midPer = midPer;
	}

	public int getFinalFull() {
		return finalFull;
	}

	public void setFinalFull(int finalFull) {
		this.finalFull = finalFull;
	}

	public int getFinalPer() {
		return finalPer;
	}

	public void setFinalPer(int finalPer) {
		this.finalPer = finalPer;
	}

	public int[] getScore() {
		return score;
	}

	public void setScore(int[] score) {
		this.score = score;
	}

	public int[] getScorePer() {
		return scorePer;
	}

	public void setScorePer(int[] scorePer) {
		this.scorePer = scorePer;
	}

	public int getScoreAmount() {
		return scoreAmount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "ExamCriteria [id=" + id + ", scoreAmount=" + scoreAmount + ", midFull=" + midFull + ", midPer=" + midPer
				+ ", finalFull=" + finalFull + ", finalPer=" + finalPer + ", score=" + Arrays.toString(score)
				+ ", scorePer=" + Arrays.toString(scorePer) + "]";
	}

}

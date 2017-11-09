package Model;

public class StudentResult {
	private String id;
	private double midScore, finalScore;
	private double score[];

	public StudentResult(String id, double midScore, double finalScore, double[] score) {
		super();
		this.id = id;
		this.midScore = midScore;
		this.finalScore = finalScore;
		this.score = score;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getMidScore() {
		return midScore;
	}

	public void setMidScore(double midScore) {
		this.midScore = midScore;
	}

	public double getFinalScore() {
		return finalScore;
	}

	public void setFinalScore(double finalScore) {
		this.finalScore = finalScore;
	}

	public double[] getScore() {
		return score;
	}

	public void setScore(double[] score) {
		this.score = score;
	}

	public int getScoreAmount() {
		return score.length;
	}

	public double getScoreByIndex(int index) {
		return score[index];
	}

	public void setScoreByIndex(double sc, int index) {
		score[index] = sc;
	}
}

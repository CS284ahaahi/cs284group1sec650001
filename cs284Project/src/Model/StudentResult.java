package Model;

public class StudentResult {
	private int ID;
	private String ids;
	private double midScore, finalScore;
	private double score[];
	private String grade;
	private String status;

	public StudentResult(int ID, String ids, double midScore, double finalScore, double[] score, String grade,
			String status) {
		this.ID = ID;
		this.ids = ids;
		this.midScore = midScore;
		this.finalScore = finalScore;
		this.score = score;
		this.grade = grade;
		this.status = status;
	}

	public String getIDStudent() {
		return ids;
	}

	public void setIDStudent(String id) {
		this.ids = id;
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
		if (score != null) {
			return score.length;
		} else {
			return 0;
		}
	}

	public double getScoreByIndex(int index) {
		return score[index];
	}

	public void setScoreByIndex(double sc, int index) {
		score[index] = sc;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

}

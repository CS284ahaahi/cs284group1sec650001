package Model;

public class StudentResult {
	private String id;
	private double total;

	public StudentResult(String id, double total) {
		super();
		this.id = id;
		this.total = total;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
}

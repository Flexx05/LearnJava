package chapter7;

public class SinhVientIt extends SinhVien {
	private double scoreHTML;
	private double scoreJava;

	public SinhVientIt(String id, String name, double scoreHTML, double scoreJava) {
		super(id, name);
		this.scoreHTML = scoreHTML;
		this.scoreJava = scoreJava;
	}

	public SinhVientIt(double scoreHTML, double scoreJava) {
		super();
		this.scoreHTML = scoreHTML;
		this.scoreJava = scoreJava;
	}

	public double getScoreHTML() {
		return scoreHTML;
	}

	public void setScoreHTML(double scoreHTML) {
		this.scoreHTML = scoreHTML;
	}

	public double getScoreJava() {
		return scoreJava;
	}

	public void setScoreJava(double scoreJava) {
		this.scoreJava = scoreJava;
	}

	@Override
	double getPoint() {
		return (this.scoreHTML + this.scoreJava * 2) / 3;
	}

}

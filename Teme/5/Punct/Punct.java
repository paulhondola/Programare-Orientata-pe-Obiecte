class Punct {

	private double x, y;

	public Punct(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}

class PunctColorat extends Punct {

	int colorCode;

	public PunctColorat(double x, double y, int colorCode) {
		super(x, y);
		this.colorCode = colorCode;
	}

	public String toString() {
		return super.toString() + ", Color: " + colorCode;
	}
}

class Main {

	public static void main(String[] args) {
		Punct p = new PunctColorat(1.5, 2.5, 1000);

		System.out.println(p);
	}
}

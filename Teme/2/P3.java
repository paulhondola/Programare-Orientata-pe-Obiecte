class Motor {

	private int capacitate;

	public Motor(int c) {
		capacitate = c;
	}

	public void setCapacitate(int c) {
		capacitate = c;
	}

	public void tipareste() {
		System.out.println("Motor de capacitate " + capacitate);
	}
}

class P3 {

	public static void main(String[] args) {
		Motor m1, m2;
		m1 = new Motor(5);
		m2 = m1;
		m2.setCapacitate(10);
		m1.tipareste();
	}
}

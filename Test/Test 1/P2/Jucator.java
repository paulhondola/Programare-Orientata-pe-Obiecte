class Jucator {

	private String nume;
	private int numarTricou;

	public Jucator(String nume, int numarTricou) {
		this.nume = nume;
		this.numarTricou = numarTricou;
	}

	public String getNume() {
		return nume;
	}

	public int getNumarTricou() {
		return numarTricou;
	}

	@Override
	public String toString() {
		return "(" + nume + ", " + numarTricou + ")";
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Jucator) {
			Jucator j = (Jucator) o;
			return nume.equals(j.nume) && numarTricou == j.numarTricou;
		}
		return false;
	}
}

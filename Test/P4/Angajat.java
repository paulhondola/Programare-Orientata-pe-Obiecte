class Angajat {

	private String nume;
	private int salariu;

	public Angajat(String nume, int salariu) {
		this.nume = nume;
		this.salariu = salariu;
	}

	public boolean equals(Object o) {
		if (o instanceof Angajat) {
			Angajat a = (Angajat) o;
			return this.nume.equals(a.nume) && this.salariu == a.salariu;
		}
		return false;
	}

	public int getSalariu() {
		return salariu;
	}

	public String toString() {
		return "Angajat " + nume + " - " + salariu;
	}
}

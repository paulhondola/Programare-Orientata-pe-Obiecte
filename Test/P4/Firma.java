class Firma {

	private String nume;
	private int buget;

	private int numarAngajati = 0;
	private final int NUMAR_MAXIM_ANGAJATI = 30;
	private Angajat[] angajati = new Angajat[NUMAR_MAXIM_ANGAJATI];

	public Firma(String nume, int buget) {
		this.nume = nume;
		this.buget = buget;
	}

	public boolean adaugaAngajat(Angajat angajat) {
		if (numarAngajati >= NUMAR_MAXIM_ANGAJATI) return false;

		for (int i = 0; i < numarAngajati; i++) if (angajati[i].equals(angajat)) return false;

		angajati[numarAngajati++] = angajat;
		return true;
	}

	public String toString() {
		String result = nume + ": ";
		for (int i = 0; i < numarAngajati; i++) result += angajati[i] + " ";
		return result;
	}

	public int platesteSalarii() {
		int sumaSalarii = 0;
		for (int i = 0; i < numarAngajati; i++) sumaSalarii += angajati[i].getSalariu();

		return buget - sumaSalarii;
	}
}

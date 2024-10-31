class Benzinarie {

	private final int NUMAR_MAXIM_MASINI = 10;
	private int numarMasini = 0;
	private Masina[] masini = new Masina[NUMAR_MAXIM_MASINI];
	private int cantitateBenzina;

	public boolean alimenteazaMasina(Masina m) {
		if (cantitateBenzina >= m.getCapacitateRezervor()) {
			cantitateBenzina -= m.getCapacitateRezervor();
			return true;
		}

		if (numarMasini < NUMAR_MAXIM_MASINI) {
			masini[numarMasini] = m;
			numarMasini++;
			return true;
		}

		return false;
	}

	private void elibereazaMasina() {
		for (int i = 0; i < numarMasini - 1; i++) {
			masini[i] = masini[i + 1];
		}
		numarMasini--;
	}

	public void alimenteazaBenzinarie(int cantitateBenzina) {
		this.cantitateBenzina += cantitateBenzina;

		while (numarMasini > 0) {
			if (cantitateBenzina >= masini[0].getCapacitateRezervor()) {
				cantitateBenzina -= masini[0].getCapacitateRezervor();
				elibereazaMasina();
			} else {
				break;
			}
		}
	}

	public String toString() {
		String result = "Coada benzinarie: ";
		for (int i = 0; i < numarMasini; i++) {
			result += masini[i].toString() + " ";
		}
		return result;
	}
}

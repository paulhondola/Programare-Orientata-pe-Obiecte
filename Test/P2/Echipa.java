class Echipa {

	private Jucator[] jucatoriTitulari;
	private Jucator[] jucatoriRezerve;

	public Echipa(Jucator[] jucatoriTitulari, Jucator[] jucatoriRezerve) {
		this.jucatoriTitulari = jucatoriTitulari;
		this.jucatoriRezerve = jucatoriRezerve;
	}

	public boolean efectueazaSchimbare(Jucator titular, Jucator rezerva) {
		// verifica daca exista titularul in echipa pe post
		boolean existaTitular = false;
		int indexTitular = -1;
		for (int i = 0; i < jucatoriTitulari.length; i++) {
			if (jucatoriTitulari[i].equals(titular)) {
				existaTitular = true;
				indexTitular = i;
				break;
			}
		}

		// verifica daca exista rezerva in echipa pe post
		boolean existaRezerva = false;
		int indexRezerva = -1;
		for (int i = 0; i < jucatoriRezerve.length; i++) {
			if (jucatoriRezerve[i].equals(rezerva)) {
				existaRezerva = true;
				indexRezerva = i;
				break;
			}
		}

		// daca exista titularul si rezerva, efectueaza schimbarea
		// altfel, returneaza false
		if (!existaTitular || !existaRezerva) return false;

		Jucator temp = jucatoriTitulari[indexTitular];
		jucatoriTitulari[indexTitular] = jucatoriRezerve[indexRezerva];
		jucatoriRezerve[indexRezerva] = temp;

		return true;
	}

	@Override
	public String toString() {
		String resultTitulari = "Titulari: ";
		String resultRezerve = "Rezerve: ";

		for (Jucator jucator : jucatoriTitulari) {
			resultTitulari += jucator + ", ";
		}

		for (Jucator jucator : jucatoriRezerve) {
			resultRezerve += jucator + ", ";
		}

		return resultTitulari + "; " + resultRezerve;
	}
}

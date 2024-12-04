class Portofel {

	private String numeProprietar;

	private int numarCarduri = 0;
	private final int NUMAR_MAXIM_CARDURI = 10;
	private Card[] carduri = new Card[NUMAR_MAXIM_CARDURI];

	public Portofel(String numeProprietar) {
		this.numeProprietar = numeProprietar;
	}

	public boolean adaugaCard(String numar, int sold) {
		if (numarCarduri >= NUMAR_MAXIM_CARDURI) return false;

		for (int i = 0; i < numarCarduri; i++) if (
			carduri[i].getNumar().equals(numar)
		) return false;

		carduri[numarCarduri++] = new Card(numar, sold);
		return true;
	}

	public String toString() {
		String result = "Portofelul " + numeProprietar + ": ";
		for (int i = 0; i < numarCarduri; i++) result += carduri[i] + " ";
		return result;
	}

	public float calculeazaSold() {
		float sold = 0;
		for (int i = 0; i < numarCarduri; i++) sold += carduri[i].getSold();
		return sold;
	}
}

class Desen {

	private String titlu;

	private int numarFiguri = 0;
	private final int NUMAR_MAXIM_FIGURI = 1024;
	private Figura[] figuri = new Figura[NUMAR_MAXIM_FIGURI];

	public Desen(String titlu) {
		this.titlu = titlu;
	}

	public boolean adaugaFigura(Figura figura) {
		if (numarFiguri == NUMAR_MAXIM_FIGURI) return false;

		for (int i = 0; i < numarFiguri; i++) if (figuri[i].equals(figura)) return false;

		figuri[numarFiguri++] = figura;
		return true;
	}

	public float medieArie() {
		if (numarFiguri == 0) return 0;

		float suma = 0;
		for (int i = 0; i < numarFiguri; i++) suma += figuri[i].getArie();
		return suma / numarFiguri;
	}

	public String toString() {
		String s = titlu + ": ";
		for (int i = 0; i < numarFiguri; i++) s += figuri[i] + " ";
		return s;
	}
}

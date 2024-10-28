class Telefon {

	private String numeProprietar;
	private final int capacitateIstoric = 100;
	private int indexIstoric = 0;
	private String[] istoricApeluri = new String[capacitateIstoric];

	public Telefon(String numeProprietar) {
		this.numeProprietar = numeProprietar;
	}

	public boolean apeleaza(Telefon tel) {
		if (tel.indexIstoric == tel.capacitateIstoric) return false;

		tel.istoricApeluri[tel.indexIstoric++] = this.numeProprietar;
		return true;
	}

	public Integer numarDeApeluri(String numeProprietar) {
		Integer count = 0;

		for (int i = 0; i < indexIstoric; i++) if (
			numeProprietar.equals(istoricApeluri[i])
		) count++;

		return count;
	}

	public String toString() {
		String str = "Proprietar: " + numeProprietar + "\nIstoric apelari:\n";

		for (int i = 0; i < indexIstoric; i++) {
			str += istoricApeluri[i] + "\n";
		}
		return str;
	}
}

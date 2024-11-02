class Utilizator extends Destinatar {

	private String jurnal;

	public Utilizator(String nume) {
		this.nume = nume;
		this.jurnal = "";
	}

	public String toString() {
		return nume + ":\n" + jurnal;
	}

	public boolean equals(Object o) {
		if (o instanceof Utilizator) {
			Utilizator u = (Utilizator) o;
			return this.nume.equals(u.nume);
		}
		return false;
	}

	public void receptioneaza(Utilizator utilizator, String mesaj) {
		if (equals(utilizator)) return;

		String mesaj_nou = "Primit de la " + utilizator.nume + " mesajul: " + mesaj + "\n";
		this.jurnal += mesaj_nou;
	}

	public void trimite(Destinatar destinatar, String mesaj) {
		String mesaj_nou = "Trimis catre " + destinatar.nume + " mesajul: " + mesaj + "\n";
		this.jurnal += mesaj_nou;
		destinatar.receptioneaza(this, mesaj);
	}
}

class Card {

	private String numar;
	private float sold;

	public Card(String numar, float sold) {
		this.numar = numar;
		this.sold = sold;
	}

	public String getNumar() {
		return numar;
	}

	public float getSold() {
		return sold;
	}

	public boolean equals(Object o) {
		if (o instanceof Card) {
			Card c = (Card) o;
			return this.numar.equals(c.numar);
		}
		return false;
	}

	public String toString() {
		return numar + " - " + sold;
	}
}

class Figura {

	private float arie;

	public Figura(float arie) {
		this.arie = arie;
	}

	public float getArie() {
		return arie;
	}

	public boolean equals(Object o) {
		if (o instanceof Figura) {
			Figura f = (Figura) o;
			return this.arie == f.arie;
		}
		return false;
	}

	public String toString() {
		return "Aria: " + arie;
	}
}

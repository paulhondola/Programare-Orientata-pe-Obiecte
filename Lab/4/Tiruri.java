class Remorca {

	private int maxCutii;
	private String nrInmatriculare;
	private static int prevMaxCutii = 10;

	public Remorca(String nrInmatriculare, int maxCutii) {
		this.maxCutii = maxCutii;
		this.nrInmatriculare = nrInmatriculare;
		Remorca.prevMaxCutii = maxCutii;
	}

	public Remorca(String nrInmatriculare) {
		this.maxCutii = ++Remorca.prevMaxCutii;
		this.nrInmatriculare = nrInmatriculare;
	}

	public String toString() {
		return "R(" + nrInmatriculare + ", " + maxCutii + ")";
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof Remorca)) return false;

		return this.nrInmatriculare.equals(((Remorca) obj).nrInmatriculare);
	}

	public String getNrInmatriculare() {
		return this.nrInmatriculare;
	}

	public int getMaxCutii() {
		return this.maxCutii;
	}
}

class Tir {

	private int size;
	private final int CAPACITY = 5;
	private Remorca[] remorci = new Remorca[CAPACITY];

	public boolean adaugaRemorca(String nrInmatriculare, int nrCutii) {
		if (size + 1 == CAPACITY) return false;
		remorci[size++] = new Remorca(nrInmatriculare, nrCutii);
		return true;
	}

	public Remorca stergeRemorca(String nrInmatriculare) {
		for (int i = 0; i < CAPACITY; i++) {
			if (remorci[i].getNrInmatriculare().equals(nrInmatriculare)) {
				// erase it from the array
				for (int j = i; j < CAPACITY - 1; j++) remorci[j] = remorci[j + 1];
				return this.remorci[i];
			}
		}

		return null;
	}

	public int getSize() {
		return this.size;
	}

	public int getMaxCutii() {
		int maxCutii = 0;
		for (int i = 0; i < size; i++) maxCutii += remorci[i].getMaxCutii();
		return maxCutii;
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof Tir)) return false;

		return this.getMaxCutii() == ((Tir) obj).getMaxCutii();
	}

	public String toString() {
		String returnValue = "T ";
		for (int i = 0; i < size; i++) returnValue += " -> " + remorci[i].toString();
		return returnValue;
	}
}

class Tiruri {

	public static void main(String[] args) {
		Tir tir = new Tir();

		tir.adaugaRemorca("AB06MBX", 1);
		tir.adaugaRemorca("AB01MBX", 2);
		tir.adaugaRemorca("AB12MBX", 4);

		System.out.println(tir);
	}
}

class BooleanComparison {

	public static void main(String[] args) {
		// Creăm două obiecte Boolean
		Boolean bool1 = new Boolean(true);
		Boolean bool2 = new Boolean(true);

		// Comparăm cele două obiecte folosind metoda equals()
		if (bool1.equals(bool2)) {
			System.out.println("Cele două obiecte Boolean au aceeași valoare logică.");
		} else {
			System.out.println("Cele două obiecte Boolean au valori diferite.");
		}

		// Testăm cu valori diferite
		Boolean bool3 = new Boolean(false);

		if (bool1.equals(bool3)) {
			System.out.println("Cele două obiecte Boolean au aceeași valoare logică.");
		} else {
			System.out.println("Cele două obiecte Boolean au valori diferite.");
		}
	}
}

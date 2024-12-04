class Main {

	public static void main(String[] args) {
		Benzinarie b = new Benzinarie();

		Masina m1 = new Masina("A 01 ABC", 5);
		Masina m2 = new Masina("B 02 ABC", 10);
		Masina m3 = new Masina("C 03 ABC", 15);

		System.out.println(b.alimenteazaMasina(m1));
		System.out.println(b.alimenteazaMasina(m2));
		System.out.println(b.alimenteazaMasina(m3));

		System.out.println(b);

		b.alimenteazaBenzinarie(15);

		System.out.println(b);
	}
}

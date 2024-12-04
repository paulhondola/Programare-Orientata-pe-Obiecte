class Main {

	public static void main(String[] args) {
		Portofel portofel = new Portofel("Ion Popescu");
		portofel.adaugaCard("1234", 100);
		portofel.adaugaCard("5678", 200);
		portofel.adaugaCard("1234", 300);
		portofel.adaugaCard("1234", 400);
		portofel.adaugaCard("1234", 500);

		System.out.println(portofel);
		System.out.println(portofel.calculeazaSold());
	}
}

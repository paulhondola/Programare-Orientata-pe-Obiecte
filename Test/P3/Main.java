class Main {

	public static void main(String[] args) {
		Desen d = new Desen("Desenul meu");
		Figura f1 = new Figura(1);
		Figura f2 = new Figura(2);
		Figura f3 = new Figura(3);

		System.out.println(d.adaugaFigura(f1));
		System.out.println(d.adaugaFigura(f2));
		System.out.println(d.adaugaFigura(f3));
		System.out.println(d.adaugaFigura(f1));

		System.out.println(d);
		System.out.println(d.medieArie());
	}
}

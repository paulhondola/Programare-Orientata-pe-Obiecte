class Main {

	public static void main(String[] args) {
		Firma f = new Firma("Macrohard", 10000);
		Angajat a1 = new Angajat("Gigel", 3000);
		Angajat a2 = new Angajat("Ionel", 4000);
		Angajat a3 = new Angajat("Danel", 5000);

		System.out.println(f.adaugaAngajat(a1));
		System.out.println(f.adaugaAngajat(a2));
		System.out.println(f.adaugaAngajat(a3));
		System.out.println(f.adaugaAngajat(a1));

		System.out.println(f);

		System.out.println(f.platesteSalarii());
	}
}

class Main {

	public static void main(String[] args) {
		Utilizator u1 = new Utilizator("Dan");
		Utilizator u2 = new Utilizator("Marius");
		Utilizator u3 = new Utilizator("Alex");

		Grup g1 = new Grup("Carnivorii");
		g1.inscrie(u1);
		g1.inscrie(u2);
		g1.inscrie(u3);

		g1.inscrie(u3);

		u3.trimite(g1, "Am deschis magazinul");
		u2.trimite(g1, "Vin acuma");

		System.out.println(u1);
		System.out.println(u2);
		System.out.println(u3);
	}
}

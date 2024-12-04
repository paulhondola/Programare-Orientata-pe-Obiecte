class Main {

	public static void main(String[] args) {
		Jucator jucator_t1 = new Jucator("t1", 1);
		Jucator jucator_t2 = new Jucator("t2", 2);
		Jucator jucator_t3 = new Jucator("t3", 3);
		Jucator jucator_t4 = new Jucator("t4", 4);
		Jucator jucator_t5 = new Jucator("t5", 5);

		Jucator jucator_r1 = new Jucator("r6", 6);
		Jucator jucator_r2 = new Jucator("r7", 7);
		Jucator jucator_r3 = new Jucator("r8", 8);
		Jucator jucator_r4 = new Jucator("r9", 9);
		Jucator jucator_r5 = new Jucator("r10", 10);

		Jucator[] jucatoriTitulari = { jucator_t1, jucator_t2, jucator_t3, jucator_t4, jucator_t5 };
		Jucator[] jucatoriRezerve = { jucator_r1, jucator_r2, jucator_r3, jucator_r4, jucator_r5 };

		Echipa echipa = new Echipa(jucatoriTitulari, jucatoriRezerve);

		System.out.println(echipa);

		System.out.println(echipa.efectueazaSchimbare(jucator_t1, jucator_r1));

		System.out.println(echipa);

		System.out.println(echipa.efectueazaSchimbare(jucator_t1, jucator_r2));
	}
}

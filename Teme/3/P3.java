// 3. Un p˘atrat este caracterizat de latura sa. Scriet¸i o clas˘a Patrat ce are doi constructori, un constructor f˘ar˘a nici un parametru care seteaz˘a latura p˘atratului ca fiind 10 iar altul care seteaz˘a latura cu o valoare egal˘a cu cea a unui parametru transmis constructorului. Ata¸sat¸i clasei o metod˘a potrivit˘a pentru tip˘arirea unui p˘atrat sub forma ”Patrat” l ”Aria” a, unde l este valoarea laturii iar a este valoarea ariei p˘atratului. Creat¸i ˆıntr-o metod˘a main diferite obiecte de tip Patrat ¸si tip˘arit¸i-le.

class Patrat {

	private int latura;

	public Patrat() {
		this.latura = 10;
	}

	public Patrat(int latura) {
		this.latura = latura;
	}

	public String toString() {
		return "Patrat l=" + latura + " Aria=" + latura * latura;
	}
}

class P3 {

	public static void main(String[] args) {
		Patrat p1 = new Patrat();
		Patrat p2 = new Patrat(5);
		Patrat p3 = new Patrat(10);

		System.out.println(p1);
		System.out.println(p2);
	}
}

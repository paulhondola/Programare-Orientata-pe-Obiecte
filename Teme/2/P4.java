// 4. Un sertar este caracterizat de o latime, lungime si inaltime. Un birou are doua sertare si, evident, o latime, lungime si inaltime. Creati clasele Sertar si Birou corespunzatoare specificatiilor de mai sus. Creati pentru fiecare clasa constructorul potrivit astfel incat carateristicile instantelor sa fie setate la crearea acestora. Clasa Sertar contine o metoda tipareste al carei apel va produce tiparirea pe ecran a sertarului sub forma ”Sertar ” + l + L + H, unde l, L, H sunt valorile coresupunzatoare latimii, lungimii si inaltimii sertarului. Clasa Birou contine o metoda tipareste cu ajutorul careia se vor tipari toate componentele biroului. Creati intr-o metoda main doua sertare, un birou si tipariti componentele biroului.

class Sertar {

	private int latime, lungime, inaltime;

	public Sertar(int latime, int lungime, int inaltime) {
		this.latime = latime;
		this.lungime = lungime;
		this.inaltime = inaltime;
	}

	public void tipareste() {
		System.out.println("Sertar " + latime + lungime + inaltime);
	}
}

class Birou {

	private int latime, lungime, inaltime;
	private Sertar sertar1, sertar2;

	public Birou(int latime, int lungime, int inaltime, Sertar sertar1, Sertar sertar2) {
		this.latime = latime;
		this.lungime = lungime;
		this.inaltime = inaltime;
		this.sertar1 = sertar1;
		this.sertar2 = sertar2;
	}

	public void tipareste() {
		System.out.println("Birou " + latime + lungime + inaltime);
		sertar1.tipareste();
		sertar2.tipareste();
	}
}

class P4 {

	public static void main(String[] args) {
		Sertar sertar1 = new Sertar(10, 20, 30);
		Sertar sertar2 = new Sertar(15, 25, 35);
		sertar1.tipareste();
		sertar2.tipareste();
		Birou birou = new Birou(100, 200, 300, new Sertar(50, 50, 50), new Sertar(60, 60, 60));
		birou.tipareste();
	}
}

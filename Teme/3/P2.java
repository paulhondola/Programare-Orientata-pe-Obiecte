// 2. O carte este caracterizat˘a printr-un num˘ar de pagini. Spunem a dou˘a c˘art¸i sunt identice dac˘a acestea au acela¸si num˘ar de pagini. Creat¸i clasa Carte ¸si ata¸sat¸i-i o metod˘a potrivit˘a pentru compararea a dou˘a c˘art¸i. Apelat¸i metoda care realizeaz˘a compararea a dou˘a c˘art¸i ˆıntr-o metod˘a main.

class Carte {

	private int pagini;

	public Carte(int pagini) {
		this.pagini = pagini;
	}

	public boolean equals(Carte c) {
		return this.pagini == c.pagini;
	}
}

class P2 {

	public static void main(String[] args) {
		Carte c1 = new Carte(100);
		Carte c2 = new Carte(100);
		Carte c3 = new Carte(200);
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
	}
}

// 4. Creat¸i o clas˘a Piramida ce are un atribut ˆıntreg n. Ata¸sat¸i clasei o metod˘a potrivit˘a pentru tip˘arirea unei piramide ca mai jos:
/*
1 1 1 1
2 2 2
3 3
4*/
// --> n Creat¸i ˆıntr-o metod˘a main diferite obiecte de tip Piramida ¸si tip˘arit¸i-le.

class Piramida {

	private int n;

	public Piramida(int n) {
		this.n = n;
	}

	public String toString() {
		String piramida = "";
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i + 1; j++) {
				piramida += i + " ";
			}
			piramida += "\n";
		}
		return piramida;
	}
}

class P4 {

	public static void main(String[] args) {
		Piramida p1 = new Piramida(4);
		Piramida p2 = new Piramida(5);
		Piramida p3 = new Piramida(6);

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
}

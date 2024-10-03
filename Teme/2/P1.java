// 1. Creati o clasa cu un constructor privat. Vedeti ce se intampla la compilare daca creati o instanta a clasei intr-o metoda main.

class PrivateConstructor {

	private PrivateConstructor() {
		System.out.println("P1 constructor");
	}
}

class P1 {

	public static void main(String[] args) {
		PrivateConstructor pc = new PrivateConstructor();
	}
}

// 2. Creat¸i o clas˘a ce cont¸ine dou˘a atribute nestatice private, un int ¸si un char care nu sunt init¸ializate ¸si tip˘arit¸i valorile acestora pentru a verifica dac˘a Java realizeaz˘a init¸ializarea implicit˘a.

class IDK {

	private int myInt;
	private char myChar;

	public void print() {
		System.out.println(myInt);
		System.out.println(myChar);
	}
}

class P2 {

	public static void main(String[] args) {
		IDK p = new IDK();
		p.print();
	}
}

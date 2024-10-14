// 5. Definit¸i o clas˘a Suma cu metodele statice de mai jos:
/*
returneaza suma dintre a si b
a) public static int suma(int a, int b) ...

returneaza suma dintre a, b si c
b) public static int suma(int a, int b, int c) ...

// returneaza suma dintre a, b, c si d
c) public static int suma(int a, int b, int c, int d) ...

Implementat¸i metodele astfel ˆıncˆat fiecare metod˘a s˘a efectueze o singur˘a adunare.
Apelat¸i-le dintr-o metod˘a main.
*/

class Suma {

	public static int suma(int a, int b) {
		return a + b;
	}

	public static int suma(int a, int b, int c) {
		return suma(a, b) + c;
	}

	public static int suma(int a, int b, int c, int d) {
		return suma(a, b, c) + d;
	}
}

class P5 {

	public static void main(String[] args) {
		// Suma.main(args);
		System.out.println(Suma.suma(1, 2));
		System.out.println(Suma.suma(1, 2, 3));
		System.out.println(Suma.suma(1, 2, 3, 4));
	}
}

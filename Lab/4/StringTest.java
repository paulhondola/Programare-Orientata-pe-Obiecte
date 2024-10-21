class Main {

	public static void main(String[] args) {
		String sir1 = "Un sir";
		String sir2 = "Un ";
		String sir3 = "sir";

		String sir4 = "Un " + "sir";
		String sir5 = sir2.concat(sir3);
		String sir6 = sir2 + sir3;

		System.out.println("==");

		System.out.println(sir1 == sir4);
		System.out.println(sir1 == sir5);
		System.out.println(sir4 == sir5);
		System.out.println(sir1 == sir6);
		System.out.println(sir5 == sir6);

		System.out.println("Equals");

		System.out.println(sir1.equals(sir4));
		System.out.println(sir1.equals(sir5));
		System.out.println(sir4.equals(sir5));
		System.out.println(sir1.equals(sir6));
		// Un + sir -> intra pe rand in heap, dupa concatenare se creeaza alta zona in heap cu "Un sir", nu foloseste aceeasi zona de memorie ca si un sir declarat initial

		// se foloseste .equals , nu == pentru compararea stringurilor

	}
}

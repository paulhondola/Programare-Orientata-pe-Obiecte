class Arrays {

	public static void main(String[] args) {
		int[] array = new int[10];

		System.out.println(array[0]);

		String[] array2 = new String[10];

		for (int i = 0; i < 10; i++) array2[i] = new String("blabla");

		for (String i : array2) System.out.println(i);
	}
}

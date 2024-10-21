class Main {

	public static int doSmth1(Integer i) {
		return i; // Unboxing
	}

	public static Integer doSmth2(int x, int y) {
		return x + y; // Autoboxing
	}

	public static void main(String[] args) {
		System.out.println(doSmth1(5));
		System.out.println(doSmth2(2, 3));
	}
}

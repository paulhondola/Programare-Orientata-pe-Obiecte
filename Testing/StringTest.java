class StringTest {

	public static void printInt(Integer i) {
		System.out.println(i);
	}

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		s1 = s1.concat(s2);
		System.out.println(s1);
		String ref = s1.intern();
		System.out.println(ref);
		String str = s1.substring(1, 6);
		System.out.println(str);

		printInt(10);
	}
}

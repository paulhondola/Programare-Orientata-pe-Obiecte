class P3 {

	public static void main(String[] args) {
		int evenSum = 0;
		for (int i = 2; i <= 100; i += 2) evenSum += i;

		for (int i = 1; i <= 100; i += 2) System.out.println(i);

		System.out.println("Sum of even numbers from 2 to 100: " + evenSum);
	}
}

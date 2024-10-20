import java.io.*;

class Main {

	public static void main(String[] args) {
		String input;

		try {
			BufferedReader in_stream_char = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter a string: ");
			input = in_stream_char.readLine();
			System.out.println("You entered: " + input);
		} catch (IOException e) {
			System.out.println("Error reading from the standard input");
		}
	}
}

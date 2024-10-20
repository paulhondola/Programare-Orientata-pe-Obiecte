import java.io.*;

class Main {

	public static void main(String[] args) {
		char[] buffer = new char[1024];

		try {
			InputStreamReader in_stream_char = new InputStreamReader(System.in);

			int charsRead = in_stream_char.read(buffer);

			System.out.println("Number of characters read: " + charsRead);

			System.out.println("Characters read: " + new String(buffer, 0, charsRead));
		} catch (IOException e) {
			System.out.println("Error reading from the standard input");
		}
	}
}

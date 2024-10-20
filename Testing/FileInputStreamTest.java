import java.io.*;

class Main {

	public static void main(String[] args) {
		// reading characters from the standard input
		// InputReader -> reads bytes from the standard input
		// InputStreamReader -> converts bytes to characters
		// BufferedReader -> reads characters from the InputStreamReader and buffers them into strings

		// read bytes from the standard input

		byte[] buffer = new byte[1024];

		try {
			FileInputStream in_stream_char = new FileInputStream("out.txt");
			int bytesRead = in_stream_char.read(buffer);
			System.out.println("Number of bytes read: " + bytesRead);
			System.out.println("Bytes read: " + new String(buffer, 0, bytesRead));
		} catch (IOException e) {
			System.out.println("Error reading from the standard input");
		}
	}
}

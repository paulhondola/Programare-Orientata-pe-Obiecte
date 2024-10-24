import java.io.*;
import java.util.*;

class RowChecker {

	private String row;
	private String filename;
	private int count;

	public RowChecker(String row, String filename) {
		this.row = row;
		this.filename = filename;
		this.count = 0;
	}

	// Change the method signature to accept a Scanner as a parameter
	public static String enterFileName(Scanner scanner) {
		System.out.println("Introduceti numele fisierului: ");
		return scanner.nextLine();
	}

	// Change the method signature to accept a Scanner as a parameter
	public static String enterRow(Scanner scanner) {
		System.out.println("Introduceti randul: ");
		return scanner.nextLine();
	}

	public int checkRows() {
		try {
			FileInputStream file = new FileInputStream(filename);
			Scanner fileScanner = new Scanner(file);
			while (fileScanner.hasNextLine()) {
				String currentRow = fileScanner.nextLine();
				if (currentRow.equals(row)) {
					count++;
				}
			}
			fileScanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("Fisierul nu a fost gasit.");
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Create a single Scanner for input
		String row = RowChecker.enterRow(scanner);
		String filename = RowChecker.enterFileName(scanner);

		RowChecker rowChecker = new RowChecker(row, filename);
		System.out.println(rowChecker.checkRows());
		scanner.close(); // Close the Scanner here after all input is done
	}
}

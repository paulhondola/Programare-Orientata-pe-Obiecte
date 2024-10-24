import java.io.*;
import java.util.Scanner;

class MatrixMultiplier {

	public Double[][] enterMatrix(Scanner scanner) {
		System.out.println("Introduceti numarul de linii: ");
		int rows = scanner.nextInt();
		System.out.println("Introduceti numarul de coloane: ");
		int columns = scanner.nextInt();

		Double[][] matrix = new Double[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.println(
					"Introduceti elementul de pe linia " + (i + 1) + " si coloana " + (j + 1) + ": "
				);
				matrix[i][j] = scanner.nextDouble();
			}
		}
		return matrix;
	}

	public Double[][] multiply(Double[][] a, Double[][] b) {
		// NxM * MxP = NxP
		if (a[0].length != b.length) {
			System.out.println("Matricele nu pot fi inmultite.");
			return null;
		}

		Double[][] result = new Double[a.length][b[0].length];

		// Initialize the result matrix with 0.0 before doing the addition
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				result[i][j] = 0.; // Initialize to 0.0
			}
		}

		for (int i = 0; i < a.length; i++) for (int j = 0; j < b[0].length; j++) for (
			int k = 0;
			k < b.length;
			k++
		) result[i][j] += a[i][k] * b[k][j];

		return result;
	}

	public String toString(Double[][] matrix) {
		String result = matrix.length + " " + matrix[0].length + "\n";
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				result += matrix[i][j] + " ";
			}
			result += "\n";
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		MatrixMultiplier matrixMultiplier = new MatrixMultiplier();

		Double[][] matrix1 = matrixMultiplier.enterMatrix(scanner);

		Double[][] matrix2 = matrixMultiplier.enterMatrix(scanner);

		scanner.close();

		Double result[][] = matrixMultiplier.multiply(matrix1, matrix2);

		if (result != null) {
			System.out.println(matrixMultiplier.toString(result));
		}

		// Write the result to a file

		try {
			FileWriter fileWriter = new FileWriter("matrix.txt");
			fileWriter.write(matrixMultiplier.toString(result));
			fileWriter.close();
		} catch (IOException e) {
			System.out.println("Nu s-a putut scrie in fisier.");
		}
	}
}

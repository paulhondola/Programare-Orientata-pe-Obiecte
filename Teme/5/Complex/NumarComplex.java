import java.util.Scanner;

class NumarComplex {

	protected float real, imaginary;

	public NumarComplex(float real, float imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	public NumarComplex adunare(NumarComplex nr) {
		return new NumarComplex(real + nr.real, imaginary + nr.imaginary);
	}

	public static NumarComplex adunare(NumarComplex nr1, NumarComplex nr2) {
		return new NumarComplex(nr1.real + nr2.real, nr1.imaginary + nr2.imaginary);
	}

	public NumarComplex inmultire(NumarComplex nr) {
		return new NumarComplex(
			real * nr.real - imaginary * nr.imaginary,
			imaginary * nr.real + real + nr.imaginary
		);
	}

	public static NumarComplex inmultire(NumarComplex nr1, NumarComplex nr2) {
		return new NumarComplex(
			nr1.real * nr2.real - nr1.imaginary * nr2.imaginary,
			nr1.imaginary * nr2.real + nr1.real + nr2.imaginary
		);
	}

	public String toString() {
		return real + "+" + imaginary + "i";
	}

	// Input the matrix
	public static NumarComplex[][] inputMatrix(Scanner scanner) {
		System.out.print("Enter the number of rows: ");
		int n = scanner.nextInt();
		System.out.print("Enter the number of columns: ");
		int m = scanner.nextInt();
		NumarComplex[][] matrix = new NumarComplex[n][m];

		float real, imaginary;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.println(
					"Do you want to enter a real or complex number?\n1) Real\n2) Complex"
				);
				enum Choice {
					REAL,
					COMPLEX,
				}
				Choice c = Choice.values()[scanner.nextInt() - 1];
				switch (c) {
					case REAL:
						System.out.print("Enter the number: ");
						real = scanner.nextFloat();
						matrix[i][j] = new NumarReal(real);
						break;
					case COMPLEX:
						System.out.print("Enter the real part of the number: ");
						real = scanner.nextFloat();
						System.out.print("Enter the imaginary part of the number: ");
						imaginary = scanner.nextInt();
						matrix[i][j] = new NumarComplex(real, imaginary);
						break;
					default:
						System.out.println("Invalid choice");
						return null;
				}
			}
		}
		return matrix;
	}

	// Print the matrix
	public static void printMatrix(NumarComplex[][] matrix) {
		for (NumarComplex[] row : matrix) {
			for (NumarComplex nr : row) {
				System.out.print(nr + " ");
			}
			System.out.println();
		}
	}

	// Add two matrices
	public static NumarComplex[][] addMatrices(NumarComplex[][] matrix1, NumarComplex[][] matrix2) {
		if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
			System.out.println("The matrices have different dimensions");
			return null;
		}
		NumarComplex[][] result = new NumarComplex[matrix1.length][matrix1[0].length];
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[0].length; j++) {
				result[i][j] = matrix1[i][j].adunare(matrix2[i][j]);
			}
		}
		return result;
	}

	// Multiply two matrices
	public static NumarComplex[][] multiplyMatrices(
		NumarComplex[][] matrix1,
		NumarComplex[][] matrix2
	) {
		if (matrix1[0].length != matrix2.length) {
			System.out.println(
				"The number of columns of the first matrix must be equal to the number of rows of the second matrix"
			);
			return null;
		}
		NumarComplex[][] result = new NumarComplex[matrix1.length][matrix2[0].length];
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix2[0].length; j++) {
				result[i][j] = new NumarComplex(0, 0);
				for (int k = 0; k < matrix1[0].length; k++) {
					result[i][j] = result[i][j].adunare(matrix1[i][k].inmultire(matrix2[k][j]));
				}
			}
		}
		return result;
	}
}

class NumarReal extends NumarComplex {

	public NumarReal(float real) {
		super(real, 0);
	}

	public String toString() {
		return real + "";
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		NumarComplex[][] matrix1 = NumarComplex.inputMatrix(scanner);
		NumarComplex.printMatrix(matrix1);
		NumarComplex[][] matrix2 = NumarComplex.inputMatrix(scanner);
		NumarComplex.printMatrix(matrix2);
		NumarComplex[][] addResult = NumarComplex.addMatrices(matrix1, matrix2);
		if (addResult != null) {
			NumarComplex.printMatrix(addResult);
		}
		NumarComplex[][] multiplyResult = NumarComplex.multiplyMatrices(matrix1, matrix2);
		if (multiplyResult != null) {
			NumarComplex.printMatrix(multiplyResult);
		}
	}
}

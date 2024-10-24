import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Interval {

	private int start, end;
	private int totalCount = 0, totalIntervalCount = 0;
	private float percentage = 0;

	public Interval(int start, int end) {
		this.start = start;
		this.end = end;
	}

	public boolean isInRange(Float value) {
		return value >= start && value <= end;
	}

	public void computeInterval(Scanner scanner) {
		totalCount = 0;
		totalIntervalCount = 0;
		while (scanner.hasNextFloat()) {
			totalCount++;
			if (isInRange(scanner.nextFloat())) {
				totalIntervalCount++;
			}
		}
		computePercentage();
	}

	private void computePercentage() {
		if (totalCount == 0) percentage = 0;
		else percentage = ((float) totalIntervalCount / totalCount) * 100;
	}

	public String toString() {
		return (
			"Interval [" +
			start +
			", " +
			end +
			"] has " +
			totalIntervalCount +
			" values out of " +
			totalCount +
			" values. Percentage: " +
			percentage +
			"%"
		);
	}

	public void printToFile(PrintWriter output) {
		output.println(toString());
	}

	public static void main(String[] args) {
		try {
			File input1 = new File("input1.txt");

			File input2 = new File("input2.txt");

			File output = new File("output.txt");

			Scanner scanner = new Scanner(input1);

			PrintWriter writer = new PrintWriter(output);

			Interval interval = new Interval(0, 10);
			interval.computeInterval(scanner);
			interval.printToFile(writer);

			scanner = new Scanner(input2);

			interval.computeInterval(scanner);
			interval.printToFile(writer);

			scanner.close();
			writer.close();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}

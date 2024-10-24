import java.io.*;
import java.util.*;

public class IntervalComputer {

	private int filenameCount = 0;
	private String[] filenames;

	private int intervalCount = 0;
	private Interval[] intervals;

	private int resultCount = 0;
	private String[] results;

	private boolean[] isComputed;

	public IntervalComputer(int filenameCapacity, int intervalCapacity) {
		filenames = new String[filenameCapacity];
		intervals = new Interval[intervalCapacity];
		results = new String[filenameCapacity * intervalCapacity];
		isComputed = new boolean[filenameCapacity];

		for (int i = 0; i < isComputed.length; i++) {
			isComputed[i] = false;
		}
	}

	public boolean checkIfFileIsComputed(String filename) {
		for (int i = 0; i < filenameCount; i++) {
			if (filenames[i].equals(filename)) {
				for (int j = 0; j < intervalCount; j++) {
					if (!isComputed[i]) {
						return false;
					}
				}
				return true;
			}
		}
		return false;
	}

	// Input methods
	public void inputFiles(Scanner scanner) {
		try {
			while (scanner.hasNext() && filenameCount < filenames.length) {
				addFilename(scanner.next());
			}
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	public void inputIntervals(Scanner scanner) {
		try {
			while (scanner.hasNext() && intervalCount != intervals.length) {
				int start = scanner.nextInt();

				if (scanner.hasNext()) {
					int end = scanner.nextInt();
					addInterval(start, end);
				} else {
					System.out.println("Error: missing end value");
				}
			}
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	public void addFilename(String filename) {
		if (filenameCount == filenames.length) {
			System.out.println("Error: filename array is full");
			return;
		}
		filenames[filenameCount++] = filename;
	}

	public void addInterval(int start, int end) {
		if (intervalCount == intervals.length) {
			System.out.println("Error: interval array is full");
			return;
		}
		intervals[intervalCount++] = new Interval(start, end);
	}

	// To String methods
	public String filesToString() {
		String result = "";
		for (int i = 0; i < filenameCount; i++) {
			result += filenames[i] + "\n";
		}
		return result;
	}

	public String intervalsToString() {
		String result = "";
		for (int i = 0; i < intervalCount; i++) {
			result += intervals[i].toString() + "\n";
		}
		return result;
	}

	public String resultsToString() {
		String result = "";
		for (int i = 0; i < resultCount; i++) {
			result += results[i] + "\n";
		}
		return result;
	}

	// Error methods
	private void fileError(String filename) {
		System.out.println("Error: file " + filename + " does not exist");
	}

	// Compute methods
	public void computeAllIntervals() {
		try {
			for (int i = 0; i < filenameCount; i++) {
				// check if the file exists
				File file = new File(filenames[i]);
				if (!file.exists()) {
					fileError(filenames[i]);
					continue;
				}

				// check if the file is already computed
				if (checkIfFileIsComputed(filenames[i])) {
					continue;
				}

				computeInterval(filenames[i]);
				isComputed[i] = true;
			}
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	public void computeInterval(String filename) {
		try {
			for (int i = 0; i < intervalCount; i++) {
				Scanner scanner = new Scanner(new File(filename));
				intervals[i].computeInterval(scanner);
				results[resultCount++] = intervals[i].toString();
				scanner.close();
			}
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	// Main method
	public static void main(String[] args) {
		try {
			File fileInput = new File("files.txt");
			File numberInput = new File("intervals.dat");
			Scanner fileScanner = new Scanner(fileInput);
			Scanner numberScanner = new Scanner(numberInput);

			IntervalComputer ic = new IntervalComputer(10, 10);

			ic.inputFiles(fileScanner);
			ic.inputIntervals(numberScanner);

			ic.computeAllIntervals();

			//System.out.println(ic.filesToString());
			//System.out.println(ic.intervalsToString());

			File fileOutput = new File("output.txt");
			PrintWriter writer = new PrintWriter(fileOutput);
			System.out.println(ic.resultsToString());
			writer.println(ic.resultsToString());
			writer.close();
			fileScanner.close();
			numberScanner.close();
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}
}

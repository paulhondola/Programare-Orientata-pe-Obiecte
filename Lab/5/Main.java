import java.io.*;
import java.util.Random;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		try {
			int numarTelefoane = 0;
			File file = new File("date.txt");
			//Scanner scanner = new Scanner(System.in);
			Scanner scanner = new Scanner(file);

			System.out.println("Introduceti numarul de telefoane: ");
			numarTelefoane = scanner.nextInt();
			scanner.nextLine(); // consume newline

			Telefon[] telefoane = new Telefon[numarTelefoane];

			// citire numele proprietarilor
			for (int i = 0; i < numarTelefoane; i++) {
				System.out.print("Introduceti numele proprietarului " + (i + 1) + ":\n");
				String numeProprietar = scanner.nextLine();
				telefoane[i] = new Telefon(numeProprietar);
			}

			// simulare apeluri
			Random rand = new Random();

			int A = rand.nextInt(30) + 10;
			int[] x = new int[A];
			int[] y = new int[A];

			for (int i = 0; i < A; i++) {
				x[i] = rand.nextInt(numarTelefoane);
				y[i] = rand.nextInt(numarTelefoane);
				while (x[i] == y[i]) y[i] = rand.nextInt(numarTelefoane);
			}

			for (int i = 0; i < A; i++) {
				System.out.println(x[i] + " " + y[i]);
			}

			System.out.println("Apeluri: " + A);
			for (int i = 0; i < A; i++) {
				telefoane[x[i]].apeleaza(telefoane[y[i]]);
			}

			// afisare istoric apeluri
			for (int i = 0; i < numarTelefoane; i++) {
				System.out.println(telefoane[i]);
			}

			// Citire nume proprietar

			System.out.println(
				"Introduceti numele proprietarului pentru care doriti sa afisati istoricul apelurilor: "
			);

			String nume = scanner.nextLine();

			for (int i = 0; i < numarTelefoane; i++) {
				System.out.println(telefoane[i].numarDeApeluri(nume));
			}

			scanner.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.exit(1);
		}
	}
}

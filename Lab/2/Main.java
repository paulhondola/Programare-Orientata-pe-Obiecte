class Student {

	private String name;
	private int nrMatricol;
	private double medie;
	private static int nrStudenti = 0;

	// Constructors
	public Student(String name, int nrMatricol, double medie) {
		this.name = name;
		this.nrMatricol = nrMatricol;
		this.medie = medie;
		nrStudenti++;
	}

	// Getters

	// static field -> static method
	public static int getNrStudenti() {
		return nrStudenti;
	}

	public String getName() {
		return this.name;
	}

	public int getNrMatricol() {
		return this.nrMatricol;
	}

	public double getMedie() {
		return this.medie;
	}

	// Setters

	public static void setNrStudenti(int nrStudenti) {
		Student.nrStudenti = nrStudenti;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNrMatricol(int nrMatricol) {
		this.nrMatricol = nrMatricol;
	}

	public void setMedie(double medie) {
		this.medie = medie;
	}

	// Methods
	public void learn() {
		System.out.println("I am learning");
	}

	public void showData() {
		System.out.println(
			"Name: " + this.name + " | Nr Matricol: " + this.nrMatricol + " | Medie : " + this.medie
		);
	}
}

class Main {

	public static void main(String[] args) {
		Student s1 = new Student("Dan Basarab", 666, 9.99);
		s1.showData();
		System.out.println("Numarul de studenti: " + Student.getNrStudenti());

		Student s2 = new Student("Pol Petrol", 69, 4.99);
		s2.showData();
		System.out.println("Numarul de studenti: " + Student.getNrStudenti());

		Student.setNrStudenti(0);
		System.out.println("Numarul de studenti: " + Student.getNrStudenti());
	}
}

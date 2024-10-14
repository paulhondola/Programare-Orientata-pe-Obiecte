// OVERLOADING EXAMPLE

// acelasi nume la metoda
// sa difere tipul sau numarul de parametri
// tipul returnat nu conteaza
// 1 + 2 => semnatura metodei

class Student {

	private String name;
	private int studentID;

	public Student(String name, int studentID) {
		this.name = name;
		this.studentID = studentID;
	}

	public void enroll(String courseID) {
		System.out.println("Enrolled in " + courseID);
	}

	public void enroll(Course course) {
		System.out.println("Enrolled in " + course.getCourseID());
	}

	public String toString() {
		return name + " " + studentID;
	}
}

class Course {

	private String courseID;

	public Course(String courseID) {
		this.courseID = courseID;
	}

	public String getCourseID() {
		return courseID;
	}
}

class Test {

	/*
	public void idk(int a) {
		System.out.println("int");
	}

	public int idk(int a) {
		System.out.println("int2");
	}
	*/

	public static void main(String[] args) {
		Student tom = new Student("Tom", 123);
		Student jerry = new Student("Jerry", 456);

		Course oop = new Course("LM6-POO-2C");

		tom.enroll("LM6-POO-2C");
		jerry.enroll(oop);

		System.out.println(tom);
	}
}

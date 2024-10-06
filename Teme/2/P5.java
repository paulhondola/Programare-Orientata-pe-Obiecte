/* 5. Definiti o clasa Complex care modeleza lucrul cu numere complexe. Membrii acestei clase sunt:
• doua atribute de tip double pentru partile reala, respectiv imaginara ale numarului complex
• un constructor cu doi parametri de tip double, pentru setarea celor dou˘a p˘art¸i
ale num˘arului(real˘a ¸si imaginar˘a)
• o metod˘a de calcul a modulului num˘arului complex. Se precizeaz˘a c˘a modulul
unui num˘ar complex este egal cu radical din (re*re+img*img) unde re este
partea real˘a, iar img este partea imaginar˘a. Pentru calculul radicalului se va
folosi metoda static˘a predefinit˘a Math.sqrt care necesit˘a un parametru de tip
double ¸si returneaza tot un double
• o metod˘a de afi¸sare pe ecran a valorii num˘arului complex, sub forma re + i * im
• o metod˘a care returneaz˘a suma dintre dou˘a obiecte complexe. Aceast˘a metod˘a
are un parametru de tip Complex ¸si returneaz˘a suma dintre obiectul curent
(obiectul care ofer˘a serviciul de adunare) ¸si cel primit ca parametru. Tipul
returnat de aceast˘a metod˘a este Complex.
• o metod˘a care returneaz˘a de cˆate ori s-au afi¸sat pe ecran numere complexe.
Pe lˆang˘a clasa Complex se va defini o clas˘a ClientComplex care va cont¸ine ˆıntr-o
metoda main exemple de utilizare ale metodelor clasei Complex.
*/

class Complex {

	private static int nrAfisari = 0;
	double real, imaginar;

	public Complex(double real, double imaginar) {
		this.real = real;
		this.imaginar = imaginar;
	}

	public void afisare() {
		nrAfisari++;
		System.out.println(real + " + i * " + imaginar);
	}

	public Complex suma(Complex newComplex) {
		return new Complex(this.real + newComplex.real, this.imaginar + newComplex.imaginar);
	}

	public double modul() {
		return Math.sqrt(real * real + imaginar * imaginar);
	}

	public static int getNrAfisari() {
		return nrAfisari;
	}
}

class P5 {

	public static void main(String[] args) {
		Complex c1 = new Complex(1, 2);
		Complex c2 = new Complex(3, 4);
		Complex c3 = c1.suma(c2);
		c1.afisare();
		c2.afisare();
		c3.afisare();

		System.out.println("Numarul de afisari: " + Complex.getNrAfisari());
	}
}

class Book {

	private String title;
	private String author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String toString() {
		return title + " by " + author;
	}

	public boolean equals(Book book) {
		return title.equals(book.title) && author.equals(book.author);
	}
}

class Set {

	private Book[] books;
	private int index;
	private int size;

	public Set(int size) {
		this.books = new Book[size];
		this.size = size;
		this.index = 0;
	}

	public boolean add(Book book) {
		if (index >= size) return false;

		for (int i = 0; i < size; i++) if (books[i].equals(book)) return false;

		books[index++] = book;
		return true;
	}

	public Set union(Set celalaltSet) {
		Set rezultat = new Set(size + celalaltSet.size);

		for (int i = 0; i < index; i++) rezultat.add(books[i]);

		for (int i = 0; i < celalaltSet.index; i++) rezultat.add(celalaltSet.books[i]);

		return rezultat;
	}

	public void print() {
		for (int i = 0; i < index; i++) System.out.println(books[i]);
	}
}

class Main {

	public static void main(String[] args) {
		Book book1 = new Book("O scrisoare pierduta", "I.L. Caragiale");

		Book book2 = new Book("Enigma Otiliei", "George Calinescu");

		Set set1 = new Set(2);

		set1.add(book1);
		set1.add(book2);
	}
}

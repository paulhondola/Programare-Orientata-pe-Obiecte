class Book {

	private String title;
	private String author;

	// Constructor to initialize the book
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	// Getters for the title and author
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	// Overriding the equals method to compare books based on title and author
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Book) {
			Book other = (Book) obj;
			return this.title.equals(other.title) && this.author.equals(other.author);
		}
		return false;
	}

	// Overriding the toString method for printing the book details
	@Override
	public String toString() {
		return "Book: " + title + " by " + author;
	}
}

class Set {

	private Book[] books;
	private int size; // Current number of books in the set
	private int capacity; // Maximum number of books the set can hold

	// Constructor to initialize the set with a given capacity
	public Set(int capacity) {
		this.capacity = capacity;
		this.books = new Book[capacity]; // Array to store the books
		this.size = 0; // Initially the set is empty
	}

	// Method to add a book to the set
	public boolean addBook(Book book) {
		// Check if the set is already full
		if (size >= capacity) {
			return false; // Set is full, can't add more books
		}

		// Check if the book is already in the set
		for (int i = 0; i < size; i++) {
			if (books[i].equals(book)) {
				return false; // Book is already in the set
			}
		}

		// If the book is not already in the set, add it
		books[size] = book;
		size++; // Increment the size of the set
		return true; // Book added successfully
	}

	// Method to perform union of two sets
	public static Set union(Set set1, Set set2) {
		Set resultSet = new Set(set1.capacity + set2.capacity); // Create a new set with combined capacity

		// Add all books from set1
		for (int i = 0; i < set1.size; i++) {
			resultSet.addBook(set1.books[i]);
		}

		// Add books from set2 if they are not already in the resultSet
		for (int i = 0; i < set2.size; i++) {
			resultSet.addBook(set2.books[i]);
		}

		return resultSet;
	}

	// Method to print the books of the set
	public void printSet() {
		for (int i = 0; i < size; i++) {
			System.out.println(books[i]);
		}
	}
}

public class SetClient {

	public static void main(String[] args) {
		// Create two sets with a maximum capacity of 5
		Set set1 = new Set(5);
		Set set2 = new Set(5);

		// Create some books
		Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
		Book book2 = new Book("1984", "George Orwell");
		Book book3 = new Book("To Kill a Mockingbird", "Harper Lee");
		Book book4 = new Book("The Catcher in the Rye", "J.D. Salinger");
		Book book5 = new Book("Moby Dick", "Herman Melville");

		// Add books to the first set
		System.out.println(set1.addBook(book1)); // Should print true
		System.out.println(set1.addBook(book2)); // Should print true
		System.out.println(set1.addBook(book3)); // Should print true
		System.out.println(set1.addBook(book1)); // Should print false (duplicate)

		// Add books to the second set
		System.out.println(set2.addBook(book3)); // Should print true
		System.out.println(set2.addBook(book4)); // Should print true
		System.out.println(set2.addBook(book5)); // Should print true

		// Print both sets
		System.out.println("Set 1:");
		set1.printSet();

		System.out.println("Set 2:");
		set2.printSet();

		// Perform union of set1 and set2
		Set unionSet = Set.union(set1, set2);

		// Print the union set
		System.out.println("Union of Set 1 and Set 2:");
		unionSet.printSet();
	}
}

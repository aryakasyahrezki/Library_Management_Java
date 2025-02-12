package library;

import java.util.ArrayList;

public class Library {
	private ArrayList<Book> libraryBooks;
	
	public Library() {
		libraryBooks = new ArrayList<>();
	}
	
	public void addBook(Book book) {
		libraryBooks.add(book);
		System.out.println("Book added to library: " + book.getTitle());
	}
	
	public void borrowBook(Borrower borrower, Book book) {
		if (libraryBooks.contains(book)) {
            libraryBooks.remove(book);
            borrower.addBorrowedBook(book);
            System.out.println(borrower.getName() + " borrowed: " + book.getTitle());
        } else {
            System.out.println("Book is not available in the library.");
        }
	}
	
	public void returnBook(Borrower borrower, Book book) {
		System.out.println(borrower.getName() + " returned: " + book.getTitle());
		libraryBooks.add(book);
		borrower.removeBorrowedBook(book);
	}
	
	public void displayLibraryBooks() {
		if(libraryBooks.isEmpty()) {
			System.out.println("There's no book in the library");
		}
		else {
			System.out.println("Books in Library:");
			for(Book b : libraryBooks) {
				System.out.println(b);
			}
		}
	}

}

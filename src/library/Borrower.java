package library;

import java.util.ArrayList;

public class Borrower {
	private String name;
	private ArrayList<Book> borrowedBooks;
	
	public Borrower(String name) {
		this.name = name;
		borrowedBooks = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	
	public void addBorrowedBook(Book book) {
		borrowedBooks.add(book);
	}
	
	public void removeBorrowedBook(Book book) {
		if(borrowedBooks.contains(book)) {
			borrowedBooks.remove(book);
		}
		else {
			System.out.println(name + " did not borrow that book.");
		}
		
	}
	
	public void displayBorrowedBooks() {
		if(borrowedBooks.isEmpty()) {
			System.out.println(name + "has not borrowed any book yet");
		}
		else {
			System.out.println(name + "'s Borrowed Books: ");
			for(Book b : borrowedBooks) {
				System.out.println(b);
			}
		}
	}

}

package library;

public class Book {
	private String title;
	private String ISBN;
	private Author author;

	public Book(String title, String ISBN, Author author) {
		this.title = title;
		this.ISBN = ISBN;
		this.author = author;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getISBN() {
		return ISBN;
	}
	
	public Author getAuthor() {
		return author;
	}

	@Override
    public String toString() {
        return "Title: " + title + "\n" +
               "ISBN: " + ISBN + "\n" +
               "Author: " + author.getName() + "\n" +
               "Biography: " + author.getBiography() + "\n" + 
        	   "------------------------";	
	}
	
}

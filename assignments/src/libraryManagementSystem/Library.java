package libraryManagementSystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Library {
	
     ArrayList<Book> books; // Declare the ArrayList<Book> attribute

    public Library() {       // constructor for library class
        this.books = new ArrayList<>(); // Initialize the ArrayList
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }
    
    // Method to remove a book from the library using its ISBN
    public void removeBook(String iSBN) {
    	Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getISBN().equals(iSBN)) {
                iterator.remove();
            }
        }
    }

    
     // Method to search a book by its title  
        public Book searchBookByTitle(String title) {
            for (Book book : books) {
                if (book.getTitle().equalsIgnoreCase(title)) {
                    return book; // Return the first matching book
                }
            }
            return null; // title not found 	 
    }
        // Method to search a book by its author
        public Book searchBookByAuthor(String author) {
            for (Book book : books) {
                if (book.getAuthor().equalsIgnoreCase(author)) {
                    return book; // Return the first matching book
                }
            }
            return null; // author not found

        }

     // Method to list all books in the library
        public void listBooks() {
        	for (Book book : books) {
                book.displayBookDetails();
                System.out.println();

        }
        }

        // Method to count books by category 
        public int countBooksByCategory(String category) {
            int count = 0;
            for (Book book : books) {
                if (book.getCategory().equals(category)) {
                    count++;

                }
           
        }
            return count;
        }
        
        // method to validate ISBN
        public void validateISBN(String iSBN) {
        	for (Book book : books) {
        		if (book.getISBN().equals(iSBN)) {
        			System.out.println(iSBN + " is a valid ISBN");
        			return;
        		}
        	}
        	System.out.println("Invalid ISBN");
        	
        }
        
        // method to validate ISBN using regular expression
        private static final String ISBN_PATTERN = "^[0-9]{7}$";
        private Pattern pattern = Pattern.compile(ISBN_PATTERN);
        private Matcher matcher;

        public boolean validateISBNNumber(String iSBN) {
            matcher = pattern.matcher(iSBN);
            return matcher.matches();

        }
       
               	
        }
        
        




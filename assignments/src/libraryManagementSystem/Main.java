package libraryManagementSystem;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Library library = new Library(); //creating an instance of the Library class
		
    // implementation of the add method
        library.addBook(new Book("Red Mist", "Patricia Cornwell", "Drama", "1000982"));
        library.addBook(new Book("This time forever", "Vickie Moore", "Romance", "1000522"));
        library.addBook(new Book("Celebrity in Death", "J.D Robb", "Detective", "1000476"));
        library.addBook(new Book("Eye of the Needle", "Ken Follet", "Crime", "1000431"));
        library.addBook(new Book("The Demon Code", "Joe Mason", "Thriller", "1000768"));
        library.addBook(new Book("Angels & Demons", "Ken Follet", "Thriller", "1000644"));
		
	// implementation of a method to display all books
      library.listBooks();
      
    //implementation of a method to search books by title
      String searchTitle = "Eye of the Needle";
      Book myBook = library.searchBookByTitle(searchTitle);
      if (myBook != null) {
          System.out.println("Book found:");
          System.out.println(myBook.getTitle());
      } else {
          System.out.println("Book not found.");
         
      }
      System.out.println();

    // implementation of a method to search books by Author
      String favouriteAuthor = "Ken Follet";
      Book myAuthor = library.searchBookByAuthor(favouriteAuthor);
      if (myAuthor != null) {
          System.out.println("Author exists:");
          System.out.println(myBook.toString());
      } else {
          System.out.println("Author doesnt exist.");
      }
      System.out.println();
    

   // implementation of a method to count books by category 
      String categoryCheck = "Thriller";
      library.countBooksByCategory(categoryCheck);
      System.out.println();
   
   // implementation of a method to validate ISBN
      library.validateISBN("1000431");
      System.out.println();
      
   // implementation of a method to validate ISBN pattern using Rejex
      String iSBNPattern = "1000431";
      boolean iSBNFound = library.validateISBNNumber(iSBNPattern);
      System.out.println("Is the ISBN number valid? " + iSBNFound);
      System.out.println();
 
    // implementation of the count method by category"
      String category = "Thriller";
      int count = library.countBooksByCategory(category);
      System.out.println("Number of books in category " + category + " is " + " " +  count);
      System.out.println();
      
      // implement a method to remove a book using ISBN
//      library.removeBook("1000431");
      
//      library.listBooks();

    }

  }


	



package libraryManagementSystem;

public class Book {
	
	private String title;
	private String author;
	private String category;
	private String iSBN;
	
	public Book (String title, String author, String category, String iSBN ) {
		this.title = title;
		this.author = author;
		this.category = category;
		this.iSBN = iSBN;
	}
	
	public void displayBookDetails() {
		System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Category: " + category);
        System.out.println("ISBN: " + iSBN);
    }

	
	public String toString () {
        return "Title: " + title + ", Author: " + author + ", Category: " + category + ", ISBN: " + iSBN;
    }

   
	
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getCategory() {
		return category;
	}
	public String getISBN() {
		return iSBN;
	}
	public void setTitle(String newTitle) {
		
	}
    public void setAuthor(String newAuthor) {
		
	}
    public void setCategory(String newCategory) {
	
    }
    public void setISBN(String newISBN) {
	
    }
	}

	
	


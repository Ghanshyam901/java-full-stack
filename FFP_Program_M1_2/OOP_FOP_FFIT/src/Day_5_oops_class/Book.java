package Day_5_oops_class;

public class Book {
    private int Id;
    private String BookName,Author ,Publisher;

    public  Book(){
    	
    }
	public Book(int id, String bookName, String author, String publisher) {
		super();
		Id = id;
		BookName = bookName;
		Author = author;
		Publisher = publisher;
	}
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getPublisher() {
		return Publisher;
	}
	public void setPublisher(String publisher) {
		Publisher = publisher;
	}

	@Override
	public String toString() {
		return "Book [Id=" + Id + ", BookName=" + BookName + ", Author=" + Author + ", Publisher=" + Publisher + "]";
	}
    
    
}

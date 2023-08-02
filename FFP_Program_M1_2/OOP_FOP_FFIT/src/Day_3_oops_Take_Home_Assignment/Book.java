package Day_3_oops_Take_Home_Assignment;

public abstract class Book {
	String title;
	abstract String setTitle();
	
	public String getTitle(){
		return title;
	}
	
}class MyBook extends Book{
	
	MyBook(){
		
	}
	
	@Override
	String setTitle() {
		
		return "The title of my book is : "+title;
	}
	
	
}

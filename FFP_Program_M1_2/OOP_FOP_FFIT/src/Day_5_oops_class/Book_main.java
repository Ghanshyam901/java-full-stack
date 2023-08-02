package Day_5_oops_class;


import java.util.Collection;
import java.util.TreeMap;

public class Book_main {

	public static void main(String[] args) {
		
		TreeMap<Integer,Book> map = new TreeMap<>();
		
		Book st = new Book(1,"sk","Eddy","johnsone book");
		Book st2 = new Book(3,"sk","Eddy","johnsone book");
		Book st4 = new Book(1,"sk","Eddy","johnsone book");
	
		
		map.put(st.getId(),st);
		map.put(st2.getId(),st2);
		map.put(st4.getId(),st4);

		System.out.println(map);
		

	}

}

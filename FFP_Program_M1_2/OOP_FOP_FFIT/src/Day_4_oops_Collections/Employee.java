package Day_4_oops_Collections;



public class Employee implements Comparable <Employee> {
	private int id;
	private String name,address;
	
	public Employee(){
		
	}

	public Employee(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int compare(String o1, String o2) {
        if (o1 == null && o2 == null){return 0;}
        if (o1 == null) { return -1;}
        if (o2 == null) { return 1;}
        return o1.compareTo(o2);
    }


	@Override
	public int compareTo(Employee o1) {
		return 	name.compareTo(o1.getName());
	
	}
	
//	@Override
//	public int compareTo(Employee o) 
//	{
//		return -Integer.compare(id,o.getId());
//	}
	
	
}

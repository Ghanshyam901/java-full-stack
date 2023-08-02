package Day_2_oops_inhertance_vechicle;

public class Vehicle {
	
	private String name;
	
	public Vehicle(){
		
	}
	
	public Vehicle(String name) {
		
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + "]";
	}
	
	
	
	
		
}

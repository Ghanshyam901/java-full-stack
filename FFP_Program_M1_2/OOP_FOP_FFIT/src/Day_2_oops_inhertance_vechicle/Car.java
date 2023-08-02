package Day_2_oops_inhertance_vechicle;

public class Car extends Vehicle {

	private String color;
	private int size;
	
	public Car(){
		
	}
	



	public Car(String name, String color, int size) {
		super(name);
		this.color = color;
		this.size = size;
	}




	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		
		return  super.toString() + "Car [color=" + color + ", size=" + size + "]";
	}
	
	
	
	
}

package Day_2_oops_inhertance_vechicle;

public class Bike extends Car {
	
	private int model;

	public Bike(){
		super();
	}

	public Bike(String name, String color, int size, int model) {
		super(name, color, size);
		this.model = model;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return super.toString() + "Bike [model=" + model + "]";
	}

	
	


	
	
	
}

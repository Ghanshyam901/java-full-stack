package Day_1_OOPS_JAVA_DAY7;

public class Triangle {
	
	private  int Base,Height;
	
	public Triangle(){
		
	}
	
	public Triangle(int Base , int Height){
		this.Base = Base;
		this.Height = Height;
	}
	
	public int getBase() {
		return Base;
	}

	public void setBase(int base) {
		Base = base;
	}

	public int getHeight() {
		return Height;
	}

	public void setHeight(int height) {
		Height = height;
	}

	public float perimeter(){
		return 0.5f*(Base*Height);
	}

	@Override
	public String toString() {
		return "Triangle [perimeter()=" + perimeter() + "]";
	}

	

	
	

}

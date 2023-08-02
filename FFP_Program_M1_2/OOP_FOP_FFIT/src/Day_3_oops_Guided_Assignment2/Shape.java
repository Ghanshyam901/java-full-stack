package Day_3_oops_Guided_Assignment2;

public abstract class Shape {
	
   abstract double getArea();
   abstract void printDetails();
   
}class Rectangle extends Shape{
	
	double length;
	double breadth;

	
	public Rectangle(){
		
	}
	
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	double getArea() {
		return length*breadth;
	}

	@Override
	void printDetails() {
		System.out.println("Type = Rectangle");
		System.out.println("Length = "+length);
		System.out.println("Breadth = "+breadth);
		
	}
	
}class Circle extends Shape{

	double radius;
	
	
	public Circle(){
		
	}
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	@Override
	double getArea() {
		
		return 3.14*radius*radius;
	}
	@Override
	void printDetails() {
		System.out.println("Type = Circle");
		System.out.println("Raduis = "+radius);
	}
	
}class Triangle extends Shape{

	double base;
	double height;
	
	public Triangle(){
		
	}
	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}
	@Override
	double getArea() {
		
		
		return 0.5*base*height;
	}
	@Override
	void printDetails() {
		System.out.println("Type = Triangle");
		System.out.println("Base = "+base);
		System.out.println("Height = "+height);
	}
	
}

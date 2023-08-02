package Day_1_OOPS_JAVA_DAY7;

import java.text.DecimalFormat;

public class Circle {
	
	float pi = 3.14f;
	int r;
	
	public void area(){
		double res =  pi*r*r;
		System.out.printf("%.2f" , res);
		
	}
	public void perimeter(){
		double res = 2*pi*r;
		
		System.out.printf("%.2f" , res);
		
	}
	
	 public void circum()
	  {
		  double res= 2*pi*r;
		  System.out.printf("%.2f",res);
	  }
	  public float circum2()
	  {
		 float res= 2*pi*r;
		 DecimalFormat d=new DecimalFormat("#.##");
		 float f=Float.valueOf(d.format(res));
		 return f;
	  }
	
	
}

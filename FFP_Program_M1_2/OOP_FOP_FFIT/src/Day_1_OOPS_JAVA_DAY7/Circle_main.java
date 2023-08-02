package Day_1_OOPS_JAVA_DAY7;

public class Circle_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Circle c1 = new Circle();
			c1.r=3;
			c1.area();
			System.out.println();
			c1.perimeter();
			
			
	}

}

//
///* public void circum()
//{
//	  double res= 2*pi*r;
//	  System.out.printf("%.2f",res);
//}*/
//public float circum()
//{
//	 float res= 2*pi*r;
//	 DecimalFormat d=new DecimalFormat("#.##");
//	 float f=Float.valueOf(d.format(res));
//	 return f;
//}
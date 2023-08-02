package Day_6_oops_TakeHomeAssignment;

public abstract class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TicketDispenser t = new TicketDispenser();
		
		Thread t1 = new Thread(){
			public void run(){
			 String allotSeat = t.allotSeatNumber(10);
				System.out.println("allotted seat numbers are 1: "+allotSeat);
			  }
			};
		t1.start();
		
		Thread t2 = new Thread(){
			
			public void run(){
			
			 String allotSeat = t.allotSeatNumber(40);
			
			  System.out.println("allotted seat numbers are 2: "+allotSeat);
		  }
		};
//		
		t2.start();
		
		Thread t3 = new Thread(){
			public void run(){
			String allotSeat = t.allotSeatNumber(14);
			System.out.println("allotted seat numbers ares 3: "+allotSeat);
			}
		};
		t3.start();
//		
		Thread t4 = new Thread(){
			public void run(){
			String allotSeat = t.allotSeatNumber(14);
			   System.out.println("allotted seat numbers ares 4 : "+allotSeat);
			}
		};
		t4.start();

	}

}

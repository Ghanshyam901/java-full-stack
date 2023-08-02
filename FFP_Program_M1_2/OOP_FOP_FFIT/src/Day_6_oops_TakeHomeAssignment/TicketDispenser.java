package Day_6_oops_TakeHomeAssignment;

public class TicketDispenser {
	private int Seats = 1;
	
	public synchronized String allotSeatNumber(int seatsWant){
		
		StringBuilder sb = new StringBuilder();
		
		if(Seats <= 100 ){
			
			try {
				Thread.sleep(1000);
				for(int i=0; i<seatsWant; i++){
					if(Seats > 100) break;
					
					sb.append(Seats++ +" ,");
				}
				String seatsBooked = sb.substring(0,sb.length()-1);
				return seatsBooked;
			} catch (Exception e) {
				
				
			}
			
			
		}else{
			return  "No Seats Available";
		}
		return "No Seats Available";
	}
}

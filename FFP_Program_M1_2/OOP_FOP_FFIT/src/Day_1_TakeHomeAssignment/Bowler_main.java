package Day_1_TakeHomeAssignment;

public class Bowler_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bowler b1 = new Bowler("rahul",0,5,750,1963);
		
		b1.computeBowlingAverage(b1.getName(),b1.getWicket(),b1.getMatches(),b1.getBalls_Bowled(),b1.getRun_Concerned());
		b1.showStatistics(b1.getName(),b1.getWicket(),b1.getMatches(),b1.getBalls_Bowled(),b1.getRun_Concerned());
		b1.computeStrikeRate(b1.getName(),b1.getWicket(),b1.getMatches(),b1.getBalls_Bowled(),b1.getRun_Concerned());

		
	
	}

}

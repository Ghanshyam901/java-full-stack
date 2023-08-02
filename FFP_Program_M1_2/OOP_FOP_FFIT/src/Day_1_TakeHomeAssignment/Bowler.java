package Day_1_TakeHomeAssignment;

import java.text.DecimalFormat;

public class Bowler {
	
	private String Name;
	private int Wicket;
	private int Matches;
	private int Balls_Bowled;
	private int Run_Concerned;
	
	public Bowler(){
		
	}

	public Bowler(String name, int wicket, int matches, int balls_Bowled, int run_Concerned) {
		super();
		Name = name;
		Wicket = wicket;
		Matches = matches;
		Balls_Bowled = balls_Bowled;
		Run_Concerned = run_Concerned;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getWicket() {
		return Wicket;
	}

	public void setWicket(int wicket) {
		Wicket = wicket;
	}

	public int getMatches() {
		return Matches;
	}

	public void setMatches(int matches) {
		Matches = matches;
	}

	public int getBalls_Bowled() {
		return Balls_Bowled;
	}

	public void setBalls_Bowled(int balls_Bowled) {
		Balls_Bowled = balls_Bowled;
	}

	public int getRun_Concerned() {
		return Run_Concerned;
	}

	public void setRun_Concerned(int run_Concerned) {
		Run_Concerned = run_Concerned;
	}
	
	public void computeBowlingAverage(String Name ,int Wicket , int Matches , int Balls_Bowled , int Run_Concerned ){
		
		if(Matches < 0 || Balls_Bowled < 0 || Wicket <= 0 || Run_Concerned < 0){
			System.out.println("Error");
		}else if( (Balls_Bowled > 0 && Matches <= 0 ) || (Run_Concerned > 0 && Matches <= 0 ) ){
			System.out.print("Error");
		}else{
			double avg = Run_Concerned/Wicket;
			System.out.println("Name : "+ Name);
			System.out.println("Bowling Avg : "+ avg);
			
		}
		
	}
	
	public void showStatistics(String Name ,int Wicket , int Matches , int Balls_Bowled , int Run_Concerned ){
		
		if(Matches < 0 || Balls_Bowled < 0 || Wicket < 0 || Run_Concerned < 0){
			System.out.println("Error");
		}else if( (Balls_Bowled > 0 && Matches <= 0 ) || (Run_Concerned > 0 && Matches <= 0 ) ){
			System.out.print("Error");
		}else{
			System.out.println();
			System.out.println("Name : "+Name);
			System.out.println("Wicket : "+Wicket);
			System.out.println("Matches : "+Matches);
			System.out.println("Balls_Bowled : "+Balls_Bowled);
			System.out.println("Run_Concerned : "+Run_Concerned);
		}
		
	}
	
	public void computeStrikeRate(String Name ,int Wicket , int Matches , int Balls_Bowled , int Run_Concerned){
		
		if(Matches < 0 || Balls_Bowled < 0 || Wicket <= 0 || Run_Concerned < 0){
			System.out.println("Error");
		}else if( (Balls_Bowled > 0 && Matches <= 0 ) || (Run_Concerned > 0 && Matches <= 0 ) ){
			System.out.print("Error");
		}else{
			float strike = Run_Concerned/Balls_Bowled;
			
			System.out.println();
			System.out.println("Name : "+ Name);
			System.out.println("Strike rate : "+ strike);
		}
		
	}

	

}

package guided_day_1;



import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;


public class Main {
   
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
        String inputDate = scn.next();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            LocalDate Date = LocalDate.parse(inputDate, formatter);
            String dayOfWeek = Date.getDayOfWeek().toString();

            System.out.println(dayOfWeek);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid");
        }
    }
}

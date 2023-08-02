import java.util.Scanner;

class Assign1{
    public static void main(String[] args) {

        try (Scanner scn = new Scanner(System.in)) {
            double minutInYear = 60*24*365;
            System.out.print("Enter minutes : ");
            
            double minute = scn.nextDouble();
            long years = (long) (minute/minutInYear); // for calculating years 
            int days = (int)(minute/60/24) %365;  // for calculating days

            System .out.println("Total "+years+ " years and "+ days + " days");
        }
    }
}

// Write a Java program to convert minutes into the number of years, days
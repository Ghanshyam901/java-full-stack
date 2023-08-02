import java.util.Scanner;

public class Assign2 {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter Input ");

        int num = scn.nextInt();
        if(num < 1){
            System.out.print("please Enter posive input :(");

        }else{
            int nextMultipleOf100 = ((num / 100) + 1) * 100;
        
            System.out.println("Next Multiple of 100 is :- " + nextMultipleOf100);
        }
        
      

        
    }
}

// Write a program to get the next multiple of 100

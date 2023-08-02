import java.util.Scanner;

class Program1{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter input :- ");
        int num = scn.nextInt();

        int r = 0;

        while(num != 0){
            int rem = num%10;
            r = r*10+rem;
            num=num/10;
        }
        System.out.println(r);


    }
}
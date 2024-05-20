import java.util.Scanner;

public class PractingCondicions {
    public static void main (String [] args) {
       // Write a program to check whether a number is divisible by 5 and 11 or not!
        Scanner numIs = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int userNum = numIs.nextInt();
        if (userNum % 2 == 0)
            System.out.println("Even Number");

        else
            System.out.println("Odd Number");


    }
}
package replitProjects;

import java.util.Scanner;

public class TrueOrFalseValueofMultiplyNumbers {
    /*Write a java program that prints out true if ( x * y ) returns a positive value. Else prints out false if  (x * y) returns a negative value.

Step 1: Your program should ask "Please enter first number" - for the 1st number and "Please enter second number" - for the 2nd number.

Step 2: Create if condition to check if the multiplication of x and y values is positive or negative.

If the result of a multiplication is positive print true, otherwise print false.
     */



    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        System.out.println("Please enter fist number");
        int x = myScan.nextInt();

        System.out.println("Please enter your second number");
        int y = myScan.nextInt();


        if (x*y>0){
            System.out.println("True");

        }else {
            System.out.println("false");
        }













    }
}

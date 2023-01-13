package HomeWork;

import java.util.Scanner;

public class LargestOf3NumbersLogicalOperators {
    public static void main(String[] args) {

      //Write a program to find the largest number among three numbers using
        // if else if condition provided by a user (numbers must be distinct)

        Scanner myScan = new Scanner(System.in);

        System.out.println("enter your first number");
        double firstNum = myScan.nextDouble();

        System.out.println("Enter your second number");
        double secondNum = myScan.nextDouble();

        System.out.println("Enter your third number");
        double thirdNum = myScan.nextDouble();

        if (firstNum>secondNum&&firstNum>secondNum){
            System.out.println(firstNum+" is the largest number");
        } else if (secondNum>firstNum&&secondNum>thirdNum) {
            System.out.println(secondNum+" is the largest number");

        } else if (thirdNum>firstNum&&thirdNum>secondNum) {
            System.out.println(thirdNum+" is the largest number");

        }


    }
}

package HomeWork;

import java.util.Scanner;

public class LargestOf3NumNestedIfStatment {
    public static void main(String[] args) {

        //Write a program to find the largest number among three numbers using
        // nested if provided by a user (numbers must be distinct)

        Scanner myScan = new Scanner(System.in);

        System.out.println("Enter your first number");
        int firstNum = myScan.nextInt();

        System.out.println("enter your second number");
        int secondNum = myScan.nextInt();

        System.out.println("enter your third number");
        int thirdNum = myScan.nextInt();

        if (firstNum > secondNum)
            if (firstNum > thirdNum) {
                System.out.println(firstNum + " is the largest number");
            }
        if (secondNum > firstNum)
            if (secondNum > thirdNum) {
                System.out.println(secondNum + " is the largest number");
            } else {
                System.out.println(thirdNum + " is the largest number");
            }
    }

}



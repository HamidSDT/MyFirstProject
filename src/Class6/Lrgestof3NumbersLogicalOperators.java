package Class6;

import java.util.Scanner;

public class Lrgestof3NumbersLogicalOperators {
    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);

        int number1 , number2 , number3;

        System.out.println("Please enter 3 Numbers");
        number1 = myScan.nextInt();
        number2 = myScan.nextInt();
        number3 = myScan.nextInt();

        if (number1>number2&&number1>number3){
            System.out.println("The Largest number is "+number1);

        } else if (number2>number1&&number2>number3) {
            System.out.println("The largest umber is "+number2);

        } else if (number3>number1&&number3>number2) {
            System.out.println("The largest number is "+number3);

        }


    }
}

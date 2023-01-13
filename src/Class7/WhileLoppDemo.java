package Class7;

import java.util.Scanner;

public class WhileLoppDemo {
    public static void main(String[] args) {

        boolean condition = true;
        int number = 10;
        Scanner myScan = new Scanner(System.in);

        while (condition){
            System.out.println("Please Enter a Number between 10 to 20");
           int userInput = myScan.nextInt();
            if (userInput>number){
                System.out.println("Your entered number is greater");
            } else if (userInput<number) {
                System.out.println("You entered smaller number");

            }else {
                System.out.println("You won!!!");
                condition=false;
            }


        }






    }
}

package Class5;

public class GreatestOf3Numbers {
    public static void main(String[] args) {
     /* write a program to find the largest of 3 numbers using nested if condition
      */

        int number1 = 10000, number2 = 20, number3 = 100;

        if (number1>number2){
            if (number1>number3){
                System.out.println("The largest number is "+number1);
            }
        }

        if (number2>number1){
            if (number2>number3){
                System.out.println("The largest number is "+number2);
            }
        }

        if (number3>number1){
            if (number3>number2){
                System.out.println("the largest number is "+number3);
            }
        }


    }
}

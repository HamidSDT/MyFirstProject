package day6Hw;

public class OddNumBetween20And50 {
    public static void main(String[] args) {
        //Print odd numbers between 20 and 50 (2 ways)
        int number1 = 21;

        while (number1 < 50) {
            System.out.println(number1);
            number1 = number1 + 2;
        }
        System.out.println("**************************");

        int number2 = 20;

        while (number2 < 50) {

            if (number2 % 2 != 0) {

                System.out.println(number2);
            }
            number2++;

        }


    }
}

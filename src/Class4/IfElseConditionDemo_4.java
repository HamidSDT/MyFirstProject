package Class4;

public class IfElseConditionDemo_4 {
    public static void main(String[] args) {

        int number1 = 10;
        int number2 = 10;

        /* if number1 is equal to number2 on counsel => numbers are equal
        if number1>number2 => number1 is greater than number2
        if number2>number1 => Number2 is greater than number1
         */

        if (number1==number2){
            System.out.println("numbers are equal");
        } else if (number1>number2) {
            System.out.println("number1 is greater than number2");
        } else if (number2>number1) {
            System.out.println("number2 is greater than number1");
        }


    }
}

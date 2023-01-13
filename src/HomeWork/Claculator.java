package HomeWork;

import java.util.Scanner;

public class Claculator {
    public static void main(String[] args) {
        /*HomeWork: Using scanner class create calculator.
        Allow user to enter 2 numbers and operator(+,-,*,/).
        Based on operator provide the result to user  */

        Scanner myScan = new Scanner(System.in);

        System.out.println("enter your first number");
        int firstNum = myScan.nextInt();

        System.out.println("enter your second number");
        int secondNum = myScan.nextInt();

        System.out.println("Enter operator (+,-,*,/)");
        char operator = myScan.next().charAt(0);


        switch (operator){
            case '+':
                System.out.println("The result of "+firstNum+" + "+secondNum+" = "+(firstNum+secondNum));break;
            case '-':
                System.out.println("The result of "+firstNum+" - "+secondNum+" = "+(firstNum-secondNum));break;
            case '*':
                System.out.println("The result of "+firstNum+" * "+secondNum+" = "+(firstNum*secondNum));break;
            case '/':
                System.out.println("The result of "+firstNum+" / "+secondNum+" = "+(firstNum/secondNum));break;






        }



















    }
}

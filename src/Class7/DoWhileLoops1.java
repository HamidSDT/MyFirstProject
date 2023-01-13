package Class7;

import java.util.Scanner;

public class DoWhileLoops1 {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);


     /*   int number =0;

        do {
            System.out.println("Please Enter a number");
           number=myScan.nextInt();
        }while (number!=5);
*/
        int number2 =5;

        while (number2!=5){
            System.out.println("Please Enter a number");
            number2 = myScan.nextInt();
        }



    }
}

package HomeWork;

import java.util.Scanner;

public class GradesA_D {
    public static void main(String[] args) {
  /*Allow user to enter grade and then provide explanation:
  A-Excellent, B-Good, C-Average, D-Bad,
  any other grade --> Not Acceptable. At the end your program should print
   which grade was entered by a user with explanation. */

        Scanner myScan = new Scanner(System.in);

        System.out.println("enter your grade");
        char grade = myScan.next().charAt(0);

        if (grade=='A'){
            System.out.println("Excellent");
            System.out.println("you entered "+grade+" and "+grade+" is an Excellent Grade");
        } else if (grade=='B') {
            System.out.println("Good");
            System.out.println("you entered "+grade+" and "+grade+" is a Good Grade");

        } else if (grade=='C') {
            System.out.println("Average");
            System.out.println("you entered "+grade+" and "+grade+" is an Average Grade");

        } else if (grade=='D') {
            System.out.println("Bad");
            System.out.println("you entered "+grade+" and "+grade+" is a Bad Grade");

        }else {
            System.out.println("Not acceptable Grade");
        }


    }
}

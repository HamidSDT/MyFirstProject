package HomeWork;

import java.util.Scanner;
/*Prompt the user to enter person heights in inches. Person should be classified as one of the following:
• short (under 60 inch)
• medium(between 60 -72 inch)
• tall (over 72 inch)
 */

public class PersonHeight {
    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);

        System.out.println("Please Enter your Height");
        int height = myScan.nextInt();

        if (height<60){
            System.out.println("You are height"+height+" you are short");

        } else if (height>=60 && height <=72) {
            System.out.println("You are height is"+height+" you are medium ");

        }else if (height>72)
            System.out.println("your height is "+height+" you are tall");
        }


    }


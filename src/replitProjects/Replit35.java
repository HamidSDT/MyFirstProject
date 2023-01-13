package replitProjects;

import java.util.Scanner;

public class Replit35 {
   /* Create a program that prompt user with question:  "Do you need a loan?"(Use a boolean)

If the result is true then prompt user with question: "What is your credit score?". Otherwise, eligibility is "Unknown"

Based on the score define users eligibility:

- if score is below  600 --> eligibility = "Not eligible"
- if score is between 600 and 700 inclusive -->  eligibility = "Maybe eligible"
- if score is between 701 and 800 inclusive -->  eligibility = "Eligible"
- if score is higher than any other previous values --> eligibility = "Definitely eligible" .
    */



    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);

        System.out.println("Do you need a loan?");
        boolean loan = myScan.nextBoolean();

        if (loan==true){
            System.out.println("Whats your credit score?");
            int cridetScor = myScan.nextInt();

            if (cridetScor>800){
                System.out.println("The eligibility is Definitely eligible");

            } else if (cridetScor<=800&&cridetScor>=701) {
                System.out.println("The eligibility is Eligible");

            } else if (cridetScor<=700&&cridetScor>=600) {
                System.out.println("The eligibility is Maybe eligible");

            } else if (cridetScor<600) {
                System.out.println("The eligibility is Not eligible");

            }
        }else {
            System.out.println("The eligibility is Unknown");
        }


    }
}

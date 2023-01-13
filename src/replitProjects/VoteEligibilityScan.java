package replitProjects;

import java.util.Scanner;

public class VoteEligibilityScan {
    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);

        System.out.println("Please enter your age");
        int age = myScan.nextInt();

        if (age>=18){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }










    }
}

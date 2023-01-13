package replitProjects;

import java.util.Scanner;

public class AgeAndGenderMOrF2 {


        public static void main(String[] args) {

            Scanner myScan = new Scanner(System.in);


            System.out.println("Please enter your gender: M or F");
            String gender = myScan.next();

            System.out.println("enter your age");
            int age = myScan.nextInt();

            if (age>25&&gender.equals("F")){
                System.out.println("Women");

            } else if (age>25&&gender.equals("M")) {
                System.out.println("Man");

            } else if (age<25&&gender.equals("M")) {
                System.out.println("Boy");

            } else if (age<25&&gender.equals("F")) {
                System.out.println("Girl");

            }


        }
    }
























package replitProjects;

import java.util.Scanner;

public class GenderAge3 {
    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);

        System.out.println("Please enter your gender: M or F");
        String gender = myScan.next();

        System.out.println("Please enter your age");
        int age = myScan.nextInt();

        if (age > 25) {
            if (gender.equals("F")) {
                System.out.println("Woman");
            } else {
                System.out.println("Man");
            }
        }

        if (age < 25) {
            if (gender.equals("M")) {
                System.out.println("Boy");
            } else {
                System.out.println("Girl");
            }

        }


    }
}

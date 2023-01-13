package replitProjects;

import java.util.Scanner;

public class NestedAgeAndGenderScann {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        System.out.println("Please enter your gender: M or F");
        char gender = myScan.next().charAt(0);

        System.out.println("Please enter your age");
        int age = myScan.nextInt();

        if (age>25)
            if (gender=='F')
            System.out.println("Woman");

        if (age<25)
            if (gender=='F')
                System.out.println("Girl");

        if (age>25)
            if (gender=='M')
                System.out.println("Man");

        if (age<25)
            if (gender=='M')
                System.out.println("Boy");



















    }
}

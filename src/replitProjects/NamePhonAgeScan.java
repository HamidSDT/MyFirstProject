package replitProjects;

import java.util.Scanner;

public class NamePhonAgeScan {
    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = myScan.nextLine();


        System.out.println("Enter your mobile number");
        String phNumber = myScan.nextLine();


        System.out.println("Enter your age");
        int age = myScan.nextInt();

        System.out.println("Your name is "+name+", your age is "+age+" and your mobile number is "+phNumber);








    }
}

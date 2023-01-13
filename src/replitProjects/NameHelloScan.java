package replitProjects;

import java.util.Scanner;

public class NameHelloScan {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        System.out.println("Hello, please enter your name");
        String name = myScan.nextLine();


        System.out.println("Your name is "+name);




    }
}

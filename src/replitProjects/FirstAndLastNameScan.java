package replitProjects;

import java.util.Scanner;

public class FirstAndLastNameScan {
    public static void main(String[] args) {

        Scanner myscan = new Scanner(System.in);

        System.out.println("Please Enter First Name");
        String Fname = myscan.nextLine();


        System.out.println("Please Enter Last Name");
        String Lname = myscan.nextLine();

        System.out.println(Fname+" "+Lname);

    }
}

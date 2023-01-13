package HomeWork;

import java.util.Scanner;

public class CountryLanguage {
    public static void main(String[] args) {

        // Ask user to enter their country and capture it.
        // Once values are captured print which language user speaks.

        Scanner myScan = new Scanner(System.in);

        System.out.println("Where are you from?");
         String country = myScan.next();

        switch (country) {

         case "Afghanistan":
         case "afghanistan":
             System.out.println("You speak Pushtu/Dari");break;
         case "India":
         case "india":
             System.out.println("You speak Urdu");break;
         case "China":
         case "china":
             System.out.println("You speak Chinese "); break;
         default:
             System.out.println("unfamiliar ");


     }








    }
}

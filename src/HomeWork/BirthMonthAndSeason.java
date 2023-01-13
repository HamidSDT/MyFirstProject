package HomeWork;

import java.util.Scanner;

public class BirthMonthAndSeason {
    public static void main(String[] args) {
/* 4)Write a program for user to enter his/hers birth month. Based on the month define the season.
Example: if user is born in June, July or August → season =” Summer”.
At the end of the program we should see output as “You were born __
 */
        Scanner myScan = new Scanner(System.in);

        System.out.println("enter your birth month");
        String month = myScan.next();

        switch (month){
        case "December":
        case "december":
        case "January":
        case "january":
        case "February":
        case "february":
            System.out.println("you were born in winter");break;
        case "March":
        case "march":
        case "April":
        case "april":
        case "May"  :
        case "may"  :
            System.out.println("You were born in Spring"); break;

        case "June":
        case "june":
        case "July":
        case "july":
        case "August":
        case "august":
            System.out.println("You were born in Summer"); break;

        case "September" :
        case "september" :
        case "October" :
        case "october" :
        case "November" :
        case "november" :
            System.out.println("You were born in Fall"); break;

    }











    }
}

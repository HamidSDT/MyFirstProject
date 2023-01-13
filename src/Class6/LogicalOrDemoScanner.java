package Class6;

import java.util.Scanner;

public class LogicalOrDemoScanner {
    public static void main(String[] args) {

        Scanner myscan = new Scanner(System.in);

        System.out.println("please enter the day");
        String day = myscan.next();

        if (day.equals("Friday") || day.equals("Friday")||day.equalsIgnoreCase("Monday")){
            System.out.println("No Class today");

        } else if (day.equalsIgnoreCase("Saturday")||day.equalsIgnoreCase("Sunday"))  {
            System.out.println("Java Class");


        } else if (day.equalsIgnoreCase("Wednesday") ||day.equalsIgnoreCase("Tuesday")) {
            System.out.println("Manual Testing Class");

        } else if (day.equalsIgnoreCase("Thursday")) {
            System.out.println("Review Class");

        }else {
            System.out.println("Wrong day entered");
        }















    }





}

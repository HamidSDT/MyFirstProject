package replitProjects;

import java.util.Scanner;

public class GreatestOf3DistinctNumbers {
    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);

        System.out.println("Please enter 3 distinct numbers");
        int a = myScan.nextInt();
        int b = myScan.nextInt();
        int c = myScan.nextInt();


          if (a>b&&a>c){
              System.out.println(a+" is the largest number");
          }
           else if(b>a&b>c){
              System.out.println(b+" is Largest number");
          }
           else {
              System.out.println( "The largest number is "+c);
          }




















            }}



package HomeWork;

import java.util.Scanner;

public class WorkedYearsSalary {

    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);

        System.out.println("enter the numbers of worked years");
        int years = myScan.nextInt();

        System.out.println("enter your salary");
        int salary = myScan.nextInt();

        if (years>=5){
            System.out.println("eligible for bonus");

            if (salary>50000){
                System.out.println("bonus is 500");


            }else {
                System.out.println("bonus is 300");
            }
             }else{
            System.out.println("not eligible for bonus ");



            }}}









package replitProjects;

import java.util.Scanner;

public class LargeValueEvenNumber {
    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);

        System.out.println("Please enter a number");
    int num = myScan.nextInt();

        if (num%2==0){
        System.out.println("Value is even");

        if (num>1000){
            System.out.println("Even value is large");

        }else {
            System.out.println("even value is just right ");
        }
    }else {
        System.out.println("Value is odd");

        if (num>1000){
            System.out.println("odd value is large ");
        }else {
            System.out.println("odd value is just right");
        }




}}}

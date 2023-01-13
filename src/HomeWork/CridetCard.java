package HomeWork;

import java.util.Scanner;
                           //Create a Java program that will ask if user has a credit card or not.
public class CridetCard {   //If you user does not have a credit card then offer them. If they do have one ask what is balance on the card? If balance of the card is larger
    public static void main(String[] args) { //  than 1000, tell them to pay off immediately, otherwise you can tell them that they can spend more

        Scanner myscannr = new Scanner(System.in);

        System.out.println("do you a credit Card?");
        String cridetCard =  myscannr.nextLine();


        if (cridetCard.equals("no")){
            System.out.println("May we offer you one?");
             String offer = myscannr.nextLine();


        }else {
            if (cridetCard.equals("yes")){
            System.out.println("What is the balance on the card? ");
        }       int balance = myscannr.nextInt();


        if (balance>1000){
            System.out.println("pay it off immediately !");


        }else {
            System.out.println("you can spend more");
        }








    }
}}

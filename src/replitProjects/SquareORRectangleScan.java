package replitProjects;

import java.util.Scanner;
 //Write a program to take values of length and width from the user.Based on value define whether the shape is a square or rectangle.
public class SquareORRectangleScan {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        System.out.println("Please enter the length");
        int length = myScan.nextInt();

        System.out.println("Please enter the width");
        int width = myScan.nextInt();

        if( length==width){
            System.out.println("The shape of your object is Square");

        } else {
            System.out.println("The shape of your object is rectangle");
        }












    }
}

package Class5;

import java.util.Scanner;

public class SwichCaseCharScanDemo {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        System.out.println("Please enter your gender ");
        char gender = myScan.next().charAt(0);





        switch (gender){
            case 'M':
            case 'm' :   System.out.println("Male");break;
            case 'F':
            case 'f' :   System.out.println("Female"); break;
            default: System.out.println("Not specified ");
        }








    }
}

package Class5;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);

      /* Scanner ---> Name of the Class

      myScan ---> is just a variable like we create primitive variables
      =   -----> is assignment operator
      System.in  ---> tells the computer to read the data from keyboard.
       */

        System.out.println("Please enter your age");
        int age = myScan.nextInt();
        System.out.println("you are "+age+" years old");

        System.out.println("please enter your weight ");
        double weight = myScan.nextDouble();
        System.out.println("Your weight is "+weight+" Kgs");

        System.out.println("Are you hungry ?");
        boolean hungry = myScan.nextBoolean();
        System.out.println("Hungry "+hungry);


        System.out.println("please enter your gender ");
        char gender = myScan.next().charAt(0);  // 0 is giving the first letter of the world ,ex  if we right male, we get the first letter m
        System.out.println("Your gender is "+gender);


        System.out.println("Please enter your name");
        String name = myScan.next(); //
        System.out.println("Your name is "+name);

        myScan.nextLine();
        System.out.println("please enter your full name ");
        String fullname = myScan.nextLine();
        System.out.println("your full name is "+fullname);
        myScan.close(); // it's a good practice to close it







    }
}

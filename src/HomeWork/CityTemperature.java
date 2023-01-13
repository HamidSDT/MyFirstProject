package HomeWork;

import java.util.Scanner;

public class CityTemperature {
    public static void main(String[] args) {

        Scanner myscan = new Scanner(System.in);

        System.out.println("what city you live in?");
        String city = myscan.nextLine();


        System.out.println("whats the weather temperature ? ");

        double tempF = myscan.nextDouble();
        tempF = (tempF-32)/1.8;

        System.out.println("the weather temperature in "+city+ " is "+tempF+" Celsius");






    }
}

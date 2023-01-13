package day6Hw;

public class EvenNum20_1 {
    public static void main(String[] args) {
        //Print even numbers from 20 to 1 (2 ways)

     int number1 = 20;

     while (number1>1){
         System.out.println(number1);
         number1-=2      ;
     }
     System.out.println("-----------------------------");

     int number2 = 20;

     while (number2>1){

         if (number2%2==0){
             System.out.println(number2);
             number2=number2-2;
         }




     }






    }
}

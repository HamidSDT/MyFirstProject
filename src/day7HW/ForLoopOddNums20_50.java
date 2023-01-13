package day7HW;

public class ForLoopOddNums20_50 {
    public static void main(String[] args) {
        //Print odd numbers between 20 and 50 (2 ways)

        for (int i = 21; i <50 ; i+=2) {
            System.out.println(i);
        }
        System.out.println("******************");

        for (int x = 20; x <50 ; x++) {

            if (x %2 !=2 && x !=20){
                System.out.println(x);
            }

        }
    }
}

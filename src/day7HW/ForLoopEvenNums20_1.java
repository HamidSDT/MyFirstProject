package day7HW;

public class ForLoopEvenNums20_1 {
    public static void main(String[] args) {
        // Print even numbers from 20 to 1 (2 ways)

        for (int i = 20; i >1 ; i-=2) {
            System.out.println(i);
        }
        System.out.println("**********************************");

        for (int x = 20; x >1 ; x--) {

            if (x%2==0){
                System.out.println(x);
            }

        }
    }
}

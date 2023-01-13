package Class6;

public class WhileDemo5 {
    public static void main(String[] args) {

        int number = 1;

        boolean flag = true;

        while (flag){

            System.out.println(number);

            if (number>3){
                flag=false;  // here we are making the condition to become false so stop the loop from printing endlessly
            }
            number++;
        }









    }
}

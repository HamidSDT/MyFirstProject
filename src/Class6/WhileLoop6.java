package Class6;

public class WhileLoop6 {
    public static void main(String[] args) {

          boolean condition = true;
          int number = 0;
        while (condition){         // here condition is tru on boolean value, it will print out Hello one time
            System.out.println("Hello");
            if (number>3){
                condition=false;    // we made condition false and it not loops again
            }
          number ++;

        }




    }
}

package Class4;

public class NestedDemo5 {
    public static void main(String[] args) {
        int money = 1000;                  // we call it Nested because  there is an if condition  in another if condition
        String day = "Sunday";
        boolean mood = false;

        if (money > 700) { // if I click her nest to the curly brakes it will show where to do the (else) part curly bracket is, and that's where I can write the plan B for the else part

            if (mood) {
                System.out.println("lets go shopping");
            }else {
                System.out.println("I am not in a good mood ");
            }


        }else{
            System.out.println("lets save some money first");
        }

    }}
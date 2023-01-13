package Class4;

public class NestedIfDemo_06 {
    public static void main(String[] args) {

        int money = 1000;  // we call it Nested because  there is an if condition  in another if condition
        String day = "Sunday";
        boolean mood = false;

        if (money > 700) {

            if (mood) {
                System.out.println("lets go shopping");

            }else {
                System.out.println("My mood is off today");
            }

        } else {
            System.out.println("lets first save money");
        }






    }
}
package Class6;

public class LogicalOrDemo {
    public static void main(String[] args) {






        String day = "sunday";

        if (day.equals("Friday") || day.equals("Friday")||day.equalsIgnoreCase("Monday")){
            System.out.println("No Class today");

        } else if (day.equalsIgnoreCase("Saturday")||day.equalsIgnoreCase("Sunday"))  {
            System.out.println("Java Class");


        } else if (day.equalsIgnoreCase("Wednesday") ||day.equalsIgnoreCase("Tuesday")) {
            System.out.println("Manual Testing Class");

        } else if (day.equalsIgnoreCase("Thursday")) {
            System.out.println("Review Class");

        }else {
            System.out.println("Wrong day entered");
        }


    }
}

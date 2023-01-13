package Class4;

public class IfElsIfCondition {
    public static void main(String[] args) {

        //  we use this methode to check multipart conditions .
        int day = 8;


        if (day==1){
            System.out.println("Monday"); //If block
        }else if (day==2) {
            System.out.println("Tuesday"); // else block
        }else if(day==3){
            System.out.println("weekday");
        } else if (day==4) {
            System.out.println("Thursday");

        } else if (day==5) {
            System.out.println("Friday");
        } else if (day==6) {
            System.out.println("Saturday");

        } else if (day==7) {
            System.out.println("Sunday");
        } else {                          // this is if we want to get an output other than  the above condition we use else , if we don't use it, nothing will come in our output
            System.out.println("wrong day number");
        }


    }
}

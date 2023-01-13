package Class5;

public class LogicalOperator3AndDemo {
    public static void main(String[] args) {
                                           // even if  one condition is false overall result is false, we get the else block at output
      double mathSCore = 90.5;
        double historyScore = 91.5;
        double scienceScore = 90.5;


       /*   if (scienceScore>90){
            if (mathSCore>90){
                if (historyScore>90){
                    System.out.println("brilliant student ");
                }

            }
        }else {
            System.out.println("you need to work hard ");
        }*/



   if (mathSCore>90&&historyScore>90&&scienceScore>90){
       System.out.println("brilliant student ");

   }else {
       System.out.println("You need to work harder");
   }





    }
}

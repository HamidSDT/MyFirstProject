package Class7;

public class WorkdayTask {
    public static void main(String[] args) {
        /*Create a boolean variable workDay and assign true create int variable day and assign it to 1
As long as it is workDay print “I need a day off” and increase day.
Once day is 6 print “I do not need a day off anymore”





         */
      boolean workday = true;
      int day = 1;

      while (workday){

        if (day<=5){

            System.out.println("I need a day off");

        }else {
            System.out.println("I don't needa day off");
            workday = false;
        }
          day++;



      }






    }
}

package replitProjects;

import java.util.Scanner;

public class Replit37 {
    public static void main(String[] args) {
     /* Take 2 boolean inputs from a user:
"Are you thirsty?"

"Are you sleepy?"

If user is thirsty and not sleepy--> drink=water

If user is thirsty and sleepy--> drink=coffee

If user is not thirsty and sleepy --> drink=tea

Otherwise drink="nothing"

Output:
Looks like you need to drink \_\_\_
      */
        Scanner myScan = new Scanner(System.in);

        System.out.println("Are you thirsty?");
        boolean thirsty = myScan.nextBoolean();

        System.out.println("Are you sleepy");
        boolean sleepy = myScan.nextBoolean();

       if (thirsty&&sleepy){
           System.out.println("Looks like you need to drink coffee");
       } else if (thirsty&&!sleepy) {
           System.out.println("Looks like you need to drink water");

       } else if (!thirsty&&sleepy) {
           System.out.println("Looks like you need to drink tea");

       } else if (!thirsty&&!sleepy) {
           System.out.println("Looks like you need to drink nothing");

       }
    }
}

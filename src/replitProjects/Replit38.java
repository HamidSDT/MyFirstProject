package replitProjects;

import java.util.Scanner;

public class Replit38 {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
/* Prompt user with a question: "Is it weekend?"

If it is not a weekend --> subject="manual testing"

Otherwise --> subject="Java"

**Output**:

```
Today you will be learning ____
```




 */

        System.out.println("Is it weekend?");
        boolean weekend = myScan.nextBoolean();

        if (weekend){
            System.out.println("Today you will be learning Java");
        }else {
            System.out.println("Today you will be learning manual testing");
        }







    }
}

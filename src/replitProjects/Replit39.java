package replitProjects;

import java.util.Scanner;

public class Replit39 {
    public static void main(String[] args) {
/* A school has the following rules for grading system:
a. 1 to 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask the user to enter marks and print the corresponding grade.

**Example Output:**

```
Please enter your mark
```

```
Your grade is A
*/

        Scanner myScan = new Scanner(System.in);

        System.out.println("Please enter your mark");
        int marks = myScan.nextInt();

        if (marks>80){
            System.out.println("Your grade is A");

        } else if (marks>60&&marks<=80) {
            System.out.println("Your grade is B");

        } else if (marks>50&&marks<=60) {
            System.out.println("Your grade is C");

        } else if (marks>45&&marks<=50) {
            System.out.println("Your grade is D");

        } else if (marks>25&&marks<=45) {
            System.out.println("Your grade is E");

        } else if (marks>0&&marks<=25) {
            System.out.println("Your grade is F");

        } else if (marks<1) {
            System.out.println("Please enter valid mark");

        }


    }
}

package replitProjects;

import java.util.Scanner;

public class replit36Demo {
    public static void main(String[] args) {



  /*Prompt user to input two strings : "Please enter two strings"and two integers: "Please enter two numbers"

and make the comparisons:

- if int1 and int2 are equal **and** word1 and word2 are equal, output "AND"
- if int1 and int2 are equal **or** word1 and word2 are equal, output "OR"
- if int1 and int2 are **not** equal **and** word1 and word2 are **not** equal, output "NONE"

```
**Example input/output:**
word1: banana
word2: banana
int1: 2
int2: 2
Output: AND

   */

                Scanner myScan = new Scanner(System.in);

                System.out.println("Please enter tow Strings ");
                String word1 = myScan.nextLine();
                String word2 = myScan.nextLine();

                System.out.println("Please enter tow numbers");
                int number1 = myScan.nextInt();
                int number2 = myScan.nextInt();

                if (word1.equals(word2) && number1 == number2) {
                    System.out.println("AND");


                } else if (word1.equals(word2) || number1 == number2) {
                    System.out.println("OR");

                } else if (!word1.equals(word2)&&number1!=number2) {
                    System.out.println("NONE");

                }
            }

        }







package HomeWork;

import java.util.Scanner;

public class ScoresAndGrades {



        public static void main(String[] args) {
/*
        Write a program that will read three inputs of scores (quiz, midterm, and final scores)
        and determine the grade based on the following rules:
        if the average score >=90 → grade=A
        if the average score >= 70 and <90 → grade=B
        if the average score>=50 and <70 → grade=C
        if the average score<50 → grade=F*/



            Scanner myScan = new Scanner(System.in);

            System.out.println(" Enter your quiz score?");
            int quizScore = myScan.nextInt();

            System.out.println("Enter your midterm score:");
            int midtermScore = myScan.nextInt();

            System.out.println("Enter your final score");
            int finalscore = myScan.nextInt();
            int averageScore;

            averageScore = (quizScore+midtermScore+finalscore)/3;

            if  (averageScore >90) {

                System.out.println("Your average  score is "+averageScore+" it =s to grade A");
            }

            else if(averageScore >=70 && averageScore < 90 )
                System.out.println("Your average score is "+averageScore+" it =s to grade B");

            else if (averageScore >= 50 && averageScore <= 70) {

                System.out.println("Your average score is "+averageScore+" it =s to grade C");
            } else {
                System.out.println("Your average score is "+averageScore+" it =s to grade F");
            }
        }
    }



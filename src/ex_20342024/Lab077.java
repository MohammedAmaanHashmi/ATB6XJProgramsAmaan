package ex_20342024;

import java.util.Scanner;

public class Lab077 {
    public static void main(String[] args) {
        // ✅ Grade Calculator
        // Write a program that calculates and displays the letter grade for a given
        // numerical score (e.g., A, B, C, D, or F) based on the following
        // grading scale:
        //
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: 0-59


        // 1. Find the user Inputs
        // score - data type? - int
        // return -> grade -> data type -> char
        // // DAA- Ask for the confirmation of the doubts
        // Interviewer ->  int, char


        // 2. Basic Logic
        // if ( score >= 90 && score <= 100 ) -> return or print grade - A
        // else if score <=89 && score >= 80 -> return or orint grade - B
        // else -> grade -> F

        // 3. Write the code
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student score!!");
        int score = sc.nextInt();

        char grade = 'F';

        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score >= 80 && score <= 90) {
            grade = 'B';
        } else if (score >= 70 && score <= 80) {
            grade = 'C';
        } else if (score >= 60 && score <= 70) {
            grade = 'D';
        } else if (score<=0 && score > 100) {
            System.out.println("LOL!!, are you god?");
        } else {
            grade = 'F';
        }

        System.out.println("your grade is " + grade);

        sc.close();
    }
}

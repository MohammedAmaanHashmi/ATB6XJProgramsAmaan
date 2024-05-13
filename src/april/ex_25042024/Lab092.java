package april.ex_25042024;

import java.util.Scanner;

public class Lab092 {
    public static void main(String[] args) {

        //Programs to check Grade Based on Marks

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Marks");
        int marks = sc.nextInt();

        //90 -> 90/10 -> 9 -> A (90 - 100) -> A
        //90 -> 87/10 -> 8 -> B (80 - 89) -> B
        //90 -> 77/10 -> 7 -> C (70 - 79) -> C

        marks = marks / 10;

        switch (marks) {
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 1:
                System.out.println("F");
                break;
            default:
                System.out.println("None");
        }

    }
}

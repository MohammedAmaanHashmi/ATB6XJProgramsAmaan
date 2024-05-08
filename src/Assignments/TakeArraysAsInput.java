package Assignments;

import java.util.Scanner;

public class TakeArraysAsInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int size = sc.nextInt();
        int[] marks = new int[size];
        System.out.println("Enter Marks");
        for (int i = 0; i < size; i++) {
            marks[i] = sc.nextInt();
        }

        System.out.println("Printing Values of an array");
        for (int i = 0; i < size; i++) {
            System.out.println("Your marks is " + marks[i]);

        }

    }
}

package Assignments;

import java.util.Scanner;

public class TakeArraysAsInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter values in an Array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Printing Values of an array");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);

        }

    }
}

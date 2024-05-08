package Assignments;

import java.sql.SQLOutput;
import java.util.Scanner;

public class largestNumberInArray {

    public static void main(String[] args) {
        System.out.println("Enter the size of an array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr1 = new int[size];

        System.out.println("Enter values in an array");
        for (int i = 0; i < size; i++) {

            arr1[i] = sc.nextInt();
        }

        //  int[] arr1 = {30, 50, 4587, 90, 10, 100, 999};

        if (arr1[0] > arr1[1] && arr1[0] > arr1[2] && arr1[0] > arr1[3] && arr1[0] > arr1[4] && arr1[0] > arr1[5] && arr1[0] > arr1[6]) {
            System.out.println("Largest Number is " + arr1[0]);
        } else if (arr1[1] > arr1[2] && arr1[1] > arr1[3] && arr1[1] > arr1[4] && arr1[1] > arr1[5] && arr1[1] > arr1[6]) {
            System.out.println("Largest Number is " + arr1[1]);
        } else if (arr1[2] > arr1[3] && arr1[2] > arr1[4] && arr1[2] > arr1[5] && arr1[2] > arr1[6]) {
            System.out.println("Largest Number is " + arr1[2]);
        } else if (arr1[3] > arr1[4] && arr1[3] > arr1[5] && arr1[3] > arr1[6]) {
            System.out.println("Largest Number is " + arr1[3]);
        } else if (arr1[4] > arr1[5] && arr1[4] > arr1[6]) {
            System.out.println("Largest Number is " + arr1[4]);
        } else if (arr1[5] > arr1[6]) {
            System.out.println("Largest Number is " + arr1[5]);
        } else {
            System.out.println("Largest Number is " + arr1[6]);
        }


    }
}

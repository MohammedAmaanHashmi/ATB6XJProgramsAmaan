package Assignments;

import java.util.Scanner;

public class StoreArrayValues {
    public static void main(String[] args) {
        System.out.println("Enter first size of an Array");
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();

        int[] arr1 = new int[arraySize];

        System.out.println("Enter Values of first Array");
        for (int i = 0; i < arraySize; i++) {
            arr1[i] = sc.nextInt();
        }

        int arr2[] = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            arr2[i] = arr1[i]*2;
        }

        System.out.println("Print second array Value");
        for (int i = 0; i < arraySize; i++) {
            System.out.println(arr2[i]);
        }


    }
}

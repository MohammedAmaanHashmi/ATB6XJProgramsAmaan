package Assignments;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2");
        int num2 = sc.nextInt();
        System.out.println("Enter number 3");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("Number 1 is the greatest: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Number 2 is the greatest: " + num2);
        } else {
            System.out.println("Number 3 is the greatest: " + num3);
        }

        sc.close();

    }

}

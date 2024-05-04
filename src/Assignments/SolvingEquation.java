package Assignments;

import java.util.Scanner;

public class SolvingEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of num1");
        int num1 = sc.nextInt();
        System.out.println("Enter value of num2");
        int num2 = sc.nextInt();
        System.out.println("Enter value of num3");
        int num3 = sc.nextInt();
        double x = Math.pow(num1,2);
        double y = Math.pow(num2,2);
        int z = Math.abs(num3);
        double result = Math.cbrt(x + y - z);
        System.out.println(result);
    }
}

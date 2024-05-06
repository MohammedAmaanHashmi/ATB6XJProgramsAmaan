package Assignments;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1");
        double num1 = sc.nextDouble();

        System.out.println("Enter Number 2");
        double num2 = sc.nextDouble();

        System.out.println("Enter Arithmetic operation");
        String arithmeticOperation = sc.next();

        switch (arithmeticOperation) {
            case "addition":
                System.out.println(num1 + num2);
                break;
            case "subtraction":
                System.out.println(num1 - num2);
                break;
            case "multiplication":
                System.out.println(num1 * num2);
                break;
            case "division":
                System.out.println(num1 * num2);
                break;
            default:
                System.out.println("Not an Arithmetic function");
        }
    }
}

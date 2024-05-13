package may.ex_01052024;

import java.util.Scanner;

public class Lab124 {
    public static void main(String[] args) {
        // Program to perform Arithmetic Operations
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1");
        double num1 = sc.nextDouble();

        System.out.println("Enter Number 2");
        double num2 = sc.nextDouble();

        System.out.println("Enter Arithmetic operation");
        String arithmeticOperation = sc.next();

        switch (arithmeticOperation) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 * num2);
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}

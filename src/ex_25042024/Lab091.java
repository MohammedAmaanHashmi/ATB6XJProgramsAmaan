package ex_25042024;

import java.util.Scanner;

public class Lab091 {

    //91 because lab 90 I have written in the assignment package
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();

        System.out.println("Enter your age");
        int age = sc.nextInt();

        System.out.println("Enter your salary");
        double salary = sc.nextDouble();

        System.out.println("Your details are " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your salary is " + salary);

        sc.close();


    }
}

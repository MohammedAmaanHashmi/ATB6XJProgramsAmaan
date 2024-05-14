package Assignments.strings;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String value = sc.next();
        String temp = "";


        for (int i = value.length() - 1; i >= 0; i--) {
            temp = temp + value.charAt(i);
        }
        if (temp.equalsIgnoreCase(value)) {
            System.out.println("It is a palindrome ");
        } else {
            System.out.println("It is not a palindrome ");
        }
    }
}

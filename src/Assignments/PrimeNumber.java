package Assignments;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number");
        int num = sc.nextInt();
        int count = 0;
        if (num > 1) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println("It is a prime Number " + num);
            } else {
                System.out.println("It is not a prime number " + num);
            }
        } else {
            System.out.println("It is not a prime number " + num);
        }


    }
}

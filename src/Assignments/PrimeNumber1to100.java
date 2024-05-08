package Assignments;

import java.util.Scanner;

public class PrimeNumber1to100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        for (int j = 1; j <= 100; j++) {
            if (j > 1) {
                for (int i = 1; i <= j; i++) {
                    if (j % i == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    System.out.println("It is a prime Number " + j);
                } else {
                    System.out.println("It is not a prime number " + j);
                }
                count = 0;
            } else {
                System.out.println("It is not a prime number " + j);
            }

        }
    }
}

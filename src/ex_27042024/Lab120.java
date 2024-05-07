package ex_27042024;

import java.util.Scanner;

public class Lab120 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();

        long fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        System.out.println(fact);
        sc.close();


    }
}

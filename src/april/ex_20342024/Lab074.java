package april.ex_20342024;

import java.util.Scanner;

public class Lab074 {
    public static void main(String[] args) {
        //Taking an input from the user
        //Scanner class -
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        sc.close();

    }
}

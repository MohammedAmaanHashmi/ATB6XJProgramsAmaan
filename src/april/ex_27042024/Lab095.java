package april.ex_27042024;

import java.util.Scanner;

public class Lab095 {
    public static void main(String[] args) {
        // Largest in three Number
        //
        //
        //Program to find the Largest Among Three Numbers:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = sc.nextInt();

        System.out.println("Enter number 2");
        int num2 = sc.nextInt();

        System.out.println("Enter number 3");
        int num3 = sc.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("Number 1 is the greatest: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("Number 2 is the greatest: " + num2);
        } else {
            System.out.println("Number 3 is the greatest: " + num3);
        }

        //
        //? -> condition? (if true) -> do this: if false -> do that
        //num1 =90, num2=91, num3=199=100;

        int A = num1 > num2 ? num1 : num2;
        int B = num2 > num3 ? num2 : num3;

        int largestNumber = num1 > num2 ? A : B;
        System.out.println(largestNumber);

        sc.close();


    }
}

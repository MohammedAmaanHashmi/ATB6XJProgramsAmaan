package ex_27042024;

public class Lab110 {
    public static void main(String[] args) {
        System.out.println("Print the value of i, but I want to break when i =5");

        for (int i = 1; i <= 10; i++) {
          //  System.out.println("value of " + i);

            if (i == 5) {
                break;
            }

            System.out.println("value of " + i);

        }
        System.out.println("End");
    }
}

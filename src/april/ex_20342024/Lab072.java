package april.ex_20342024;

public class Lab072 {
    public static void main(String[] args) {
        boolean a = true;
        a = !a;

        if (2 + 2 >= 4) { // 4 > 4 or 4 == 4 -> true - or gate
            System.out.println("Inside the loop code will be execute when the condition is true");
        }

        System.out.println("This is Outside the loop, it  will be executed always false"+a);

    }
}

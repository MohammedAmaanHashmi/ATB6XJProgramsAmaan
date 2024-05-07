package ex_27042024;

public class Lab113 {
    public static void main(String[] args) {
        //Continue -> if this is true continue
        for (int i = 1; i <= 10; i++) { //10 times , i 0 to 9
            System.out.println(i);

            if (i == 5) {
                continue;
            }
            System.out.println("After!!");
        }
    }
}

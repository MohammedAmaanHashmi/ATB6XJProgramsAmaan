package may.ex_07052024;

public class Lab151 {
    public static void main(String[] args) {
        int r1 = sumOfTwo(1, 2);
        System.out.println(r1);
        int r2 = sumOfTwo(1, 2);
        System.out.println(r2);
        String r3 = sumOfTwo("Pramod", 2);
        System.out.println(r2);

    }

    static int sumOfTwo(int a, int b) {
        return a + b;
    }

    static String sumOfTwo(String a, int b) {
        return a + b;
    }


}

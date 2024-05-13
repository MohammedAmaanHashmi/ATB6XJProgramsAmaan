package april.ex_20042024;


public class Lab065 {
    public static void main(String[] args) {
        //Ternary Operator
        //? -if this do 1, if not this do 2;
        boolean result = 10 > 40 ? 10 > 40 : 40 > 10;
        System.out.println(result);

        int a = true ? 10 : 20;
        int a1 = (30 > 40) ? 10 : 20;
        System.out.println(a1);

        String str = 10 > 20 ? "10" : "Twenty";
        System.out.println(str);


    }
}

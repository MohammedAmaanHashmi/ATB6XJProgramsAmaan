package may.ex_07052024;

public class Lab156 {
    public static void main(String[] args) {
        System.out.println("Start of the program");
        System.out.println("End of the Program");

        main(10);
        main("pramod");
        //main(56.67); No matching
    }

    static void main(int a) {
        System.out.println(a);
    }

    static void main(String a) {
        System.out.println(a);
    }

    static String main(String[] a, String[] b) {
        System.out.println(a);
        return "Hello";
    }

    static void god() {
        main(new String[]{"12"});
    }

    static void giveMoneyBag() {
        System.out.println("Blessing!!");
    }

    static int giveMoneyFriend(int i) {
        //After 6 months
        i = i + 8;
        return i;
    }
}

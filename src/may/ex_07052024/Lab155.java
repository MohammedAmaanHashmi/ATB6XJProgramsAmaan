package may.ex_07052024;

public class Lab155 {

    public static void main(String[] args) {
        //1 Friend - money
        //1 Beg - money

        System.out.println("Start the program");
        int money = giveMoneyFriend(100);
        System.out.println(money);
        giveMoneyBeg();
        System.out.println("End of the program");
    }

    private static void giveMoneyBeg() {
        System.out.println("Blessing!");
    }

    private static int giveMoneyFriend(int i) {
        //After 6 months
        i = i + 8;
        return i;
    }


}


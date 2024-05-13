package april.ex_25042024;

public class Lab086 {
    public static void main(String[] args) {
        //JDK > 13
        int itemcode = 010;
        switch (itemcode) {
            case 001, 002, 003:
                System.out.println("Is is an electronic Gadget!");
                break;
            case 004, 005, 006:
                System.out.println("It is Mechanical Gadged!");
            default:
                System.out.println("None");
        }
    }
}

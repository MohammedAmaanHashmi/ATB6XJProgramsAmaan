package may.ex_21052024.staticKeyword;

public class Lab201 {
    //Static
    //Data member
    //Funciton
    //Class

    //Static loads when class is loaded.

    public static void main(String[] args) {
        ATB amit = new ATB();
        amit.id = "1";
        System.out.println(ATB.courseName);
    }

}


class ATB {
    static String courseName = "ATB";
    String id;
}

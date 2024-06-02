package may.ex_23052024;

public class Lab201 {
    public static void main(String[] args) {
        ATB amit = new ATB();
        amit.id = "1";
        System.out.println(ATB.courseName);
    }
}

class ATB {
    static String courseName = "ATB";
    String phoneNo;
}
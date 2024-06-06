package may.ex_23052024;

public class Lab201 {
    public static void main(String[] args) {
//        ATB amit = new ATB("9867821170");
//        ATB pramod=new ATB("+233123213");
//
//        amit.printDetails();
//        pramod.printDetails();
//        System.out.println(ATB.courseName);

        ATB ashok = new ATB("9867821140");

        ATB asho2 = new ATB("8286736447");
    }
}

class ATB {

    static {
        System.out.println("SIB - load one Time, class is loaded");
    }

    {
        System.out.println("IIB - instance initialization block. Loaded when Object is created");
    }

    static String courseName = "ATB"; //Static Variable
    String phoneNo; //Non Static, Instance Variable

    public ATB(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void printDetails() {
        System.out.println("Your Details -> " + this.phoneNo);
    }
}
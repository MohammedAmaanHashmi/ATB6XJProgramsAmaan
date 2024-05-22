package may.ex_14052024;

public class ATBPerson {
    //Variables
    String name; //Instance variable
    long phone;
    String email;
    boolean isMarried;

    public ATBPerson(String name, long phone, String email, boolean isMarried, String courseName) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.isMarried = isMarried;
        this.courseName = courseName;
    }


    public ATBPerson(String name) {
        this.name = name;
    }

    //param constructor
    ATBPerson(String givenName, long phoneNo) {
        System.out.println("Param Constructor");
        this.name = givenName;
        this.phone = phoneNo;
    }

    String courseName;

    void PrintDetails() {
        //int age=10;
        //sout(age);
        System.out.println("Printing details of the student");
    }

    //Constructor
    //default - Constructor

    ATBPerson() {
        System.out.println("Default - Constructor");
        //DC
        //Special Method with no return type
        //1 called, when you create new Object
        //It has same name as the className
        courseName = "ATB";
    }




}

package may.ex_11052024;

public class Person {

    //Attribute
    String name;
    byte age;
    long phone_no;
    String[] address;
    double height;
    float salary;
    String dob;
    String eye_color;


    //Behav/Functionality
    void Walk() {
        System.out.println("I can walk");
    }

    void talk(String msg) {
        System.out.println("I will say ->" + msg);
    }

    String sleep() {
        return "Sleeping";
    }

    String eat(String item) {
        return item;
    }

}

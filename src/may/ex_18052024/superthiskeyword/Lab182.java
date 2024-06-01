package may.ex_18052024.superthiskeyword;

public class Lab182 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
    }

}

class Student extends Person {
    //is A relation - Inheritance
    void message() {
        System.out.println("I am a Student message");
    }

    void display() {
    //    this.message();
        super.message();
    }
}

class Person {
    void message() {
        System.out.println("I am person message");
    }
}
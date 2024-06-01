package may.ex_18052024.superthiskeyword;

public class Lab181 {
    public static void main(String[] args) {
        // Super Keyword in java
        //Parent -> Child
        //Super keyword reference to parent class
        //Variable of parent
        //Method of the parent
        //Constructor of the parent
        Car c = new Car();
        System.out.println(c.maxSpeed);
        c.display();

    }

}

class Car extends Vehicle {
    int maxSpeed = 180;

    void display() {
        System.out.println("Max speed of Vehicle cane be -> " + super.maxSpeed);
        System.out.println("Max speed of car cane be -> " + this.maxSpeed);
    }
}

class Vehicle {
    int maxSpeed = 100; //Instance Variable

    void message() {
        System.out.println("This is vehicle class");
    }
}




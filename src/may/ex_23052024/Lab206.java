package may.ex_23052024;

public class Lab206 {

    public static void main(String[] args) {
        
    }


}

class Car {
    String make;

    public Car(String make) {
        this.make = make;
    }

    //Method
    void drive() {
        System.out.println("You can driver Car");
    }

    class Engine {
        //Instance Variables
        String horsePower;

        public Engine(String horsePower) {
            this.horsePower = horsePower;
        }

        //Method
        void start() {
            System.out.println("Engine is started!! -> " + make);
        }

    }
}

package may.ex_16052024.hierachicalInheritance.ex1;

public class Vehicle {
    public Vehicle() {
        System.out.println("DC Vehicle");
    }

    void vehicleHasTopSpeed() {
        System.out.println("Yeah from " + getClass().getSimpleName());
    }

}

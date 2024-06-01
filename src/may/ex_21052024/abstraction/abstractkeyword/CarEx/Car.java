package may.ex_21052024.abstraction.abstractkeyword.CarEx;

abstract class Car extends Engine {
    @Override
    void start() {
        System.out.println("Starting the car");
    }

    @Override
    void stop() {
        System.out.println("Stopping the car");
    }

    @Override
    void partGearBox() {
        System.out.println("Assemble the Gearbox");
    }

    @Override
    void openCar() {
        System.out.println("Open the car");
    }

    abstract void breakMechanism();
}

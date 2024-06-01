package may.ex_21052024.abstraction.interfaceKeyword;

public class Lab198 {
    public static void main(String[] args) {

        //Engine e1=new Engine();
        Car c1 = new Car();
        c1.startEngine();
        c1.applyBrake();
        c1.stopEngine();

        //Default
        c1.haltingEngineJustStart();
        c1.haltingEngineJustStop();
        c1.stopEngine();

        //Static function
        Engine.m1();
    }

}

package may.ex_21052024.abstraction.interfaceKeyword;

public interface Engine {
    void startEngine();

    void stopEngine();

    default void haltingEngineJustStart() {
        System.out.println("Halt the Engine");
    }

    default void haltingEngineJustStop() {
        System.out.println("Halt the Engine");
    }

    static void m1() {
        System.out.println("M1");
    }

    // complete function is not allowed in the Interface
//     void m1() {
//        System.out.println("M2");
//    }

}

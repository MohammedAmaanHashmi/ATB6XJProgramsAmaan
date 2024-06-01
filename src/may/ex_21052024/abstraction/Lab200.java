package may.ex_21052024.abstraction;

public class Lab200 {
}

class pramod extends B1 {

    @Override
    public void atb() {
        System.out.println("ATB completed");
    }

    @Override
    void mtb() {
        System.out.println("MTB Completed");
    }
}

abstract class B1 implements Course {
    abstract void mtb();
}

interface Course {
    void atb();
}



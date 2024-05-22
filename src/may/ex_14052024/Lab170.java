package may.ex_14052024;

public class Lab170 {
    public static void main(String[] args) {
        ATBPerson amitRef1 = new ATBPerson();
        System.out.println(amitRef1.name);
        ATBPerson swapnilRef1 = new ATBPerson();
        //Called - 2
        //Created -1 -> new ATB(CL)
        ATBPerson pramodRef = new ATBPerson("Pramod", 9867821170l);
        System.out.println(pramodRef.name);
        System.out.println(pramodRef.phone);
        ATBPerson ratulRef = new ATBPerson("Ratul", 8286736447l);
        System.out.println(ratulRef.name);
        System.out.println(ratulRef.phone);

    }
}

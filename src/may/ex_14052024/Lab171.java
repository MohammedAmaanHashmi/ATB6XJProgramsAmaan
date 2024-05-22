package may.ex_14052024;

public class Lab171 {
    public static void main(String[] args) {
        ATBPerson pramodRef = new ATBPerson("pramod", 9867821170l, "amaanhashmi25@gmail.com", false, "ATB6X");
        ATBPerson ratulRef = new ATBPerson("pramod", 828676447l, "ratul@gmail.com", true, "MTB");
        ratulRef.courseName = "ATB";

        for (int i = 0; i < 100; i++) {
            new ATBPerson("A" + i, 9867821170l, "amaanhashmi25@gmail.com", false, "ATB6X");
        }
    }


}


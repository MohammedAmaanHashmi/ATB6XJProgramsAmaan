package may.ex_07052024;

public class Lab157 {

    public static void main(String[] args) {
        f1();
        String[] name = {"pramod", "dutta"};
        String[] name2 = new String[2];
        name2[0] = "Asha";
        name2[0] = "Rama";
        f1(name);
        //Parameter - any Data type
        //Primitive -> byte, short, long, float, int, boolen
        //Non-primitive -> String, Arrays


    }

    static void f1(String[] a) {
//        for (String name : a) {
//            System.out.println(name);
//        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }


    static void f1() {
        f2();
        System.out.println("f1");
    }

    static void f2() {
        System.out.println("f2");
    }
}

package may.ex_07052024;

public class Lab149 {

    public static void main(String[] args) {
        //Function which will say Hi
        for (int i = 0; i < 100; i++) {
            sayHi();
            sayBye();
            rama();
        }
    }

    private static void rama() {
        System.out.println("rama");
    }

    private static void sayBye() {
        System.out.println("bye");
    }

    static void sayHi() {
        System.out.println("Hello Hi");
    }
}

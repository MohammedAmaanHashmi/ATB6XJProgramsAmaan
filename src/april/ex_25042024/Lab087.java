package april.ex_25042024;

public class Lab087 {
    public static void main(String[] args) {
        int itemcode = 001;
        //JDK -> 13
        switch (itemcode) {
            case 001 -> System.out.println("It is laptop");
            case 002 -> System.out.println("It is desktop");
            case 003, 004 -> System.out.println("It is mobile laptop");
            default -> System.out.println("Heloo!");
        }

        char ch = 'z';
        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println("Vowel");
            default -> System.out.println("Consonants");
        }

    }
}

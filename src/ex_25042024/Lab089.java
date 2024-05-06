package ex_25042024;

public class Lab089 {
    public static void main(String[] args) {

        char code = 'A';

        int val = switch (code) {
            case 'A':
                yield 65;
            case 'B':
                yield 78;
            default:
                System.out.println("Not able to find");
                throw new IllegalStateException("Error");

        };


    }
}

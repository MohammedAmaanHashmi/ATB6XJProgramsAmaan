package april.ex_20042024;

public class Lab064 {
    public static void main(String[] args) {
        String password = "Pramod@123";
        String pass_u = password.toLowerCase();
        System.out.println(pass_u);
        System.out.println(password == pass_u);
        System.out.println(password.equals(pass_u));
        System.out.println(password.equalsIgnoreCase(pass_u));
        System.out.println(password.substring(0, 3));
        System.out.println(password.indexOf("a"));

    }
}

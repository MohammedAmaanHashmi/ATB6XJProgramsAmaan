package may.ex_18052024.ecapsulation;

public class Lab191 {
    public static void main(String[] args) {
        vwoLogin v1 = new vwoLogin("admin", "admin123");
        //Hidden
        // System.out.println(v1.password); cannot access private data members
        //v1.username = "Pramod";
        System.out.println(v1.username);
    }

}

class vwoLogin {
    public String username;
    private String password;

    public vwoLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

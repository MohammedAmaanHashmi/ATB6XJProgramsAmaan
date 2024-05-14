package may.ex_04052024;

public class Lab143 {
    public static void main(String[] args) {
        String s1 = "Pramod"; //SCP
        String s2 = new String("Pramod"); //OA

        StringBuffer stringBuffer = new StringBuffer("Pramod");
        stringBuffer.append("Dutta");
        stringBuffer.reverse();
        System.out.println(stringBuffer);

        StringBuilder stringBuilder = new StringBuilder("Pramod");
        stringBuilder.append("Dutta");

        String password = "pass@123"; //2 Strings
        password = "123";             //2 Strings

        //Mutable  - that can be changed!!
        StringBuilder password2 = new StringBuilder("Pramod");
        password2.append("Dutta");
        System.out.println(password2); //1 Strings


    }
}

package ex_20042024;

public class Lab059 {
    public static void main(String[] args) {

        String name = "The Testing Academy"; //SCP
        String name1 = "The Testing Academy"; //SCP
        String name2 = new String("The Testing Academy"); //Heap area (OA)

        System.out.println(name == name1); //check the Ref ?
        System.out.println(name.equals(name1)); //check the values

        System.out.println(name == name2);
        System.out.println(name.equals(name2));
    }
}

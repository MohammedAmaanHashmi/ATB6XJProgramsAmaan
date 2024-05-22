package may.ex_14052024;

public class Lab169 {
    public static void main(String[] args) {
        ATBPerson objRef1 = new ATBPerson();
        System.out.println(objRef1.courseName);
        System.out.println(objRef1.isMarried);
        //DC are created to assign the value of Instance variable of the class

        //DC -> Problem -> I can't assing my values to the Instances

        ATBPerson pramod = new ATBPerson();
        System.out.println(pramod.name);

        ATBPerson swapnilRef = new ATBPerson();
        System.out.println(swapnilRef.name);
        System.out.println(swapnilRef.courseName);

    }
}

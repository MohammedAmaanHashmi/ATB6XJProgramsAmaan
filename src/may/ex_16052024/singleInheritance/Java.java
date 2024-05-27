package may.ex_16052024.singleInheritance;

public class Java extends Programming {

    //Single Inheritance - is A
    //Java is programming lang.
    //Python is a programming Lang.

    String newFeature;

    public Java() {
        System.out.println("DC");
    }

    public Java(String newFeature) {
        this.newFeature = newFeature;
    }

    void printInfo() {
        System.out.println("Feature is ->" + this.newFeature);
        bhk3();
    }

}

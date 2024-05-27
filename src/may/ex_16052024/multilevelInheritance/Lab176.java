package may.ex_16052024.multilevelInheritance;

public class Lab176 {

    public static void main(String[] args) {

//        GrandFather grandFather = new GrandFather();
//        grandFather.home();
//
//        Father father = new Father();
//        father.home();
//
//        Child c = new Child();
//        c.home();

        //Dynamic Dispatch
        GrandFather grandFather1 = new GrandFather();
        GrandFather grandFather2 = new Father();
        GrandFather grandFather = new Child();

        Father f1 = new Child();
        f1.home();

    }
}

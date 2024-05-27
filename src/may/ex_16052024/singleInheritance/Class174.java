package may.ex_16052024.singleInheritance;

public class Class174 {
    public static void main(String[] args) {
        // ## What  is inheritance
        //inherit Attributes and Behvaiour from the parent, Grand parent.

        //Superclass | parent class| Base class|
        //subclass | Child class| Derived class|

        //Parent -> child
        //Child  extend parent {}
        //Extend  keyword -> parent's Attributes are available  to the child(Class)

        //Single Inheritance
        //Parent -> Pro
        //Child -> Java

        Programming p = new Programming(12, "Ko pasan");
        Java j = new Java("lambda expressions");
        p.printInfo();
        j.printInfo();

        Programming p1 = new Programming(12, "Vu Russom");
        p1.printInfo();

        Python python =new Python();
        python.printInfo();


    }
}

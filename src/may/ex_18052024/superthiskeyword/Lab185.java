package may.ex_18052024.superthiskeyword;

public class Lab185 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        System.out.println("----");
        //Constructor chaining -> child DC -> parent's DC
        Dog d2 = new Dog("Lab");
        d2.display();
        System.out.println("----");
        Dog d3 = new Dog("Golden Retriever", "Dog TT");
        d3.display();
    }


}

class Animal {

    String type;
    int a;

    Animal() {
        System.out.println("Animal DC");
    }

    Animal(String type) {
        this.type = type;
        System.out.println("Animal PC");
    }
}

class Dog extends Animal {
    String breed;

    Dog() {
        System.out.println("Dog DC");
    }

    public Dog(String breed) {
        super("DOG Type");
        this.breed = breed;
    }

    public Dog(String breed, String type) {
        this("Breed Set by Dog only");
        this.breed = breed;
        System.out.println("PC with Two Arg");
    }


    public Dog(String breed, String type, int a) {
        this("Breed Set by Dog only", "Golden R");
        this.a = a;
        System.out.println("PC with Two Arg");
    }

    void display() {
        System.out.println("Type: " + super.type + ", Breed: " + this.breed);
    }
}

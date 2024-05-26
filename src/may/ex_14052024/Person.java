package may.ex_14052024;

public class Person {

    String name;
    int age;

    //Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person(Person person) {
        this.name = person.name;
        this.age = person.age;
    }

    public static void main(String[] args) {
        Person person1 = new Person("John", 30);
        Person person2 = new Person(person1);
        System.out.println(person2.name + " is " + person2.age + " years old");
    }
}
